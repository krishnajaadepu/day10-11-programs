package com.bridgelabz;

public class Account {
	
    int accountBalance;                  

    //instance method
    void debitFromBalance(int debitAmount){    
        if(this.accountBalance < debitAmount){
            System.out.println("Debit amount exceeded account balance");
        }else{
           this.accountBalance = this.accountBalance - debitAmount;
            System.out.println(" Account balance after Amount debit : " + this.accountBalance );
        }
    }
    public static void main(String[] args) {
        Account sbi = new Account();    // creating the instance of Account class
        sbi.accountBalance = 50000;   // assigning value to instance variable.
        sbi.debitFromBalance(11000);
        sbi.debitFromBalance(1000);
    }
		
} 


