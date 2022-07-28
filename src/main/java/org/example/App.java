package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println(greet(name));
        sc.close();
    }

    public static String greet(String name) {
        return String.format("Hello, %s!", name);
    }
}