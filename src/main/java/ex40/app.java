package ex40;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gracie Bliss
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

//Class is basically just inputting and printing so I did no test for it.
public class app {

    public static void main(String[] args){
        Scanner newScan = new Scanner(System.in);

        //Arrays with given data
        String[] lastNames = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};
        String[] firstNames = {"John","Tou","Michaela","Jake","Jacquelyn","Sally"};

        //Array for employees that match the search
        ArrayList<String> lastNamesList  = new ArrayList<String>();

        //Input
        System.out.print("Enter a search string: ");
        String search = newScan.nextLine();

        for(int i=0; i< lastNames.length;i++){
            if(lastNames[i].toLowerCase().contains(search.toLowerCase()) || firstNames[i].toLowerCase().contains(search.toLowerCase())){
                lastNamesList.add(lastNames[i]);
            }
        }

        //Make a map to be able to retrieve an object employee by their name
        HashMap<String, Employee> employees = new HashMap<String, Employee>();

        for(int i=0; i<lastNamesList.size(); i++){
            if(lastNamesList.get(i).equals("Jackson"))
                employees.put(lastNamesList.get(i), createEmployee("Jacquelyn", "Jackson", "DBA", ""));

            if(lastNamesList.get(i).equals("Jacobson"))
                employees.put(lastNamesList.get(i), createEmployee("Jake", "Jacobson", "Programmer", ""));

            if(lastNamesList.get(i).equals("Johnson"))
                employees.put(lastNamesList.get(i), createEmployee("John", "Johnson", "Manager", "2016-12-31"));

            if(lastNamesList.get(i).equals("Michaelson"))
                employees.put(lastNamesList.get(i), createEmployee("Michaela", "Michaelson", "District Manager", "2015-12-19"));

            if(lastNamesList.get(i).equals("Webber"))
                employees.put(lastNamesList.get(i), createEmployee("Sally", "Webber", "Web Developer","2015-12-18" ));

            if(lastNamesList.get(i).equals("Xiong"))
                employees.put(lastNamesList.get((i)), createEmployee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        }

        //Output
        for(int i=0; i<lastNamesList.size();i++){
            System.out.println(employees.get(lastNamesList.get(i)).firstName + " " + employees.get(lastNamesList.get(i)).lastName + " " + employees.get(lastNamesList.get(i)).position + " " + employees.get(lastNamesList.get(i)).separationDate);
        }
    }
    public static Employee createEmployee(String firstName, String lastName, String position, String separationDate){

        Employee ret = new Employee();

        ret.firstName = firstName;
        ret.lastName = lastName;
        ret.position = position;
        ret.separationDate = separationDate;

        return ret;
    }
}