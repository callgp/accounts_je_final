package com.je.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.je.entities.Account;
import com.je.service.AccountService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	
	
	 @GetMapping("/{accountNumber}")
	 public Account fetchAccountDetails(@PathVariable("accountNumber") int accountNumber) { 
		 log.info("acct controler ->fetchAccountDetails{}",accountNumber);
		 return accountService.fetchAccountDetails(accountNumber);
		 }
			 
	
}
