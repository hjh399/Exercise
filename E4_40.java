public class E4_40 {
  public static void main(String[] args) {
	  int sum0 = 0;
	  int sum1 = 0;
	  
	  for (int i = 0 ; i < 1000000 ; i ++)
	  {
//		  int j = (int)(Math.random() * 100000) % 2;
		  int j = (int) (Math.random() * 2) ;
		  if ( j > 0.5 )
		  {
			  sum0 ++ ;
		  }
		  else
		  {
			  sum1 ++ ;
		  }
	  }	  
	  System.out.println("head count: " + sum0);
	  System.out.println("tail count: " + sum1);
  }
}


