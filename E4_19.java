public class E4_19 {
  public static void main(String[] args) {
	  for ( int i = 1; i < 9 ; i++)
	  {  
		  for (int j = 1 ; j <= 8 - i ; j ++)
		  {			  
		  System.out.print("\t");			  
		  }

		  for (int k = 1 ; k <= Math.pow(2, i-1)  ; k *= 2)
		  { 
		      System.out.printf("%3d\t", k);
		  }
		  
		  for (int k = (int)(Math.pow(2, i-2)) ; k > 0  ; k /= 2)
		  { 
		      System.out.printf("%2d\t", k);
		  }

		  System.out.println(" ");
	  }

  }
}	  