package dev.syzenx;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public final static int[] CHANCES = {10,5,3}; // Easy(10) Medium(5) Hard(3)
    static int number;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        number = new Random().nextInt(101);

        String[] difficulties = {"Easy", "Medium", "Hard"};


        System.out.println("Welcome to the number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        int choice = 0, attempts = 0;

        while (choice < 1 || choice > 3) {

            System.out.println("Please select the difficulty level: ");
            System.out.println("1. Easy (10 chances)");
            System.out.println("2. Medium (5 chances)");
            System.out.println("3. Hard (3 chances)");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        }

        int maxAttempts = CHANCES[choice - 1];
        System.out.printf("Great! You have selected the %s difficulty level.", difficulties[choice-1]);

        System.out.printf("\nYou have %d chances to guess the correct number.", maxAttempts);




        System.out.println("\nLet's start the game!");
        int guess;
        boolean guessed = false;

        while(!guessed && attempts < maxAttempts) {
            attempts++;

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();


            if (guess == number) {
                System.out.println("You guessed the correct number in " + attempts + " attempts.");
                guessed = true;
                break;
            } else if (guess < number) {
                System.out.println("Incorrect! The number is greater than " + guess);
            }else {
                System.out.println("Incorrect! The number is less than " + guess);
            }
        }


        if (!guessed) {
            System.out.println("\n❌ You lost! The correct number was " + number + ".");
        }
        System.out.println("Thanks for playing!");


        sc.close();








    }



}