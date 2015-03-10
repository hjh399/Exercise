public class E4_6 {
  public static void main(String[] args) {
	  System.out.print("‰p—¢        ç•Ä         ç•Ä        ‰p—¢");
	  for (int km = 1,mile = 20; km < 11; km ++ , mile += 5)
	  {
		  double miles = km * 1.609;
		  double kms = mile / 1.609;
		  System.out.printf("\n%-10d%-7.3f",km,miles);
		  System.out.printf("\t%-10d%1.3f",mile,kms);
	  }
	  
  }
}	  