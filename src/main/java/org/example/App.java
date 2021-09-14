package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        //the password key to which attempts are compared
        final String password = "abc$123";

        //scanning password attempt from user
        System.out.print("What is the password? ");
        String attempt = sc.nextLine();

        //returns 0 if they are same
        if (password.compareTo(attempt) == 0)
            System.out.println("Welcome!\n");

        //not match
        else
            System.out.println("I don't know you.\n");

    }
}
