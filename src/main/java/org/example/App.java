package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your text: ");

        String fromUser = scanner.nextLine();

        System.out.println("reversed: " + ConvertReverse.reverse(fromUser));
    }
}
