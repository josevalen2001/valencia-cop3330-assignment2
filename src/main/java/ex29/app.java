package ex29;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Valencia
 */

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        //Input
        int returnRate = 0;
        boolean valid = false;

        //Use a while loop to keep prompting for an input until its valid.
        while(valid == false){
            System.out.print("What is your rate of return? ");
            String temp = newScan.nextLine();

            boolean isNum = true;
            for(int i = 0; i < temp.length(); i++)
                if(!(Character.isDigit(temp.charAt(i))))
                    isNum = false;

            if(isNum == true && !(temp.equals("0"))) {
                returnRate = Integer.parseInt(temp);
                valid = true;
            }
        }

        System.out.println("It will take " + calculateYears(returnRate) + " years to double your investment.");

    }

    //Calculate the years it will take to double someones investment.
    public static double calculateYears(int returnRate){
        return 72.0/returnRate;
    }

}
