package com.humaid.aws.sns.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.humaid.aws.sns.dbHandler.transactDbHandler;
import com.humaid.aws.sns.model.Transact;

@RestController
@RequestMapping("/transactions")
public class transactionController {

	
	@GetMapping
	public ResponseEntity<List<Transact>> getAllTransaction(){
		List<Transact> transactList= transactDbHandler.readTransactionsFromFile();
		return ResponseEntity.ok().body(transactList);
		
	}
	

	@PostMapping
	public ResponseEntity<Boolean> postTransaction(@RequestBody Transact transact)
	{
		Boolean resp = transactDbHandler.addTransactionToFile(transact);
		return ResponseEntity.ok().body(resp);
	}
	

	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteTransaction(@PathVariable int id)
	{
		List<Transact> transactList= transactDbHandler.readTransactionsFromFile();
		for(int i=0;i<transactList.size();i++) 
		{
			if(transactList.get(i).getId()==id) 
			{
				transactList.remove(i);
				transactDbHandler.reWriteTransactionFile(transactList);
				return ResponseEntity.ok().body(true);
			}
		}
		return ResponseEntity.ok().body(false);
	}
	
	
	
	
}
