public class E4_33 {
  public static void main(String[] args) {
	  
	  System.out.print("the number is ");
	  
	  for (int i = 6 ; i < 10001 ; i ++)
	  {
		  int sum = 1;		  
		  
		  for (int factor = 2 ; factor < i ; factor ++)
		  {
			  if (i % factor == 0)
			  {
				  sum += factor;
			  }			  
		  }
		  
		  if (sum == i)
		  {
			  System.out.printf("%4d   " , i);
		  }
	  }	  
  }
}