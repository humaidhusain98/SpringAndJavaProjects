package com.humaid.aws.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.humaid.aws.entity.Person;

@Repository
public class PersonRepos {

	@Autowired
	private DynamoDBMapper mapper;
	
	public Person addPerson(Person person) {
		mapper.save(person);
		return person;	
	}
	
	public Person findPersonByPersonId(String personid ) {
		return mapper.load(Person.class,personid);
	}
	
	public String deletePerson(Person person) {
		mapper.delete(person);
		return "person removed !!";
	}
	
	public String editPerson(Person person) {
		mapper.save(person,buildExpression(person));
		return "record updated ...";
		
		
		
	}
	
	public DynamoDBSaveExpression buildExpression(Person person) {
		DynamoDBSaveExpression dynamoDBSaveExpression=new DynamoDBSaveExpression();
		Map<String,ExpectedAttributeValue> expectedMap=new HashMap<>();
		expectedMap.put("personid",new ExpectedAttributeValue(new AttributeValue().withS(person.getPersonid())));
		dynamoDBSaveExpression.setExpected(expectedMap);
		return dynamoDBSaveExpression;
	}
	
}
