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

        //find the word length and output it to the user
        int length = word.length();
        System.out.println("This word is " + length + " letters long!");

        //output the word as underscores
        for (int counter = 0; counter < length; counter++) {
            System.out.print("_ ");
        }

        System.out.println("");
        System.out.println("");

        String guessed = "";
        //ask player 2 to guess a letter
        System.out.println("Player 2. Please guess a letter.");
        String guess = input.nextLine();
        //convert the letter from string to char
        char letter = guess.charAt(0);

        //seperate the word into individual letters
        for (int i = 0; i < length; i++) {
            char character = word.charAt(i);

            if (letter != character) {
                guessed = guessed + "_";
            } else if (letter == character) {
                guessed = guessed letter + " ";
            }
        }

    }
}
