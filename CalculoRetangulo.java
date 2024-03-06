package application;

import java.util.Scanner;

import entities.Rectangle;

public class CalculoRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle r;
		
		r = new Rectangle();
		
		System.out.println("Enter the rectangle width and height:");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", r.area());
		System.out.printf("Perimeter = %.2f\n", r.perimeter());
		System.out.printf("Diagonal = %.2f\n", r.diagonal());
		
		sc.close();
	}

}
