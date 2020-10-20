package com.example.project;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Ask the user to guess a number from 0 to 100
        // Get the first guess using scan.nextInt();
        System.out.println("Guess a number from 0 to 100");
        int guess = scan.nextInt();
        int answer = (int)(Math.random() * 100);

        // Loop while the guess does not equal the random number,
        while(guess != answer) {

            // If the guess is less than the random number, print out "Too low!"
            if(guess < answer){
                System.out.println("Too low!");
            }

            // If the guess is greater than the random number, print out "Too high!"
            if(guess > answer){
                System.out.println("Too high!");
            }

            // Get a new guess (save it into the same variable)
            System.out.print("Guess?: ");
            guess = scan.nextInt();
        }
        // Print out "You got it!"
        System.out.println("You got it!");
    }
}