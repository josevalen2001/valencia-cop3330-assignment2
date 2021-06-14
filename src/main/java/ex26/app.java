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
        double interestRate = newScan.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        double payment = newScan.nextDouble();

        System.out.println("It will take " + output(interestRate, balance, payment) + " months to pay off this card.");

    }

    public static int output(double interestRate, double balance, double payment) {

        int months = PaymentCalculator.calculateMonthsUntilPaidOff(interestRate, balance, payment);
        return months;
    }

}
