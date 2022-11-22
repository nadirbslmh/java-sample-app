package org.example;

public class ConvertReverse {
    public static String reverse(String sample) {
        String result = "";

        for (int i = sample.length() - 1; i >= 0; i--) {
            result += sample.charAt(i);
        }

        return result;
    }
}
