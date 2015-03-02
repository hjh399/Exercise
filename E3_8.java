import javax.swing.JOptionPane;
public class E3_8 {
  public static void main(String[] args) {
	  String number1 = JOptionPane.showInputDialog(null, "Enter an integer", "Enter a input" , JOptionPane.QUESTION_MESSAGE);
	  String number2 = JOptionPane.showInputDialog(null, "Enter an integer", "Enter a input" , JOptionPane.QUESTION_MESSAGE);
	  String number3 = JOptionPane.showInputDialog(null, "Enter an integer", "Enter a input" , JOptionPane.QUESTION_MESSAGE);
	  
	  int num1 = Integer.parseInt(number1);
	  int num2 = Integer.parseInt(number2);
	  int num3 = Integer.parseInt(number3);
	  int temp ;
	  
	  if ( num1 > num2)
	  {
		  temp = num1;
		  num1 = num2;
		  num2 = temp;  
	  }
	  if ( num2 > num3)
	  {
		  temp = num2;
		  num2 = num3;
		  num3 = temp;		  
	  }
	  if ( num1 > num2)
	  {
		  temp = num1;
		  num1 = num2;
		  num2 = temp;  
	  }
	  System.out.print(num1 + "<=" + num2 + "<=" + num3);	  	  
  }
}
