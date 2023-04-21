package sample;


		public class Main {
		    public static void main(String[] args) {
		        int maxPalindrome = 0;
		        for (int i = 100; i <= 999; i++) {
		            for (int j = 100; j <= 999; j++) {
		                int product = i * j;
		                if (isPalindrome(product) && product > maxPalindrome) {
		                    maxPalindrome = product;
		                }
		            }
		        }
		        System.out.println(maxPalindrome);
		    }

		    private static boolean isPalindrome(int number) {
		        String str = Integer.toString(number);
		        int len = str.length();
		        for (int i = 0; i < len / 2; i++) {
		            if (str.charAt(i) != str.charAt(len - i - 1)) {
		                return false;
		            }
		        }
		        return true;
		    }
		}

	


