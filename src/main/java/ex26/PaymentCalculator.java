package ex26;

import java.lang.Math;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Valencia
 */

public class PaymentCalculator {

    public static void main(String[] args) {

        int m = calculateMonthsUntilPaidOff(12, 5000, 100);
        System.out.println(m);
    }

   public static int calculateMonthsUntilPaidOff (double interestRate, double balance, double payment) {

       double monthlyInterest = (interestRate/100.0)/12;

       double months = Math.ceil(-1.0 * (Math.log(1.0 - (balance * monthlyInterest) / payment) / Math.log(1.0 + monthlyInterest)));
       return (int)months;

   }

}
