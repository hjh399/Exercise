public class E4_18_4 {
  public static void main(String[] args) {
	  for ( int i = 6; i > 0 ; i--)
	  {  
		  for (int j = 1 ; j <= 6 - i ; j ++)
		  {			  
		  System.out.print("\t");			  
		  }

		  for (int k = 1 ; k <= i  ; k ++)
		  { 
		      System.out.print(k + "\t");          
		  }

		  System.out.println(" ");
	  }

  }
}	  