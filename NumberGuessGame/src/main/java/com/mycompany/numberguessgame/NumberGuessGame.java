/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberguessgame;

/**
 *
 * @author HP
 */

import java.util.Scanner;
public class NumberGuessGame {

	// Function that implements the
	// number guessing game
	public static void
	guessingNumberGame()
	{
		// Scanner Class
		Scanner sc = new Scanner(System.in);

		// Generate the numbers
		int number = 1 + (int)(100* Math.random());

		// Given s trials
		int s = 5;

		int i, guess;

		System.out.println("A number is chosen between 1 to 100 Guess the number within 5 trials.");

		// Iterate over K Trials
		for (i = 0; i < s; i++) {

			System.out.println(
				"Guess the number:");

			// Take input for guessing
			guess = sc.nextInt();

			// If the number is guessed
			if (number == guess) {
				System.out.println(
					"Congratulations You guessed the number.");
				break;
			}
			else if (number > guess && i != s- 1) {
				System.out.println(
					"The number is greater than " + guess);
			}
			else if (number < guess && i != s - 1) {
				System.out.println(
					"The number iS less than " + guess);
			}
		}

		if (i == s) {
			System.out.println(
				"You have exhausted s nuber of trials.");

			System.out.println(
				"The number was " + number);
                        System.out.println(
				"Best of luck for the next attempt.");
		}
	}

	// Driver Code
	public static void
	main(String arg[])
	{

		// Function Call
		guessingNumberGame();
	}
}

