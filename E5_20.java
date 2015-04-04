public class E5_20 {
  public static void main(String[] args) {
	  System.out.println("角度\t\t正弦值ֵ\t\t余弦值");
	  
	  for (int degree = 0 ; degree < 361 ; degree += 10)
	  {
		  System.out.print(degree + "\t\t");
		  System.out.printf("%1.4f\t\t",Math.sin(Math.toRadians(degree)));
		  System.out.printf("%1.4f\n",Math.cos(Math.toRadians(degree)));
	  }
	} 
} 