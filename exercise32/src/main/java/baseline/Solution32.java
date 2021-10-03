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

import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Solution32 {
    private static final Scanner input = new Scanner(System.in);

    public int randomNumber;


    public static void main(String[] args) {
        Solution32 app = new Solution32();
//        create a variable to store number of guesses
        int guessCount = 0;
        String lastGuessResult = "none"; // none | high | low | correct
//        prompt user for difficulty
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        int difficulty;
        if (input.hasNextInt()) {
            difficulty = input.nextInt();
        } else {
            difficulty = 1;
            input.next();
        }

//        determine number range
//        generate a random number
        app.generateRandomNumber(difficulty);
//        loop to prompt user for guesses
        do {
            String promptMessage;
            switch(lastGuessResult) {
                case "high":
                    promptMessage = "Too high, guess again: ";
                    break;
                case "low":
                    promptMessage = "Too low, guess again: ";
                    break;
                default:
                    promptMessage = "I have my number, what's your guess? ";
            }
            int guess = app.promptNumber(promptMessage);
            guessCount++;
            if (guess == app.getRandomNumber()) {
                lastGuessResult = "correct";
            } else if (guess > app.getRandomNumber()) {
                lastGuessResult = "high";
            } else if (guess < app.getRandomNumber()) {
                lastGuessResult = "low";
            }

        } while (lastGuessResult != "correct");
//        if correct guess, break loop and notify user
        System.out.print("You got it in " + guessCount + " guesses.\nDo you wish to play again (Y/N)? ");
        String playAgainInput = input.nextLine();
        if (playAgainInput.toLowerCase(Locale.ROOT).equals("y")) {
            main(args);
        }
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
        System.out.print(promptMessage);
        int userInput;
        try {
            if (input.hasNextInt()) {
                userInput = input.nextInt();
                input.nextLine();
            }
            else {
                input.next();
                userInput = 0;
            }

        } catch(NoSuchElementException error) {
            return 0;
        }

//        if invalid, return 0 (always incorrect)
        return userInput;
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
