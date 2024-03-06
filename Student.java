package entities;

public class Student {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public void calcGrade() {
		double finalGrade = n1 + n2 + n3;
		if (finalGrade < 60){
			System.out.printf("Final Grade = %.2f\nFailed\nMissing %.2f points", finalGrade, 60 - finalGrade);
		}
		else {
			System.out.printf("Final Grade = %.2f\nPass", n1 + n2 + n3);
		}
	}
}
