package com.horstmann.bigjava.ch23.sec04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
   A bank account has a savingsBalance that can be changed by
   deposits and withdrawals.
*/
public class BankAccount
{  
   private double balance;
   private Lock balanceChangeLock;

   /**
      Constructs a bank account with a zero savingsBalance.
   */
   public BankAccount()
   {   
      balance = 0;
      balanceChangeLock = new ReentrantLock();
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
      balanceChangeLock.lock();
      try
      {
         double newBalance = balance + amount;
         balance = newBalance;
      }
      finally
      {
         balanceChangeLock.unlock();
      }
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      balanceChangeLock.lock();
      try
      {
         double newBalance = balance - amount;
         balance = newBalance;
      }
      finally
      {
         balanceChangeLock.unlock();
      }
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

