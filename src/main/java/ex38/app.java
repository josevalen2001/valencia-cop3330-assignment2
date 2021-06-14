package ex38;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Valencia
 */

import java.util.*;
import java.lang.String;


public class app {

    public static void main(String[] args){

        Scanner newScan = new Scanner(System.in);

        //Input
        System.out.print("Enter a list of numbers, separated by space: ");
        String numbers = newScan.nextLine();

        int[] numberList=new int[numbers.length()];

        //For loop to convert the numbers in the input to an array without spaces
        String space = " ";
        int index = 0;
        for(int i = 0; i < numbers.length(); i++) {

            char current = numbers.charAt(i);
            String character = Character.toString(current);

            if(!character.equals(space)) {
                numberList[index]=Integer.parseInt(character);
                index++;
            }
        }

        //Output
        int[] evenNumbersList = getEvenNumbers(numberList);

        System.out.print("The even numbers are");
        for(int i = 0; i < evenNumbersList.length; i++)
            System.out.print(" "+ evenNumbersList[i]);

        System.out.print(".");

    }

    //Function to find even numbers in a list
    public static int[] getEvenNumbers(int[] numberList) {

        int numOfEvens = 0;
        for(int i = 0; i < numberList.length; i++)
            if(numberList[i] % 2 == 0 && numberList[i] != 0)
                numOfEvens++;

        int[] evenNumberList = new int[numOfEvens];
        int index = 0;
        for(int i = 0; i < numberList.length; i++)
            if (numberList[i] % 2 == 0 && numberList[i]!=0) {
                evenNumberList[index] = numberList[i];
                index++;
            }

        return evenNumberList;
    }

}