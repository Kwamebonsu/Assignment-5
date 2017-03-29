/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4;

import java.util.Scanner;

/**
 *
 * @author bonsk5852
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        // Ask player 1 for a word
        System.out.println("Player 1. Please enter a word");
        String word = input.nextLine();
        //make the entered word readable
        word = word.toLowerCase();
        word = word.replace("3", "e");
        word = word.replace("@", "a");
        word = word.replace("0", "o");
        word = word.replace("1", "l");
        word = word.replace("7", "t");
        word = word.replace("5", "s");
        if (word.equalsIgnoreCase("yes")) {
            System.out.println("");
            System.out.println("This word is invalid");
            System.out.println("");
        } else if (!word.equalsIgnoreCase("yes")) {
            //create spaces so that player 2 can't see the inputted word
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");


            //find the word length and output it to the user
            int length = word.length();

            System.out.println("This word is " + length + " letters long!");

            //output the word as underscores
            for (int counter = 0; counter < length; counter++) {
                System.out.print("_ ");
            }

            System.out.println("");
            System.out.println("");

            //rewrite the word with spaces in between each character
            String space = "";
            for (int q = 0; q < length; q++) {
                char sp = word.charAt(q);
                space = space + sp + " ";
            }

            System.out.println("");

            String guessed = "";
            //building blank spaces
            for (int i = 0; i < length; i++) {
                guessed = guessed + "_ ";
            }

            //ask player 2 to guess a letter

            while (!guessed.equalsIgnoreCase(word)) {
                System.out.println("Player 2. Please guess a letter.");
                System.out.println("");
                System.out.println("Or type Yes if you want to guess the word");
                System.out.println("");
                String guess = input.nextLine();
                System.out.println("");
                if (!guess.equalsIgnoreCase("yes")) {
                    //convert the letter from string to char
                    char letter = guess.charAt(0);

                    //seperate the word into individual letters
                    for (int i = 0; i < length; i++) {
                        char character = word.charAt(i);
                        //replace the letter with the character
                        if (letter == character && i == 0) {
                            guessed = letter + guessed.substring(i + 1);
                        } else if (letter == character && i != 0) {
                            guessed = guessed.substring(0, 2 * i) + letter + " " + guessed.substring(2 * (i + 1), 2 * length);
                        }

                    }

                    //output all the correct guesses with underscores representing unknown letters
                    System.out.println("");
                    System.out.println(guessed);
                    System.out.println("");
                } else if (guess.equalsIgnoreCase("yes")) {
                    //ask the user if they want to guess the word
                    System.out.println("");
                    System.out.println("Would you like to guess the word?");
                    System.out.println("");
                    String guessword = input.nextLine();
                    //if the user says yes, allow them to input a word
                    if (guessword.equalsIgnoreCase("yes")) {
                        System.out.println("");
                        System.out.println("Please guess a word!");
                        System.out.println("");
                        String wholeword = input.nextLine();
                        System.out.println("");
                        //if the word is right, tell the user that they won
                        if (wholeword.equalsIgnoreCase(word)) {
                            System.out.println("");
                            System.out.println("You are right!");
                            System.out.println("");
                            System.out.println("The word is " + word + "!");
                            break;
                        } //if the word is wrong then inform the player
                        else if (!wholeword.equalsIgnoreCase(word)) {
                            System.out.println("");
                            System.out.println("Sorry! That is not the word!");
                            System.out.println("");
                        }
                    } //if the user does not want to guess the word, return to line 265
                    else if (guessword.equalsIgnoreCase("No")) {
                        System.out.println("");
                        System.out.println("Okay");
                        System.out.println("");
                    }
                    //if all the letters are guessed, tell the user they won then break the circuit
                    if (guessed.equalsIgnoreCase(space)) {
                        System.out.println("You won!!");
                        System.out.println("");
                        System.out.println("The word is " + word + "!");
                        System.out.println("");
                        break;
                    }
                }
            }
        }
    }
}
