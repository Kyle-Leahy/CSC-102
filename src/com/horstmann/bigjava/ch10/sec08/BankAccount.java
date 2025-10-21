package com.horstmann.bigjava.ch10.sec08;

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
      double newBalance = balance + amount;
      balance = newBalance;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      double newBalance = balance - amount;
      balance = newBalance;
   }

   /**
      Gets the current savingsBalance of the bank account.
      @return the current savingsBalance
   */
   public double getBalance()
   {   
      return balance;
   }
}

