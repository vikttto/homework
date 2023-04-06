package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int num4;
		int maxNum;
		
		System.out.println("Type first number: ");
		num1 = sc.nextInt();
		System.out.println("Type second nember: ");
		num2 = sc.nextInt();
		System.out.println("Type third number: ");
		num3 = sc.nextInt();
		System.out.println("Type fourth number: ");
		num4 = sc.nextInt();
		

		maxNum = num1;
		if (num2 >= maxNum) {
		    maxNum = num2;
		}
		if (num3 >= maxNum)  {
			maxNum = num3;
		}
		if (num4 >= maxNum) {
			maxNum = num4;
		}
		System.out.println("Max number is " + maxNum);
		
		
	}

}
