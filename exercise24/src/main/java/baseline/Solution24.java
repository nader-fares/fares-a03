/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */

/*
Create a program that compares two strings and determines if the two strings are anagrams.
The program should prompt for both input strings and
display the output as shown in the example that follows.
 */

package baseline;

import java.util.Scanner;
import java.util.Arrays;

public class Solution24 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution24 app = new Solution24();
        //display directions
        displayDirections();

        //declare and ask for stringA and stringB
        System.out.print("Enter the first string: ");
        String firstString = input.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = input.nextLine();

        //if isAnagram is true print are anagrams
        if (app.isAnagram(firstString, secondString))
            System.out.printf("\"%s\" and \"%s\" are anagrams.", firstString, secondString);
            //else print are not anagrams
        else
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", firstString, secondString);
    }

    //print directions
    public static void displayDirections() {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
    }

    //check if two strings are anagrams
    public boolean isAnagram(String stringA, String stringB) {
        //get length of both strings and compare length
        int length1 = stringA.length();
        int length2 = stringB.length();

        if (length1 != length2)
            return false;

        //convert strings to character arrays
        char[] ch1 = stringA.toLowerCase().toCharArray();
        char[] ch2 = stringB.toLowerCase().toCharArray();
        //sort character arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        //compare character arrays
        for (int i = 0; i < length1; i++) {
            if (ch1[i] != ch2[i])
                return false;
        }
        return true;
    }
}
