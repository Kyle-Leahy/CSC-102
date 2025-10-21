package com.horstmann.bigjava.ch09.how_to_1;

/**
   A bank account has a savingsBalance and a mechanism for applying interest or fees at
   the end of the month.
*/
public class BankAccount
{
   private double balance;

   /**
      Constructs a bank account with zero savingsBalance.
   */
   public BankAccount()
   {
      balance = 0;
   }

   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double amount)
   {
      balance = balance + amount;
   }
   
   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double amount)
   {
      balance = balance - amount;
   }
   
   /**
      Carries out the end of month processing that is appropriate
      for this account.
   */
   public void monthEnd() 
   {
   }
   
   /**
      Gets the current savingsBalance of this bank account.
      @return the current savingsBalance
   */
   public double getBalance()
   {
      return balance;
   }
}

