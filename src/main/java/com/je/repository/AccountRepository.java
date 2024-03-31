package com.je.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.je.entities.Account;

@Repository //optional
public interface AccountRepository extends JpaRepository<Account, Integer>{

}