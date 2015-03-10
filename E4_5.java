public class E4_5 {
  public static void main(String[] args) {
	  System.out.print("ç        áú            áú        ç");
	  for (int kg = 1,pound = 20; kg < 200; kg += 2, pound += 5)
	  {
		  double pounds = kg * 2.2;
		  double kgs = pound / 2.2;
		  System.out.printf("\n%-10d%1.1f",kg,pounds);
		  System.out.printf("\t\t%-10d%1.2f",pound,kgs);
	  }
	  
  }
}	  