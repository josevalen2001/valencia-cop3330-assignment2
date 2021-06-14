package ex36;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Valencia
 */

import java.util.*;
import java.util.ArrayList;
import java.lang.Math;

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //INPUT
        System.out.print("Enter a number: ");
        String number=newScan.nextLine();

        //Keep taking input until user enters "done"
        while(!number.equals("done")) {

            numbers.add(Integer.parseInt(number));

            System.out.print("Enter a number: ");
            number=newScan.nextLine();
        }

        //Output
        System.out.print("\nNumbers: ");
        if(numbers.size()!=0)
            System.out.print(numbers.get(0));
        for(int i = 1; i < numbers.size(); i++)
            System.out.print(", "+numbers.get(i));

        System.out.print("\nThe average is: "+findAverage(numbers)+"\nThe minimum is: "+findMin(numbers)+"\nThe maximum is: "+findMax(numbers)+"\nThe standard deviation is: "+String.format("%.2f",findStandardDeviation(numbers)));

    }

    //Function to find the smallest of the numbers
    public static int findMin(ArrayList<Integer> numbers){
        int min = 0;

        if(numbers.size() > 0)
            min = numbers.get(0);

        for(int i = 0; i < numbers.size(); i++)
            if(min>=numbers.get(i))
                min=numbers.get(i);

        return min;
    }

    //Function to find the largest of the numbers
    public static int findMax(ArrayList<Integer> numbers){
        int max = 0;

        for(int i = 0; i < numbers.size(); i++)
            if(max <= numbers.get(i))
                max = numbers.get(i);

        return max;
    }

    //Function to find the average of the numbers
    public static double findAverage(ArrayList<Integer> numbers){
        double avg=0;

        for(int i=0; i<numbers.size(); i++)
            avg += numbers.get(i);

        avg = avg/(double)numbers.size();
        return avg;
    }

    //Function to find standard deviation of the numbers
    public static double findStandardDeviation(ArrayList<Integer> numbers){
        double total = 0;
        double mean = findAverage(numbers);

        for(int i=0; i<numbers.size(); i++)
            total += (numbers.get(i)-mean)*(numbers.get(i)-mean);


        double standardDeviation = Math.sqrt(total/numbers.size());

        standardDeviation = Math.round(standardDeviation * 100.0) / 100.0;

        return standardDeviation;
    }


}