package com.horstmann.bigjava.ch10.programming_tip_1;

/**
   A bank account has a savingsBalance that can be changed by
   deposits and withdrawals.
*/
public class BankAccount implements Comparable
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

   public int compareTo(Object otherObject)
   {
      BankAccount other = (BankAccount) otherObject;
      return Double.compare(balance, other.balance);
   }

   public String toString()
   {
      return "BankAccount[savingsBalance=" + balance + "]";
   }
}

