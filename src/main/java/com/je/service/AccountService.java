package com.je.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.je.controllers.AccountController;
import com.je.entities.Account;
//import com.je.entities.Product;
import com.je.repository.AccountRepository;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public Account fetchAccountDetails(int accountNumber) {
		// TODO Auto-generated method stub
		 log.info("acct service ->findById{}",accountNumber);
		return accountRepository.findById(accountNumber)
				.orElseThrow(()-> new RuntimeException("account NUMBER not there in db"));
	}
}
