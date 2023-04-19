package sample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); 
        String[] words = input.split(""); 
        String shortestWord = words[0]; 
        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }
        System.out.println("Vovochka has writen the word - \"" + shortestWord + "\"");
    }
}