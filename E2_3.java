import java.util.Scanner;

import javax.swing.JOptionPane;

public class E2_3  {
  // Main method
  public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  
	  double feet = input.nextDouble();
	  double meter = feet * 0.305 ;
	  
	  System.out.println( feet + " feet is " + meter + " meters");
	    
  }
  
}
