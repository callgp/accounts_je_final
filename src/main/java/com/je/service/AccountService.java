package com.je.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.je.entities.Account;
//import com.je.entities.Product;
import com.je.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	/*
	 * public Account createProduct(Account product) { Account
	 * dbProduct=accountRepository.save(product); return dbProduct;
	 * 
	 * } public Account fetchProduct(Integer id) { // TODO Auto-generated method
	 * stub return accountRepository.findById(id) .orElseThrow(()-> new
	 * RuntimeException("account not there in db")); } public Account
	 * updateProduct(Integer id, Account inputProduct) { // TODO Auto-generated
	 * method stub Account fetchDatabaseProduct = fetchProduct(id); //
	 * fetchDatabaseProduct.setName(inputProduct.getBranchAddress()); Account
	 * result=accountRepository.save(fetchDatabaseProduct); return result; } public
	 * void deleteProduct(Integer productId) { boolean isExists =
	 * accountRepository.existsById(productId); if(isExists) {
	 * accountRepository.deleteById(productId); } else { throw new
	 * RuntimeException("record not in the databases"); } }
	 */
	public Account fetchAccountDetails(int id) {
		// TODO Auto-generated method stub
		return accountRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("account not there in db"));
	}
}
