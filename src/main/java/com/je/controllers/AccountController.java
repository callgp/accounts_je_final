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

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1/accounts")
public class AccountController {

	//@Autowired
	private AccountService accountService;
	
	/*
	 * @PostMapping public Account CreateProduct(@RequestBody Account product) {
	 * return productService.createProduct(product); }
	 * 
	 * @GetMapping("/fetch/{id}") public Account fetchProduct(@PathVariable Integer
	 * id) { return productService.fetchProduct(id); }
	 * 
	 * @PutMapping("/update/{id}") public Account updateProduct(@PathVariable
	 * Integer id,@RequestBody Account product) { return
	 * productService.updateProduct(id,product); }
	 * 
	 * @DeleteMapping("/delete/{id}") public void
	 * deleteProduct(@PathVariable(value="id") Integer productId) {
	 * productService.deleteProduct(productId); }
	 */
	
	 @GetMapping("/fetch/{customerId}")
	 public Account fetchAccountDetails(@PathVariable("customerId") int customerId) { 
		 log.info("acct controler ->fetchAccountDetails{}",customerId);
		 return accountService.fetchAccountDetails(customerId);
		 }
			 
	
}
