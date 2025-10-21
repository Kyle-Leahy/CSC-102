package com.horstmann.bigjava.ch08.special_topic_1;

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
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      balance = balance + amount;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      balance = balance - amount;
   }

   /**
      Gets the current savingsBalance of the bank account.
      @return the current savingsBalance
   */
   public double getBalance()
   {   
      return balance;
   }

   /**
      Transfers money from this account and tries to add it
      @param amount the amount of money to transfer
      @param otherBalance savingsBalance to add the amount to
   */
   void transfer(double amount, double otherBalance) 
   {
      balance = balance - amount;
      otherBalance = otherBalance + amount;
         // Won’t update the argument
   }  

   /**
      Transfers money from this account to another.
      @param amount the amount of money to transfer
      @param otherAccount account to add the amount to
   */
   public void transfer(double amount, BankAccount otherAccount) 
   {
      balance = balance - amount;
      otherAccount.deposit(amount);
   } 

   public void transfer2(double amount, BankAccount otherAccount)
   {
      balance = balance - amount;
      double newBalance = otherAccount.balance + amount;
      otherAccount = new BankAccount(newBalance); // Won’t work
   }
}

