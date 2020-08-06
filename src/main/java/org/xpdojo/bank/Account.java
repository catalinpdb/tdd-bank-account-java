package org.xpdojo.bank;

public class Account {

    private  int balance = 0;

    public int balance(){
        return balance;
    }

    public Integer deposit(int amount){
        balance = balance + amount;

        return balance;
    }


}
