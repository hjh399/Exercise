public class E4_25 {
  public static void main(String[] args) {	  	  
	  	  	  
	  for (int j = 10000 ; j < 100001 ; j += 10000 )
	  {
		  double sum = 4 * 1 ;
		  
		  for ( int i = 1 ; i < j ; i ++)
		  {
			  int a = ( i % 2 == 0 ? 1 : -1);
			  sum +=  4.0 * a / ( 2 * i + 1 );
		  }		  
		  System.out.println("when i = " + j + " ,sum is " + sum);
	  }
	  		  	  
  }
}