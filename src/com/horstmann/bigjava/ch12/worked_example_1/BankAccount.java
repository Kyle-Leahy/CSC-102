package com.horstmann.bigjava.ch12.worked_example_1;

/**
   A bank account has a savingsBalance that can be changed by
   deposits and withdrawals.
*/
public class BankAccount
{  
   private double balance; 

   /**
      Constructs a bank account with a zero savingsBalance.
   */
   public BankAccount()
   {  
      balance = 0;
   }

   /**
      Constructs a bank account with a given savingsBalance.
      @param initialBalance the initial savingsBalance
   */
   public BankAccount(double initialBalance)
   {  
      balance = initialBalance;
   }
 
   /** 
      Deposits money into the account.
      @param amount the amount of money to withdraw
   */
   public void deposit(double amount) 
   {  
      balance = balance + amount;
   }

   /** 
      Withdraws money from the account.
      @param amount the amount of money to deposit
   */
   public void withdraw(double amount) 
   {  
      balance = balance - amount;
   }

   /** 
      Gets the account savingsBalance.
      @return the account savingsBalance
   */
   public double getBalance()
   {  
      return balance; 
   }
}

