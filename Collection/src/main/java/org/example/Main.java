package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedHashMap<Character, ArrayList<String>> myMap = new LinkedHashMap<>();

        boolean flag = true;
        while (flag) {
            System.out.println("Choose number : ");
            System.out.println("1- Enter A Word");
            System.out.println("2- Exit");
            System.out.print("Enter your number : ");
            try {
                int choosen = input.nextInt();
                switch (choosen) {
                    case 1:
                        System.out.print("Enter your word : ");
                        String word = input.next();
                        ArrayList<String> words;
                        Character firstLetter = word.toLowerCase().charAt(0);
                        if (!myMap.containsKey(firstLetter)) {
                            words = new ArrayList<>();
                            words.add(word);
                            myMap.put(firstLetter, words);
                        } else {
                            myMap.get(firstLetter).add(word);
                        }
                        Collections.sort(myMap.get(firstLetter));
                        System.out.println("word added successfully.");
                        break;
                    default:
                        flag = false;
                        break;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input.");
            }
            input.nextLine();
        }

        printMapElements(myMap);

        System.out.print("Enter a letter to display its values : ");
        char keyLetter = input.next().charAt(0);
        printWordsOfSpecificLetter(myMap, keyLetter);
//        System.out.println(myMap);
    }

    public static void printMapElements(LinkedHashMap map) {
        System.out.println("Map Printing : ");
        for(Object letter: map.keySet()){
            String key = letter.toString();
            String value = map.get(letter).toString();
            System.out.println(key+ " -> "+value);
        }
    }

    public static void printWordsOfSpecificLetter(Map map, char letter) {
        if(map.containsKey(letter)){
            System.out.println("Words of specific letter \'"+letter+"\' you choose from Map : ");
            ArrayList<String> wordsList =(ArrayList) map.get(letter);
            for(String word : wordsList){
                System.out.println("- "+word);
            }
        } else {
            System.out.println("This letter \'"+letter+"\' is not exist in the map.");
        }
    }
}