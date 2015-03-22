import java.util.Scanner;

public class E4_42 {
  public static void main(String[] args) {
	  final int basicSalary = 5000;	  
	  
	  double salary = basicSalary;
	  double commission;
	  int sales;
	  	  
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the commission sought :");
	  double commissionSought = input.nextDouble();
	  
	  for (sales = 4000; salary < commissionSought ; sales ++)
	  {		  
		  salary = 0;
		  
		  if ( sales <= 5000 )
		  {
			  commission = sales * 8.0 / 100;
			  salary += commission ;
		  }
		  else if ( sales <= 10000 )
		  {			  
			  commission = 5000 * 8.0 / 100 + ( sales - 5000 ) * 10.0 / 100 ;
			  salary += commission;
		  }
		  else 
		  {			  
			  commission = 5000 * 8.0 / 100 + 5000 * 10.0 / 100 + ( sales - 10000 ) * 12.0 / 100;
			  salary += commission;
		  }		  
		  
	  }
	  System.out.print("sales must be up to at least " + sales);	  	  
  }
}


