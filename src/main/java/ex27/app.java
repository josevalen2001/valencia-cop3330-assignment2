package ex27;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Valencia
 */

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        //Input
        System.out.print("Enter the first name: ");
        String firstName = newScan.nextLine();

        System.out.print("Enter the last name: ");
        String lastName = newScan.nextLine();

        System.out.print("Enter the ZIP code: ");
        String zipString = newScan.nextLine();

        System.out.print("Enter the employee ID: ");
        String employeeID = newScan.nextLine();

        //Output
        System.out.println(output(firstName, lastName, zipString, employeeID, isNameValid(firstName), isNameValid(lastName), isZipCodeValid(zipString), isEmployeeIdValid(employeeID)));


    }

    //Checks if a name is valid
    public static boolean isNameValid(String anyName) {

        if(anyName.length() == 0)
            return false;

        if(anyName.length() >= 2)
            return true;

        return false;
    }

    //Checks is the ZIP code is valid
    public static boolean isZipCodeValid(String zipCode) {

        if(zipCode.length() == 0)
            return false;

        for(int i = 0; i < zipCode.length(); i++)
            if(!(Character.isDigit(zipCode.charAt(i))))
                return false;

        return true;

    }

    //Checks if the employee ID is valid
    public static boolean isEmployeeIdValid(String employeeID){

        if(employeeID.length() != 7)
            return false;

        if(!(Character.isLetter(employeeID.charAt(0)) || Character.isLetter(employeeID.charAt(1))))
            return false;

        if(employeeID.charAt(2) != '-')
            return false;

        for(int i = 3; i < employeeID.length(); i++)
            if(!(Character.isDigit(employeeID.charAt(i))))
                return false;

        return true;

    }

    //Decides on the output depending on if the inputs are valid or not.
    public static String output(String firstName, String lastName, String zipCode, String employeeId, boolean isFirstNameValid, boolean isLastNameValid, boolean isZipCodeValid, boolean isEmployeeIdValid) {

        String outputFirstName = "";
        String outputLastName = "";
        String outputZipCode = "";
        String outputEmployeeID = "";
        String output = "";

        if(firstName.length() == 0)
            outputFirstName = "First name must be filled.\n";
        else if(!isEmployeeIdValid)
            outputFirstName = "The first name must be at least 2 characters long.\n";

        if(lastName.length() == 0)
            outputLastName = "Last name must be filled.";
        else if(!isLastNameValid)
            outputLastName = "The last name must be at least 2 characters long.\n";

        if(employeeId.length() == 0)
            outputEmployeeID = "Employee ID must be filled.\n";
        else if(!isEmployeeIdValid)
            outputEmployeeID = "The employee ID must be in the format AA-1234.\n";

        if(zipCode.length() == 0)
            outputZipCode = "ZIP code must be filled.\n";
        else if(!isZipCodeValid)
            outputZipCode = "The ZIP code must be a 5 digit number.\n";

        if(outputFirstName == "" && outputLastName == "" && outputZipCode == "" && outputEmployeeID == "")
            output = "There were no errors found";
        else
            output = outputFirstName + outputLastName + outputEmployeeID + outputZipCode;

        return output;


    }



}
