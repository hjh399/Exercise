import java.util.Scanner;

import javax.swing.JOptionPane;

public class E2_12 {
	public static void main(String[] args) {
	
		String balanceString = JOptionPane.showInputDialog(null, "Enter balance :", "E2_12", JOptionPane.QUESTION_MESSAGE);
		double balance = Double.parseDouble(balanceString);
		
		String interestRateString = JOptionPane.showInputDialog(null, "Enter interest rate (e.g., 3 for 3%):", "E2_12", JOptionPane.QUESTION_MESSAGE);
		double interestRate =  Double.parseDouble(interestRateString);
		
		double interest = balance * (interestRate / 1200);
//		����1000��3.5��ֻ�ܵ����2.91666�ĵز�������֪�������ſ������2.667
		String output = "The interest is " + (int)(100000 * interest) / 100000.0;
		
		JOptionPane.showMessageDialog(null, output);
	}
}
