package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 8 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App
{
    public static void main( String[] args ) {

        Scanner scanPpl = new Scanner(System.in);
        Scanner scanPizza = new Scanner(System.in);
        Scanner scanSlices = new Scanner(System.in);

        System.out.print("How many people? ");
        int numPpl = scanPpl.nextInt();
        System.out.print("How many pizzas do you have? ");
        int numPizza = scanPizza.nextInt();
        System.out.print("How many slices per pizza? ");
        int numSlice = scanSlices.nextInt();
        System.out.printf("%d people with %d pizzas (%d slices)\n", numPpl, numPizza, numSlice * numPizza);
        System.out.printf("Each person gets %d pieces of pizza.\n", (numSlice * numPizza) / numPpl);
        System.out.printf("There are %d leftover pieces.", (numSlice * numPizza) % numPpl);

    }
}
