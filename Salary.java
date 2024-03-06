package application;

import java.util.Scanner;

import entities.Employee;

public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e;
		double x;
		
		e = new Employee();
		
		System.out.println("Name: ");
		e.name = sc.next();
		System.out.println("Gross Salary: ");
		e.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		e.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f\n", e.name, e.netSalary());
		System.out.println("Which percentage to increase salary? ");
		x = sc.nextDouble();
		System.out.printf("Updated data: %s, $ %.2f\n", e.name, e.increaseSalary(x));
		
		sc.close();
	}

}
