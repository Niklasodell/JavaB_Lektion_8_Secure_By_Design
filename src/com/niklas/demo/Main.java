package com.niklas.demo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        int final AGE;

        int AGE = 25;




        System.out.println(Classes.MAGE.description);
        System.out.println(Classes.WARRIOR.description);




        Scanner sc = new Scanner(System.in);

        // Variables
        String myRegex = "^(?=.*[0-9].*[a-z]{2}).*$";

        while (true) {
            System.out.println("Type something");
            System.out.println("Regex is: " + myRegex);

            boolean doesMatch = Pattern.matches(myRegex, sc.nextLine());

            if (doesMatch) {
                System.out.println("Success");
            } else {
                System.out.println("Failure");
            }

        }

    }

}
