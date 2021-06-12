package ex24;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {

        Scanner newScan = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        //Input
        String s1 = "";
        String s2 = "";

        System.out.print("Enter the first string: ");
        s1 = newScan.nextLine();

        System.out.print("Enter the first string: ");
        s2 = newScan.nextLine();

        //Output
        System.out.println(output(s1, s2));

    }

    public static boolean isAnagram(String s1, String s2) {

        //Variable to keep track of status
        boolean isAnagram = true;

        //Compare lengths as first test
        if(s1.length() != s2.length())
            isAnagram = false;

        else {

            //Turn strings into arrays to make them easier to compare chars
            char[] s1Array = new char[s1.length()];
            char[] s2Array = new char[s1.length()];

            for(int i = 0; i < s1.length(); i++) {

                //Add chars from words to arrays
                s1Array[i] = s1.charAt(i);
                s2Array[i] = s2.charAt(i);

            }

            //Sort the arrays to compare chars
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            //Compare chars in both arrays
            for(int i = 0; i < s1.length(); i++)
                if (s1Array[i] != s2Array[i]) {
                    isAnagram = false;
                    break;
                }
        }

        //Return
        return isAnagram;

    }

    public static String output(String s1, String s2) {

        if(isAnagram(s1, s2))
            return ("\"" + s1 + "\" and " + "\"" + s2 + "\" are anagrams.");

        return ("\"" + s1 + "\" and " + "\"" + s2 + "\" are not anagrams.");
    }

}
