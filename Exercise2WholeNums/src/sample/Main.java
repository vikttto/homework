package sample;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	     
	        System.out.print("Type the size of an array: ");
	        int size = scanner.nextInt();
	        
	        
	        int[] arr = new int[size];
	        
	      
	        System.out.println("Fill the array with whole numbers:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print("arr[" + i + "] = ");
	            arr[i] = scanner.nextInt();
	        }
	  
	        System.out.println("The array is:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("arr[" + i + "] = " + arr[i]);
	        }
	    }
	

	}


