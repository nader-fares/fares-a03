/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */

/*
Write a Guess the Number game that has three levels of difficulty. The first level of difficulty would be a number between 1 and 10. The second difficulty set would be between 1 and 100. The third difficulty set would be between 1 and 1000.

Prompt for the difficulty level, and then start the game. The computer picks a random number in that range and prompts the player to guess that number. Each time the player guesses, the computer should give the player a hint as to whether the number is too high or too low. The computer should also keep track of the number of guesses. Once the player guesses the correct number, the computer should present the number of guesses and ask if the player would like to play again.
Constraints
Don’t allow any non-numeric data entry.
During the game, count non-numeric entries as wrong guesses.
 */

package baseline;

import java.util.Scanner;

public class Solution32 {
    private static final Scanner input = new Scanner(System.in);

    public int randomNumber;


    public static void main(String[] args) {
        Solution32 app = new Solution32();
//        create a variable to store number of guesses
//        prompt user for difficulty
//        determine number range
//        generate a random number
//        loop to prompt user for guesses
//        if correct guess, break loop and notify user
    }

    public void generateRandomNumber(int difficulty) {
//        declare max int
        int max;
//        choose max int based on difficulty
        switch (difficulty) {
            case 1:
                max = 10;
                break;
            case 2:
                max = 100;
                break;
            case 3:
                max = 1000;
                break;
            default:
                System.out.println("Invalid difficulty.");
                return;

        }
//        change random number var
        this.randomNumber = (int) Math.ceil(Math.random() * max);
    }

    public int promptNumber(String promptMessage) {
//        prompt user for number
//        if invalid, return 0 (always incorrect)
    }
}
