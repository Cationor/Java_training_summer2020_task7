package com.epamcourse.homework7;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Choose locale: \n 1 - English; \n 2 - Belarusian; \n any - Russian.");
            int number = scanner.nextInt();
            String language = "";
            String country = "";

            switch (number) {
                case 1:
                    language = "EN";
                    country = "US";
                    break;
                case 2:
                    language = "BE";
                    country = "BY";
                    break;
                default:
                    break;
            }

            Locale current = new Locale(language, country);
            ResourceBundle resourceBundle = ResourceBundle.getBundle("datares.text", current);
            String phrase1 = resourceBundle.getString("string1");
            String phrase2 = resourceBundle.getString("string2");
            System.out.println(phrase1);
            System.out.println(phrase2);
        }
    }
}