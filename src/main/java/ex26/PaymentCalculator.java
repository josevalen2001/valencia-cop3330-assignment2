package ex26;

import java.lang.Math;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Valencia
 */

public class PaymentCalculator {


   public static double calculateMonthsUntilPaidOff (double interestRate, double balance, double payment) {

       double n = -(1/30) * Math.log(1 + balance/payment * (1 - (1 + Math.pow(1 + interestRate, 30)))) / Math.log(1 + interestRate);
       System.out.println(n);
       return n;

   }

}
