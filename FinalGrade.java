package application;

import java.util.Scanner;

import entities.Student;

public class FinalGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s;
		
		s = new Student();
		
		System.out.println("Student's name: ");
		s.name = sc.next();
		
		System.out.println("Enter the grades: ");
		
		s.n1 = sc.nextDouble();
		while(s.n1 > 30 || s.n1 < 0) {
			System.out.println("Invalid value!");
			s.n1 = sc.nextDouble();
		}
		s.n2 = sc.nextDouble();
		while(s.n2 > 35 || s.n2 < 0) {
			System.out.println("Invalid value!");
			s.n2 = sc.nextDouble();
		}
		s.n3 = sc.nextDouble();
		while(s.n3 > 35 || s.n3 < 0) {
			System.out.println("Invalid value!");
			s.n3 = sc.nextDouble();
		}
	
		
		s.calcGrade();
		
		sc.close();
	}

}
