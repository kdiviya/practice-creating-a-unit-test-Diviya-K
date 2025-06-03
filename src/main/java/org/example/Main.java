package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //create object for the scanner class to get the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age(less than 100): ");

        //Assign the user entered age to the variable "age"
        int age = scanner.nextInt();
        int yearsLeft = calculateYears(age); //calling the method
        scanner.close();
        System.out.println(yearsLeft + " years left to reach 100");

    }

    //method to calculate years
    public static int calculateYears(int age) {
        int years;
        return years = 100 - age;

    }

}