public class E4_3 {
  public static void main(String[] args) {
	  System.out.print("ç       áú");
	  for (int kg = 1; kg < 200 ; kg += 2)
	  {
		  double pound = kg * 2.2;
		  System.out.printf("\n%-10d%1.1f",kg,pound);
	  }
	  
  }
}