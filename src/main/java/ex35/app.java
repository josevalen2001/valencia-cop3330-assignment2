package ex35;


/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Valencia
 */

import java.util.*;
import java.util.ArrayList;
import java.lang.Math;

public class app {

    public static void main(String[] args){
        Scanner newScan = new Scanner(System.in);

        ArrayList<String> people= new ArrayList<String>();

        //Input
        System.out.print("Enter a name: ");
        String person = newScan.nextLine();

        //Keep inputting names until user enters a blank
        while(person != "") {

            people.add(person);

            System.out.print("Enter a name: ");
            person = newScan.nextLine();
        }

        //Create a random number
        int rand = (int)Math.floor(Math.random()*(people.size()-0+1)+0);

        //Output
        System.out.print("The winner is... " + getRandomPerson(people, rand) + ".");
    }

    //Chooses a random name from the array of names
    public static String getRandomPerson(ArrayList<String> people, int randomNum){
        return people.get(randomNum);
    }


}