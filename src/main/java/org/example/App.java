package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your text: ");

        String fromUser = scanner.nextLine();

        System.out.println("reversed: " + reverse(fromUser));
    }

    public static String reverse(String sample) {
        String result = "";

        for (int i = sample.length() - 1; i >= 0; i--) {
            result += sample.charAt(i);
        }

        return result;
    }
}
