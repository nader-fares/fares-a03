/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */

/*
Create a program that prompts for a list of numbers, separated by spaces. Have the program print out a new list containing only the even numbers.
Constraints
Convert the input to an array. Many languages can easily convert strings to arrays with a built-in function that splits apart a string based on a specified delimiter.
Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
Use a function called filterEvenNumbers to encapsulate the logic for this. The function takes in the original array and returns the new array.
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution38 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Solution38 app = new Solution38();
//        ask user for number string
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numberStr = input.nextLine();
//        convert string to array and filter
        ArrayList<String> arr = app.stringToArray(numberStr);
        ArrayList<String> newArr = new ArrayList<String>();
        for (int i = 0; i < arr.size(); i++) {
            if (Integer.parseInt(arr.get(i)) % 2 == 0)
                newArr.add(arr.get(i));
        }
//        convert new array to string
        String newStr = app.arrayToString(newArr);
//        return new string
        System.out.println("The even numbers are " + newStr + ".");
    }

    public ArrayList<String> stringToArray(String str) {
        ArrayList<String> arrayList = new ArrayList<String>();
//        split the string by the space character
        arrayList.addAll(List.of(str.split(" ")));
        return arrayList;
    }

    public String arrayToString(ArrayList<String> arr) {
//        create an array from the string
        String str = "";
        for (int i = 0; i < arr.size(); i++) {
            if (i > 0)
                str += " ";
            str += arr.get(i);
        }
        return str;
    }
}
