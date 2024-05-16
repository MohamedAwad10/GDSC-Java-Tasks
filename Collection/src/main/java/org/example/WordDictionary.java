package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordDictionary {
    private LinkedHashMap<Character, ArrayList<String>> myMap;
    public WordDictionary(){
        myMap = new LinkedHashMap<>();
    }

    public void addElement(String word){
        ArrayList<String> words;
        Character firstLetter = word.toLowerCase().trim().charAt(0);
        if (!myMap.containsKey(firstLetter)) {
            words = new ArrayList<>();
            words.add(word);
            myMap.put(firstLetter, words);
        } else {
            myMap.get(firstLetter).add(word);
        }
    }


    public void printMapElements() {
        if(!myMap.isEmpty()){
            System.out.println("Map Printing : ");
            for(Character letter: myMap.keySet()) {
                String key = letter.toString();
                ArrayList<String> value = myMap.get(letter);
                Collections.sort(value);
                System.out.println(key + " -> " + value);
            }
        } else {
            System.out.println("Map Is Empty, please add some words in the map first.");
        }
    }

    public void printWordsOfSpecificLetter(char letter) {
        if(myMap.containsKey(letter)){
            System.out.println("Words of specific letter \'"+letter+"\' you choose from Map : ");
            ArrayList<String> wordsList =myMap.get(letter);
            for(String word : wordsList){
                System.out.println("- "+word);
            }
        } else {
            System.out.println("This letter \'"+letter+"\' is not exist in the map.");
        }
    }
}
