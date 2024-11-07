package com.example.Card_Order_testing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Card_Order_testing.Entity.Account;

@Repository
public interface AccountData extends JpaRepository<Account ,Long>{
    
}
