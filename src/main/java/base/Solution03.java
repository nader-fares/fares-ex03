/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nader Fares
 */

//Create a program that
// prompts for a quote and an author.
// Display the quotation and author as shown in the example output.


package base;

import java.util.Scanner;

public class Solution03 {
    /*
        program start
        print "What is the quote?"
        'quote' = read string from user
        print "Who said it?"
        'author' = read string from user
        print "'author' says, "'quote'""
     */

    public static void main(String[] args)
    {
        //prompt user for quote and store into variable 'quote'
        System.out.print("What is the quote? ");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();

        //prompt user for author and store into variable 'author'
        System.out.print("Who said it? ");
        String author = input.nextLine();

        //display results
        System.out.println(author + " says, " + "\"" + quote + "\"");
    }
}
