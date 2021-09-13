/*
 *  UCF COP3330 Fall 2021 Exercise 15 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the password? ");
        String input = scan.nextLine();

        if(input.equals("AbC!!")){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}