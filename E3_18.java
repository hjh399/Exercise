import javax.swing.JOptionPane;

public class E3_18 {
  public static void main(String args[]) {
    // Create a Scanner
    String input = JOptionPane.showInputDialog(null, "Enter a year:", "Enter a input", JOptionPane.QUESTION_MESSAGE);
    int year = Integer.parseInt(input);
    // Check if the year is a leap year 
    boolean isLeapYear = 
      (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    // Display the result in a message dialog box
    System.out.println(year + " is a leap year? " + isLeapYear);   
  } 
}
