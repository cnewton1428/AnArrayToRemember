package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write

        Scanner input = new Scanner(System.in); //object scanner to store input
        //Declare array to hold Strings
        String[] words = new String[5]; //declaration of array that holds words

        for (int index = 0; index < words.length; index++) {
            System.out.println("Enter a word");
            //Get input from user
            String wordInput = input.nextLine(); //word stores individual input from user
//
//            if (word.equalsIgnoreCase("history")) ;
//            //To print all elements of an array; need a loop
//            for (int i = 0; i < words.length; i++) {
//                System.out.println(words[i]); //print out words array
//
//            }
//        }else {
//            words[index] = words; //print all

            words[index] = wordInput; //get words input from user and print out all results
            //value of words array at index 0; value given (input) from user
        }
        //print out values in words array
        for (int i= 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
}
