import java.util.Scanner;

import javax.swing.JOptionPane;

public class E2_14 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds :") ;
		double pounds = input.nextDouble();
		
		System.out.print("Enter weight in inchs :") ;
		double inches = input.nextDouble();
		
		double kg = pounds * 0.45359237;
		double meters = inches * 0.0254;
		double bmi = kg / Math.pow(meters, 2);

//		���ܱ���С�����4λС����4��5��
		System.out.println("BMI is " + bmi);
	}
}
