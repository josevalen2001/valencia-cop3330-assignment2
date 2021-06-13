package ex31;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Valencia
 */

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        //Input
        int age = 0;
        int restingRate = 0;
        System.out.print("What is your age: ");
        age = newScan.nextInt();
        System.out.print("What is your resting heart rate: ");
        restingRate = newScan.nextInt();

        //Output
        System.out.println("\n");
        output(age, restingRate);

    }

    //Function calculates target range using formula given
    public static int calculateTargetRate(int age, int restingRate, double intensity) {
        int targetRate = (int)(((220 - age) - restingRate) * intensity) + restingRate;
        return targetRate;
    }

    //Use prints and loops to output the desired information as a table
    public static void output(int age, int restingRate) {

        System.out.println("Resting pulse: " +restingRate + "        Age: "+ age + "\n");
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");
        for(int i = 55; i <= 95; i+=5) {
            double intensity = i/100.0;
            System.out.println(i + "%          | " + calculateTargetRate(age, restingRate, intensity) + " bpm");
        }

    }

}
