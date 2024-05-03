package org.example;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
//                               -----> Task2 <-----
public class WordsCount {
    public static void main(String[] args) {

        String link = "https://liveexample.pearsoncmg.com/data/Lincoln.txt";
        String fileName = "Lincoln.txt";

        readDataFromUrlAndStoreInFile(link, fileName);
        countWordsFromFile(fileName);

    }

    public static void readDataFromUrlAndStoreInFile(String link, String fileName){

        try {
            URL url = new URL(link);

            // Read data From URL and store it in file
            try (InputStreamReader inputFile = new InputStreamReader(url.openStream());
                 BufferedReader bufferedInput = new BufferedReader(inputFile);
                 FileWriter fileWriter = new FileWriter(fileName);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            ) {

                String line = "";
                while ((line = bufferedInput.readLine()) != null) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }

            } catch (FileNotFoundException e) {
                System.err.println("File Error : " + e.getMessage());
            } catch (IOException e) {
                System.err.println("IO Exception : " + e.getMessage());
            }
        } catch (MalformedURLException e){
            System.err.println("URL Exception : "+ e.getMessage());
        }
    }

    public static void countWordsFromFile(String fileName) {

        // Count the number of words in the file
        try (Scanner scanner = new Scanner(new FileInputStream(fileName))) {
            scanner.useDelimiter("[a-zA-Z']+");
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println("Number of words : " + count);

        } catch (FileNotFoundException e) {
            System.err.println("File Exception"+ e.getMessage());
        }
    }
}
