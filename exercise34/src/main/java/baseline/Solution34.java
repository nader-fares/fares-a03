/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */

/*
Create a small program that contains a list of employee names. Print out the list of names when the program runs the first time. Prompt for an employee name and remove that specific name from the list of names. Display the remaining employees, each on its own line.
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution34 {
    private static final Scanner input = new Scanner(System.in);
//        declare list of employees
    public ArrayList<String> employees;

    Solution34() {
//        add employees to list
        employees = new ArrayList<String>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
    }

    public static void main(String[] args) {
        Solution34 app = new Solution34();
//        print all employees
        app.printEmployees();
//        prompt user to remove an employee
        System.out.print("Enter an employee name to remove: ");
        String employeeToRemove = input.nextLine();
        app.removeEmployee(employeeToRemove);
//        print list of remaining employees
        app.printEmployees();
    }

    public void removeEmployee(String name) {
//        remove employee with given name
        employees.remove(name);
    }

    public void printEmployees() {
        System.out.println("There are " + employees.size() + " employees:");
//        loop through list of employees and print them
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }
}
