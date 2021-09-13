/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.util.Scanner;

class Main {
    public static void main( String args[] ) {
       Scanner input = new Scanner(System.in);//creating scanner

       //prompts user to enter input string
       System.out.print("Enter a noun: ");
       String noun = input.nextLine();

       System.out.print("Enter a verb: ");
       String verb = input.nextLine();

       System.out.print("Enter an adjective: ");
       String adj = input.nextLine();

       System.out.print("Enter an adverb: ");
       String adverb = input.nextLine();

       String message = String.format("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adverb);
        System.out.println(message);
        
       }
}