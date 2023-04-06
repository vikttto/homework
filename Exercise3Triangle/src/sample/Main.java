package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		

		int sideA;
		int sideB;
		int sideC;
		 
		        System.out.println("Type side a:");
		        sideA = sc.nextInt();
		 
		        System.out.println("Type side b:");
		        sideB = sc.nextInt();
		 
		        System.out.println("Type side c:");
		        sideC = sc.nextInt();
		
		        if  (sideA + sideB < sideC) {
		        	System.out.println("This triangle exists");
		        } else {
		        	System.out.println("This triangle doesnt exist");
		        }
		
		
		
	}

}
