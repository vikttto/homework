package sample;

public class Main {

	public static void main(String[] args) {
		double  gasolinaCost;
		gasolinaCost = 1.2;
		double distance;
		distance = 120;
		double finalCost;
        finalCost = (gasolinaCost * distance) / 100;
        System.out.println("Сума $ " + finalCost);
	}

}
