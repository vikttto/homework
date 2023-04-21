package sample;
import java.util.Arrays;
public class Main {

	
		public class ArrayCombinations {
		    public static void main(String[] args) {
		        int[] arr = {1, 2, 3, 4, 5};
		        int len = arr.length;
		        int[] temp = new int[len];
		        boolean[] used = new boolean[len];
		        generateCombinations(arr, temp, used, 0);
		    }

		    private static void generateCombinations(int[] arr, int[] temp, boolean[] used, int index) {
		        if (index == arr.length) {
		            System.out.println(Arrays.toString(temp));
		            return;
		        }
		        for (int i = 0; i < arr.length; i++) {
		            if (!used[i]) {
		                used[i] = true;
		                temp[index] = arr[i];
		                generateCombinations(arr, temp, used, index + 1);
		                used[i] = false;
		            
		        }
		    }
		}

	}

}
