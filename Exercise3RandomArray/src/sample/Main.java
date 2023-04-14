package sample;
import java.util.Arrays;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		
		int[] arr1 = new int[15];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100);
        }
        System.out.println("Array 1: " + Arrays.toString(arr1));

        int[] arr2 = new int[30];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr2.length; i++) {
            arr2[i] = arr1[i - arr1.length] * 2;
        }
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }
}