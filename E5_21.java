import java.util.Scanner;

public class E5_21 {
  public static void main(String[] args) {
	  final int NUMBER = 10;	  
	  
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter ten number: ");
	  
	  double sum = 0;
	  double sum2 = 0;
	  for (int i = 0 ; i < 10 ; i ++)
	  {
		  double x = input.nextDouble();
		  sum += x;
		  sum2 += Math.pow(x, 2);
	  }
	  
	  System.out.println("The mean is " + mean(sum, NUMBER));
	  System.out.printf("The standard deviation is %1.5f", standardDeviation(sum, sum2, NUMBER));
  }
  
  public static double mean(double sum , int number) {	  
	  double mean = sum / number;
	  return mean;
  }
  
  public static double standardDeviation(double sum , double sum2 , int number) {	  
	  double standardDeviation = ( sum2 - Math.pow(sum, 2) / number ) / ( number - 1 );
	  standardDeviation = Math.pow(standardDeviation, 0.5);
	  return standardDeviation;
  }
}
