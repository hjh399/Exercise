public class E4_18_3 {
  public static void main(String[] args) {
	  for ( int i = 1; i <= 6 ; i++)
	  {
		  for (int j = 1 ; j <= 6 - i ; j ++)
		  {			  
			  System.out.print("\t");			  
		  }
		  
		  for (int k = i ; k > 0 ; k --)
		  { 
		      System.out.print(k + "\t");          
		  }

		  System.out.println(" ");
	  }

  }
}	  