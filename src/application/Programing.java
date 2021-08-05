package application;

import java.util.Locale;
import java.util.Scanner;

public class Programing {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of triangule X: ");
		System.out.println("Enter the mesuares side A of trianglue X: ");
		xA = sc.nextDouble();
		System.out.println("Enter the mesuares side B of trianglue X: ");
		xB = sc.nextDouble();
		System.out.println("Enter the mesuares side C of trianglue X: ");
		xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangule Y: ");
		System.out.println("Enter the mesuares side A of trianglue Y: ");
		yA = sc.nextDouble();
		System.out.println("Enter the mesuares side B of trianglue Y: ");
		yB = sc.nextDouble();
		System.out.println("Enter the mesuares side C of trianglue Y: ");
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC)/2.0;
		double areaX = Math.sqrt(p*(p - xA)*(p - xB)*(p - xC));
		
	    p = (yA + yB + yC)/2.0;
		double areaY = Math.sqrt(p*(p - yA)*(p - yB)*(p - yC));
		
		System.out.printf("Area of Triangule X are: %.4f%n", areaX);
		System.out.printf("Area of Triangule Y are: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("large area: X");
		}
		else {
			System.out.println("large area: Y");
		}
		
		
		sc.close();
	}

}
