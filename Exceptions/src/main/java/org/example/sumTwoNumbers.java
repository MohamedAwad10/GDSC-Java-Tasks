package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
//                                ----->  Task 1  <-----
public class sumTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, sum = 0;

        while(true) {
            try{
                System.out.print("Enter 1st Number : ");
                num1 = input.nextInt();
                System.out.print("Enter 2nd Number : ");
                num2 = input.nextInt();
                sum = num1 + num2;
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid Input please enter integers only.");
                input.nextLine();
            }
        }
        System.out.println("Sum = "+ sum);
    }
}
