public class E5_11 {
  public static void main(String[] args) {
	  System.out.println("销售总额\t\t酬金");
	  
	  for (int salesAmount = 10000 ; salesAmount < 100001 ; salesAmount += 5000)
	  {
		  System.out.println(salesAmount + "\t\t" + computeCommission(salesAmount));
	  }  	  	  
  }
  
  public static double computeCommission(double salesAmount) {	  
	  double computeCommission;
	  if ( salesAmount <= 5000 )
	  {
		  computeCommission = salesAmount * 8.0 / 100;		  
	  }
	  else if ( salesAmount <= 10000 )
	  {			  
		  computeCommission = 5000 * 8.0 / 100 + ( salesAmount - 5000 ) * 10.0 / 100 ;
	  }
	  else 
	  {			  
		  computeCommission = 5000 * 8.0 / 100 + 5000 * 10.0 / 100 + ( salesAmount - 10000 ) * 12.0 / 100;
	  }		  
	  
	  return computeCommission;
  }
}
