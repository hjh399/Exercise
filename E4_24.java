public class E4_24 {
  public static void main(String args[]) {
	  
	  double sum = 0 ;
	  
	  for ( int i = 1 ; i < 98 ; i += 2)
	  {
		  sum +=  (double)i / ( i + 2 );
	  }
	  System.out.print("sum is " + sum);
	  	  
  } 
}