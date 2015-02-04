import java.util.Scanner;

import javax.swing.JOptionPane;

public class E2_11 {
	public static void main(String[] args) {
	
		String name = JOptionPane.showInputDialog(null, "Enter employee's name", "E2_11",JOptionPane.QUESTION_MESSAGE);
		
		String hoursString= JOptionPane.showInputDialog(null, "Enter number of hours worked in a week :", "E2_11",JOptionPane.QUESTION_MESSAGE);
		double hours = Integer.parseInt(hoursString);
		
		String payRateString= JOptionPane.showInputDialog(null, "Enter hourly pay rate :", "E2_11",JOptionPane.QUESTION_MESSAGE);
		double payRate = Double.parseDouble(payRateString);
		
		String federalTaxString= JOptionPane.showInputDialog(null, "Enter federal tax withholding rate:", "E2_11",JOptionPane.QUESTION_MESSAGE);
		double federalTaxRate = Double.parseDouble(federalTaxString);
		
		String stateTaxString= JOptionPane.showInputDialog(null, "Enter state tax withholding rate:", "E2_11",JOptionPane.QUESTION_MESSAGE);
		double stateTaxRate = Double.parseDouble(stateTaxString);
		
		double grossPay = hours * payRate;
		double federalTax = grossPay * federalTaxRate;
		double stateTax = grossPay * stateTaxRate;
		double totalDeduction = federalTax + stateTax;
		double netPay = grossPay - totalDeduction;
 		
		
		String output = "Employee Name:" + name + "\n" + 
						"Hours Worked:" + hours + "\n" + 
						"Pay Rate: $" + payRate + "\n" + 
						"Gross Pay: $" + grossPay + "\n" +
						"Deductions: " + "\n" +
						"	Federal Withholding (" + federalTaxRate * 100 + "%) :	$" + federalTax + "\n" +
						"	State Withholding (" + stateTaxRate * 100 + "%) :	$" + stateTax + "\n" +
						"	Total Deduction:	$" + totalDeduction + "\n" +
						"Net Pay:	$" + netPay;
						
		
		JOptionPane.showMessageDialog(null, output);
		
		
		
		
		
		
		
	}
}
