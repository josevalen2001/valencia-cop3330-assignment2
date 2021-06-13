package ex28;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Valencia
 */

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        //Input (Use for loop to ask for various numbers and an array to save them)
        int[] numArray = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            numArray[i] = newScan.nextInt();
        }

        //Output
        System.out.println("The total is " + sum(numArray) + ".");

    }

    //Function that adds the values that were given for an input
    public static int sum(int[] numArray){

        int sum = 0;
        for(int i = 0; i < numArray.length; i++)
            sum += numArray[i];

        return sum;

    }





}
