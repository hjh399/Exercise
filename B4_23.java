public class B4_23 {
  public static void main(String args[]) {
	  
	  double sum = 0 ;
	  
	  for ( int i = 1 ; i < 50001 ; i++)
	  {
		  sum += ( 1.0 / i );
	  }
	  System.out.println("sum is " + sum);
	  
	  sum = 0;
	  for ( int i = 50000 ; i > 0 ; i--)
	  {
		  sum += ( 1.0 / i );
	  }
	  System.out.print("sum is " + sum);
	  
	  
	  
	  
  } 
}