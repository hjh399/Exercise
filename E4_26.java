public class E4_26 {
  public static void main(String[] args) {	  	  
	  	  	  
	  for (int j = 10000 ; j < 100001 ; j += 10000 )
	  {
		  double e = 1 ;
		  double item = 1;
		  
		  for ( int i = 1 ; i < j ; i ++)
		  {			  
			  item /= i;
			  e += item ;
		  }		  
		  System.out.println("when i = " + j + " ,e is " + e);
	  }
	  		  	  
  }
}