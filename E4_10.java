public class E4_10 {
  public static void main(String[] args) {
	  int sum = 0;
	  
	  for (int i = 100 ; i < 1001 ; i ++)
	  {
		  if (i % 5 == 0 && i % 6 == 0)
		  {
			  sum ++;
			  if (sum % 10 == 0)
			  {
				  System.out.print( i + "\n"); 
			  }
			  else
			  {
				  System.out.print( i + "\t");  
			  }
		  }
	  }
//      System.out.print((count++ % 10 != 0) ? i + " ": i + "\n");	  
  }
}	  