package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        WordDictionary wordDictionary = new WordDictionary();

        System.out.println("Choose number : ");
        System.out.println("1- Enter a Word");
        System.out.println("2- Exit");

        System.out.print("Enter your number : ");
        String chosenNumber = input.next();
        while (true) {
                if(chosenNumber.equals("1")) {
                    System.out.print("Enter your input : ");
                    String word = input.next();
                    if(word.equals("2")){
                        break;
                    } else if((word.trim().charAt(0) >= 65 && word.trim().charAt(0) <= 90) ||
                            (word.trim().charAt(0) >= 97 && word.trim().charAt(0) <= 122)) {
                        wordDictionary.addElement(word);
                    } else {
                        System.out.println("Invalid Word.");
                    }
                }else if(chosenNumber.equals("2")){
                    break;
                } else{
                    System.out.println("Invalid Chosen Number, please select 1 or 2.");
                    break;
                }
        }
        wordDictionary.printMapElements();

        System.out.print("Enter a letter to display its values : ");
        char keyLetter = input.next().toLowerCase().trim().charAt(0);

        wordDictionary.printWordsOfSpecificLetter(keyLetter);
    }
}