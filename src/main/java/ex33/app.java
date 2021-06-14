package ex33;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Valencia
 */

import java.util.*;
import java.lang.Math;

public class app {
    public static void main(String[] args){
        Scanner newScan=new Scanner(System.in);

        String[] outputs = {"Yes.","No.","Maybe.","Ask again later."};

        //Input
        System.out.print("What is your question? ");
        String question=newScan.nextLine();

        int randomNum = (int)Math.floor(Math.random()*(3-0+1)+0);
        String answer = output(outputs, randomNum);

        //Output
        System.out.println(answer);
    }

    //Functions chooses one of the possible outputs to return
    public static String output(String[] outputs, int randomNum){

        return outputs[randomNum];
    }



}