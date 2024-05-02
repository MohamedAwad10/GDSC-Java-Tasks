package org.example;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
//                               -----> Task2 <-----
public class WordsCount {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://liveexample.pearsoncmg.com/data/Lincoln.txt");

            // Read data From URL and store it in file
            try (InputStreamReader inputFile = new InputStreamReader(url.openStream());
                 BufferedReader bufferedInput = new BufferedReader(inputFile);
                 FileWriter fileWriter = new FileWriter("Lincoln.txt");
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                 ) {

                String line = "";
                while ((line = bufferedInput.readLine()) != null) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }

            } catch (FileNotFoundException e) {
                System.out.println("File Error : " + e.getMessage());
            } catch (IOException e) {
                System.out.println("IO Exception : " + e.getMessage());
            }

            // Count the number of words in the file
            try (Scanner scanner = new Scanner(new FileInputStream("Lincoln.txt"))) {
                int count = 0;
                while (scanner.hasNext()) {
                    scanner.next();
                    count++;
                }
                System.out.println("Number of words : " + count);

            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            }
        } catch (MalformedURLException e){
            System.out.println("URL Exception : "+ e.getMessage());
        }
    }
}
