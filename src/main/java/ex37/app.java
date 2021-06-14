package ex37;


/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Valencia
 */


import java.util.*;

//The randomness of this program doesn't allow me to create a test for it
public class app {

    public static void main(String[] args){
        Scanner newScan = new Scanner(System.in);

        //Input
        System.out.print("What's the minimum length? ");
        int length = newScan.nextInt();

        System.out.print("How many special characters? ");
        int special = newScan.nextInt();

        System.out.print("How many numbers? ");
        int num = newScan.nextInt();

        //Fix the length so that it goes by the parameters
        int min = (special+num)*2;
        int len = length;
        if(min > length){
            len=min;
        }

        //List of characters to be included
        String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        String[] specialChars = {"!","%","&","*", "^"};

        ArrayList<String> passwordCharacters = new ArrayList<String>();

        //Add some numbers, letters and characters to the list of characters used for the password
        int randomNum;
        for(int i = 0; i < num; i++){
            randomNum=(int)Math.floor(Math.random()*(9-0+1)+0);
            passwordCharacters.add(Integer.toString(numbers[randomNum]));
        }

        for(int i=0; i<special; i++){
            randomNum=(int)Math.floor(Math.random()*(4-0+1)+0);
            passwordCharacters.add(specialChars[randomNum]);
        }

        for(int i=0; i<len-(num+special); i++){
            randomNum=(int)Math.floor(Math.random()*(25-0+1)+0);
            passwordCharacters.add(letters[randomNum]);
        }

        //Output
        System.out.print("Your password is " + generatePassword(passwordCharacters));


    }

    //Function to generate a random password from a list of characters available for the password
    public static String generatePassword(ArrayList<String> passwordCharacters){

        String finalPassword = "";
        int randomNum;
        int length = passwordCharacters.size();

        //Add random characters from the list of characters to the final password
        while(length > 0) {
            randomNum = (int) Math.floor(Math.random() * ((length-1) - 0 + 1) + 0);

            finalPassword += passwordCharacters.get(randomNum);
            passwordCharacters.remove(passwordCharacters.get(randomNum));

            length--;
        }

        return finalPassword;
    }
}