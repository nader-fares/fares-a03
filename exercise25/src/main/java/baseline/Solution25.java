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

public class Solution25 {
    public static void main(String[] args) {
        Solution25 app = new Solution25();
//        display directions
//        declare and ask for password
        String password;
        //declare string passwordStrength
        String passwordStrength;
//      check password strength
        // switch statement set passwordStrength based on returned int
        //print results

    }

    // check password strength
    // returns int based on strength
    public int passwordValidator(String password) {
        // returns 1-4 ranging from very weak to very strong
        // returns 5 if it does not meet any of those rules
    }
}
