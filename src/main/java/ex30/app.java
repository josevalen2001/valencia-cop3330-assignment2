package ex30;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Valencia
 */

import java.util.Scanner;

//NO TEST NEEDED FOR THIS CLASS.
public class app {

    public static void main(String[] args) {


        //Use nested for loops to multiply and print.
        for(int i = 1; i <= 12; i++) {

            if(i != 1)
                System.out.println();

            for (int j = 1; j <= 12; j++) {

                if((i*j) >= 1 && (i*j) < 10)
                    System.out.print("    " + (i*j));

                else if((i*j) >= 10 && (i*j) < 100)
                    System.out.print("   " + (i*j));

                else
                    System.out.print("  " + (i*j));

            }
        }

    }

}
