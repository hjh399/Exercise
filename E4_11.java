public class E4_11 {
  public static void main(String[] args) {
	  int count = 0;
	  
	  for (int i = 100 ; i < 201 ; i ++)
	  {
		  if (i % 5 == 0 ^ i % 6 == 0)
		  {
			  count ++;
			  System.out.print((count % 10 != 0) ? i + "\t": i + "\n");			  
		  }
	  }
      	  
  }
}	  