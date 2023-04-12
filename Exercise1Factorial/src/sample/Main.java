package sample;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = 0;
	        while (n < 4 || n > 16) {
	            System.out.print("Введите число от 4 до 16: ");
	            n = sc.nextInt();
	        }

	        int factorial = 1;
	        for (int i = 2; i <= n; i++) {
	        	factorial *= i;
	        }

	        System.out.println(n + "! = " + factorial);
	    }
	}