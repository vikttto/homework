package sample;

public class Main {

	public static void main(String[] args) {

		double sideA;
		sideA = 0.3;

		double sideB;
		sideB = 0.4;

		double sideC;
		sideC = 0.5;

		double perimetro = (sideA + sideB + sideC) / 2;
		double area;
		area = Math.sqrt(perimetro * (perimetro - sideA)*(perimetro - sideB)*(perimetro - sideC)); 
		
		System.out.println("Площа трикутника - " + area);

	}

}
