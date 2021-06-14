package ex34;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Valencia
 */

import java.util.*;

public class app {

    public static void main(String[] args){
        Scanner newScan = new Scanner(System.in);

        //Create and print given list
        String[] employees={"John Smith","Jackie Jackson","Chris Johns","Amanda Cullen","Jeremy Goodwin"};
        System.out.println("There are "+employees.length+" employees:");
        for(int i = 0; i < employees.length; i++)
            System.out.println(employees[i]);


        //Input
        System.out.print("Enter an employee name to remove: ");
        String remove=newScan.nextLine();

        //Output
        String[] newEmployeesList = removeEmployee(employees, remove);
        System.out.println("There are "+newEmployeesList.length+" employees:");
        for(int i = 0; i < newEmployeesList.length; i++)
            System.out.println(newEmployeesList[i]);

    }

    //Function to delete an employee for a list
    public static String[] removeEmployee(String[] employee, String remove){
        String[] newList = new String[employee.length-1];

        int indexInNewList=0;
        for(int i = 0; i < employee.length; i++)
            if(!employee[i].equals(remove)){
                newList[indexInNewList]=employee[i];
                indexInNewList++;
            }

        return newList;
    }

}