public class E5_13 {
  public static void main(String[] args) {
	  final int I = 20;
	  
	  System.out.println("i\t\tm(i)");
	  for (int i = 1 ; i <= I ; i ++)
	  {
		System.out.printf(i + "\t\t" + "%1.4f\n" , m(i));  
	  }			  
  }
  
  public static double m(int i) {	  
	  double m = 0;
	  
	  while (i > 0)
	  {
		  m += i / (double)(i + 1);
		  i -- ;
	  }
	  
	  return m;
  }
}
