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
        //building blank spaces
        for (int i = 0; i < length; i++) {
            guessed = guessed + "_ ";
        }

        //ask player 2 to guess a letter

        while (!guessed.equalsIgnoreCase(word)) {
            System.out.println("Player 2. Please guess a letter.");
            String guess = input.nextLine();
            //convert the letter from string to char
            char letter = guess.charAt(0);

            //seperate the word into individual letters
            for (int i = 0; i < length; i++) {
                char character = word.charAt(i);

                if (letter == character) {

                    guessed = guessed.substring(0, i) + character + guessed.substring(i, length);
                }

            }
            System.out.println(guessed);

        }
    }
}