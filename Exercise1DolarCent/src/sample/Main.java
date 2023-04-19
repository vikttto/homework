package sample;

import java.util.Scanner;

public class Main {
    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much money do you have?\n$");
        double money = scanner.nextDouble();
        scanner.close();

        int dollars = (int) money;
        int cents = (int) ((money - dollars) * 100);

        System.out.println("You have: " + convertToWords(dollars) + " dollars " + convertToWords(cents) + " cents");
    }

    private static String convertToWords(int number) {
        if (number == 0) {
            return "zero";
        }
        if (number < 20) {
            return ones[number];
        }
        if (number < 100) {
            return tens[number / 10] + " " + convertToWords(number % 10);
        }
        if (number < 1000) {
            return ones[number / 100] + " hundred " + convertToWords(number % 100);
        }
        if (number < 1000000) {
            return convertToWords(number / 1000) + " thousand " + convertToWords(number % 1000);
        }
        if (number < 1000000000) {
            return convertToWords(number / 1000000) + " million " + convertToWords(number % 1000000);
        }
        return "";
    }
}