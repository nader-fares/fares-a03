/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */
/*
Write a program that prompts for
    a first name,
    last name,
    employee ID, and
    ZIP code.

Ensure that the input is valid according to these rules:
    The first name must be filled in.
    The last name must be filled in.
    The first and last names must be at least two characters long.
    An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
    The ZIP code must be a number.
    Display appropriate error messages on incorrect data.

Constraints
    Create a function for each validation rule. Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
    Use a single output statement to display the outputs.
 */

package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution27 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution27 app = new Solution27();

//        declare and prompt user for first name, last name, employee id, zip code
        System.out.print("Enter the first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter the employee ID: ");
        String employeeID = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zipCode = input.nextLine();

//        declare and initialize output string variable
        String output = app.validateInput(firstName,lastName,employeeID,zipCode);

//        check if each input is valid and concat error messages to it if needed
//        print results
        System.out.println(output);
    }

    public String validateInput(String firstName, String lastName, String employeeID, String zipCode) {
        String output = "";
        if (!this.validateName(firstName)) {
            output += "The first name must be at least 2 characters long.\n";
            if (!this.validateNotEmpty(firstName))
                output += "The first name must be filled in.\n";
        }
        if (!this.validateName(lastName)) {
            output += "The last name must be at least 2 characters long.\n";
            if (!this.validateNotEmpty(lastName))
                output += "The last name must be filled in.\n";
        }
        if (!this.validateEmployeeID(employeeID)) {
            output += "The employee ID must be in the format of AA-1234.\n";
        }
        if (!this.validateZipCode(zipCode)) {
            output += "The zipcode must be a 5 digit number.\n";
        }

        if (output.length() == 0)
            output = "There were no errors found.";
        return output;
    }

    //    used for first and last name
    public boolean validateName(String name) {
        // return true if name is 2 or more characters
        if (name.length() >= 2)
            return true;
        else
            return false;

    }

    //    used for first and last name
    public boolean validateNotEmpty(String name) {
        // return true if name is not empty
        if (name.length() > 0)
            return true;
        else
            return false;

    }

    //    used for employee ID
    public boolean validateEmployeeID(String employeeId) {
        // return true if employee ID follows the specified format (AA-1234)
        if (employeeId.matches("^[A-Z]{2}-[0-9]{4}\\z"))
            return true;
        else
            return false;
    }

    //    used for zip code
    public boolean validateZipCode(String zipCode) {
        // return true if zip code is a number with 5 digits
        if (zipCode.length() != 5)
            return false;
        try {
            int zipCodeInt = Integer.parseInt(zipCode);
            return true;
        } catch(NumberFormatException error) {
            return false;
        }
    }
}
