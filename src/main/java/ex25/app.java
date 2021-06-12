package ex25;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Valencia
 */

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner newScan = new Scanner(System.in);

        //Input
        String password = "";

        System.out.print("Enter a password: ");
        password = newScan.nextLine();

        //Output
        System.out.println(output(password));

    }

    public static int passwordValidator(String password) {

        //Strength of password
        int strength = 0;

        //Keep track of numbers and special chars
        int numbers = 0;
        int special = 0;

        //If password is less than 8 chars...
        if(password.length() < 8) {

            //Strength is 1 (very weak) if password is made of letters
            if(password.charAt(0) >= 48 && password.charAt(0) <= 57)
                strength = 1;

            //Strength is 2 (weak) if password is made of numbers
            if((password.charAt(0) >= 65 && password.charAt(0) <= 90)
               ||(password.charAt(0) >= 97 && password.charAt(0) <= 122))
                strength = 2;
        }

        //If password is more than 8 chars
        else {

            //For each char is password...
            for(int i = 0; i < password.length(); i++) {

                //If the char is a digit add one to numbers
                if(password.charAt(i) >= 48 && password.charAt(i) <= 57)
                    numbers++;

                //If it's not a digit or a letter add one to special chars
                else if(!(password.charAt(i) >= 48 && password.charAt(i) <= 57) && !((password.charAt(i) >= 65 && password.charAt(i) <= 90)
                        ||(password.charAt(i) >= 97 && password.charAt(i) <= 122)))
                    special++;

            }

            //if the password has numbers its strength is 3 (strong)
            if(numbers > 0)
                strength = 3;

            //if the password has special chars its strength is 4 (very strong)
            if(special > 0)
                strength = 4;

        }

        //Return the strength of the password
        return strength;

    }

    public static String output(String password) {

        //Return the correct output statement depending on the strength of the password
        if (passwordValidator(password) == 1)
            return ("The password " + password + " is a very weak password");

        else if (passwordValidator(password) == 2)
            return ("The password " + password + " is a weak password");

        else if (passwordValidator(password) == 3)
            return ("The password " + password + " is a strong password");

        else
            return ("The password " + password + " is a very strong password");

    }

}
