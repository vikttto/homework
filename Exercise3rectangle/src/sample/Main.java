package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Type weight of rectangle: ");
	        int width = sc.nextInt();
	        System.out.print("Type height of rectangle: ");
	        int height = sc.nextInt();

	        for (int i = 1; i <= height; i++) {
	            for (int j = 1; j <= width; j++) {
	                if (i == 1 || i == height || j == 1 || j == width) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }

	}

}
