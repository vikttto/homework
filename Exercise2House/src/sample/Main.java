package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Type the number of apartment:");
        int flatNumber = sc.nextInt();

        if (flatNumber < 1 || flatNumber > 180) {
            System.out.println("This apartment doesnt exist ");
        } else {
            int entranceNumber = (flatNumber - 1) / 36 + 1;
            int floorNumber = (flatNumber - 1) % 36 / 4 + 1;

            System.out.println("The apartment is in the entrance №" + entranceNumber +
                    ", on " + floorNumber + " floor");
        }
    }


	}


