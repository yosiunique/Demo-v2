package com.example.Card_Order_testing.Service;

import org.springframework.stereotype.Service;

import com.example.Card_Order_testing.Entity.Account;
import com.example.Card_Order_testing.Repository.AccountData;

@Service
public class AppService {

    private final AccountData accountData;
    public AppService(AccountData accountData){
        this.accountData=accountData;
    }

public void save(Account account){

    accountData.save(account);
    
}

    
}
