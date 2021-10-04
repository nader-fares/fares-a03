/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */
package baseline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution40 {
    private static final Scanner input = new Scanner(System.in);
    public ArrayList<Map<String, String>> employees = new ArrayList<Map<String, String>>();
    Solution40() {
//        populate the list of maps
        Map<String, String> emp1 = new HashMap<>();
        emp1.put("First Name", "John");
        emp1.put("Last Name", "Johnson");
        emp1.put("Position", "Manager");
        emp1.put("Separation Date", "2016-12-31");
        employees.add(emp1);

        Map<String, String> emp2 = new HashMap<String, String>();
        emp2.put("First Name", "Tou");
        emp2.put("Last Name", "Xiong");
        emp2.put("Position", "Software Engineer");
        emp2.put("Separation Date", "2016-10-05");
        employees.add(emp2);

        Map<String, String> emp3 = new HashMap<String, String>();
        emp3.put("First Name", "Michaela");
        emp3.put("Last Name", "Michaelson");
        emp3.put("Position", "District Manager");
        emp3.put("Separation Date", "2015-12-19");
        employees.add(emp3);

        Map<String, String> emp4 = new HashMap<String, String>();
        emp4.put("First Name", "Jake");
        emp4.put("Last Name", "Jacobson");
        emp4.put("Position", "Programmer");
        emp4.put("Separation Date", "");
        employees.add(emp4);

        Map<String, String> emp5 = new HashMap<String, String>();
        emp5.put("First Name", "Jacquelyn");
        emp5.put("Last Name", "Jackson");
        emp5.put("Position", "DBA");
        emp5.put("Separation Date", "");
        employees.add(emp5);

        Map<String, String> emp6 = new HashMap<String, String>();
        emp6.put("First Name", "Sally");
        emp6.put("Last Name", "Webber");
        emp6.put("Position", "Web Developer");
        emp6.put("Separation Date", "2015-12-18");
        employees.add(emp6);
    }

    public static void main(String[] args) {
        Solution40 app = new Solution40();
//        prompt user for input
        System.out.print("Enter a search string: ");
        String searchString = input.nextLine();
        app.filterArray(searchString);

        // call filter method

        // loop through array and print each employee row
        String output = String.format(" %-20s | %-20s | %-20s \n", "Name", "Position", "Separation Date");
        output += String.format(" %-20s|%-20s|%-20s \n", "---------------------", "----------------------", "---------------------");
//        loop through list and print rows
        for (int i = 0; i < app.employees.size(); i++) {
            output += app.getRowString(app.employees.get(i));
        }
        System.out.println(output);
    }
    public void filterArray(String userInput) {
        // filter array by user input
        // check if first name or last name contain the input
        ArrayList<Map<String, String>> newEmployees = new ArrayList<Map<String, String>>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).get("First Name").contains(userInput) || employees.get(i).get("Last Name").contains(userInput)) {
                newEmployees.add(employees.get(i));
            }
        }
        employees = newEmployees;
    }

    public String getRowString(Map<String, String> employee) {
//        return formatted string with employee info
        return String.format(" %-20s | %-20s | %-20s \n", employee.get("First Name") + " " + employee.get("Last Name"), employee.get("Position"), employee.get("Separation Date"));
    }
}
