package com.humaid.aws.sns.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.humaid.aws.sns.dbHandler.balAndCounterDbHandler;
import com.humaid.aws.sns.model.balance;
import com.humaid.aws.sns.model.counter;

@RestController
public class balAndCountController {


	@GetMapping("/counter/1")
	public ResponseEntity<counter> getCounter1(){
		return ResponseEntity.ok().body(balAndCounterDbHandler.readCounterFromFile());
	}
	

	@GetMapping("/balance/1")
	public ResponseEntity<balance> getBalance1(){
		return ResponseEntity.ok().body(balAndCounterDbHandler.readBalFromFile());
	}
	

	@PutMapping("/counter/1")
	public ResponseEntity<Boolean> editCounter(@RequestBody counter count)
	{
		boolean Resp=balAndCounterDbHandler.reWriteCounterFile(count);
		return ResponseEntity.ok().body(Resp);
	}
	

	@PutMapping("/balance/1")
	public ResponseEntity<Boolean> editBalance(@RequestBody balance bal)
	{
		boolean Resp=balAndCounterDbHandler.reWriteBalanceFile(bal);
		return ResponseEntity.ok().body(Resp);
	}
	
	@GetMapping("/test")
	public ResponseEntity<Boolean> Test(){
		return ResponseEntity.ok().body(true);
	}
	
	
	
}
