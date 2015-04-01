public class E5_14 {
  public static void main(String[] args) {
	  final int I = 100;
	  
	  System.out.println("i\t\tm(i)");
	  for (int i = 10 ; i <= I ; i += 10)
	  {
		System.out.printf(i + "\t\t" + "%1.5f\n" , m(i));  
	  }			  
  }
  
  public static double m(int i) {	  
	  double m = 1;	
	  int count = -1;
	  
	  for (int j = 1 ; j < i ; j ++)
	  {
		 m += count * 1.0 / ( 2 * j + 1);
		 count *= -1;
	  }	  
	  m *= 4;
	  
	  return m;
  }
}
