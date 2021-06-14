package ex26;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Valencia
 */

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner newScan  = new Scanner(System.in);

        //Input
        System.out.print("What is your balance? ");
        double balance = newScan.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        double payment = newScan.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        double interestRate = newScan.nextDouble();

        System.out.println(output(balance, payment, interestRate));

    }

    public static int output(double interestRate, double balance, double payment) {

        int months = PaymentCalculator.calculateMonthsUntilPaidOff(interestRate, balance, payment);
        System.out.println(months);
        return months;
    }

}
