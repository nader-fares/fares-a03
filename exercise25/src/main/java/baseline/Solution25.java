/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */

/*
Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.

Constraints
Create a passwordValidator function that takes in the password as its argument and returns a numeric value you can evaluate to determine the password strength.
Use a single output statement.
 */
package baseline;


import java.util.Scanner;

public class Solution25 {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution25 app = new Solution25();

        displayDirections();

//        declare and ask for password
        System.out.print("Enter your password: ");
        String password = input.nextLine();

        //declare string passwordStrength
        String passwordStrength;

//      check password strength
        int passwordStrengthLevel = app.passwordValidator(password);
        // switch statement set passwordStrength based on returned int
        switch (passwordStrengthLevel) {
            case 1: passwordStrength = "very weak";
                    break;
            case 2: passwordStrength = "weak";
                break;
            case 3: passwordStrength = "strong";
                break;
            case 4: passwordStrength = "very strong";
                break;
            default: passwordStrength = "unknown strength";
                break;
        }

        //print results
        System.out.println("The password '" + password + "' is a " + passwordStrength + " password.");

    }

    //        display directions
    public static void displayDirections() {
        System.out.println("This program will determine the complexity of the password you enter based on a certain criteria.");
    }

    // check password strength
    // returns int based on strength
    // returns 1-4 ranging from very weak to very strong
    // returns 0 if it does not meet any of those rules
    public int passwordValidator(String password) {
        if (password.matches("[0-9]+") &&
                password.length() < 8)
            return 1;

        else if (password.matches("[a-z]+") &&
                password.length() < 8)
            return 2;

        else if (password.length() >= 8 &&
                password.replaceAll("[^0-9]", "").length() >= 1 &&  //checks if the string contains numbers
                password.replaceAll("[^a-z]", "").length() >= 1 &&  //checks if the string contains letters
                password.replaceAll("[^a-zA-Z0-9]", "").length() == password.length())  //checks if the string contains symbols
            return 3;

        else if (password.length() >= 8 &&
                password.replaceAll("[^0-9]", "").length() >= 1 &&
                password.replaceAll("[^a-z]", "").length() >= 1 &&
                password.replaceAll("[^a-zA-Z0-9]", "").length() < password.length())
            return 4;

        else
            return 0;
    }
}
