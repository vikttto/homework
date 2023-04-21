package sample;
import java.util.Scanner;
public class Main {
		public class SequenceNextNumber {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Введите последовательность чисел через запятую: ");
		        String input = scanner.nextLine();
		        String[] numbers = input.split(",");
		        int[] sequence = new int[numbers.length];
		        for (int i = 0; i < numbers.length; i++) {
		            sequence[i] = Integer.parseInt(numbers[i].trim());
		        }

		        int nextNumber = findNextNumber(sequence);
		        if (nextNumber == Integer.MIN_VALUE) {
		            System.out.println("Ошибка: последовательность не является арифметической, геометрической прогрессией или степенным рядом");
		            return;
		        }
		        System.out.println("Следующий член последовательности: " + nextNumber);
		    }

		    public static int findNextNumber(int[] sequence) {
		        if (sequence.length < 2) {
		            return Integer.MIN_VALUE;
		        }
		        int a = sequence[0];
		        int d = sequence[1] - a;
		        int r = sequence[1] / a;
		        int n = sequence.length;
		        int nextNumber = sequence[n-1];
		        
		        if (isArithmeticProgression(sequence)) {
		            nextNumber += d;
		        } else if (isGeometricProgression(sequence)) {
		            nextNumber *= r;
		        } else if (isPowerSeries(sequence)) {
		            nextNumber *= r;
		            nextNumber *= r;
		            nextNumber *= a;
		        } else {
		            return Integer.MIN_VALUE;
		        }
		        return nextNumber;
		    }

		    public static boolean isArithmeticProgression(int[] sequence) {
		        int d = sequence[1] - sequence[0];
		        for (int i = 2; i < sequence.length; i++) {
		            if (sequence[i] - sequence[i - 1] != d) {
		                return false;
		            }
		        }
		        return true;
		    }

		    public static boolean isGeometricProgression(int[] sequence) {
		        int r = sequence[1] / sequence[0];
		        for (int i = 2; i < sequence.length; i++) {
		            if (sequence[i] / sequence[i - 1] != r) {
		                return false;
		            }
		        }
		        return true;
		    }

		    public static boolean isPowerSeries(int[] sequence) {
		        double r = (double) sequence[1] / sequence[0];
		        for (int i = 2; i < sequence.length; i++) {
		            if ((double) sequence[i] / sequence[i - 1] != r) {
		                return false;
		            }
		        }
		        return true;
		    }
		}
}


