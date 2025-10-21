package com.horstmann.bigjava.ch06.sec03;

/**
   A class to monitor the growth of an investment that 
   accumulates interest at a fixed annual rate
*/
public class Investment
{
   private double balance;
   private double rate;
   private int year;

   /**
      Constructs an Investment object from a starting savingsBalance and
      interest rate.
      @param aBalance the starting savingsBalance
      @param aRate the interest rate in percent
   */
   public Investment(double aBalance, double aRate)
   {
      balance = aBalance;
      rate = aRate;
      year = 0;
   }

   /**
      Keeps accumulating interest until a target savingsBalance has
      been reached.
      @param targetBalance the desired savingsBalance
   */
   public void waitForBalance(double targetBalance)
   {
      while (balance < targetBalance)
      {
         year++;   
         double interest = balance * rate / 100;
         balance = balance + interest;
      }
   }

   /**
      Keeps accumulating interest for a given number of years.
      @param numberOfYears the number of years to wait
   */
   public void waitYears(int numberOfYears)
   {
      for (int i = 1; i <= numberOfYears; i++)
      {
         double interest = balance * rate / 100;
         balance = balance + interest;
      }
      year = year + numberOfYears;
   }

   /**
      Gets the current investment savingsBalance.
      @return the current savingsBalance
   */
   public double getBalance()
   {
      return balance;
   }

   /**
      Gets the number of years this investment has accumulated
      interest.
      @return the number of years since the start of the investment
   */
   public int getYears()
   {
      return year;
   }
}

