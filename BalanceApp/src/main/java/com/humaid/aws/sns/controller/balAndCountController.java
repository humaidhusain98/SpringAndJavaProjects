package com.humaid.aws.sns.controller;

import com.humaid.aws.sns.model.password;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


	@GetMapping("/password1234567890")
	public ResponseEntity<password> getPass(){
		return ResponseEntity.ok().body(balAndCounterDbHandler.readPasswordFromFile());
	}

	@PostMapping("/password1234567890")
	public ResponseEntity<Boolean> addPassword(@RequestParam String pass)
	{
		System.out.println(pass);
		password password=new password(pass);
		boolean Resp=balAndCounterDbHandler.reWritePassFile(password);
		return ResponseEntity.ok().body(Resp);
	}

	
	
}
