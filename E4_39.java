public class E4_39 {
  public static void main(String[] args) {
	  final int basicSalary = 5000;
	  final int targetSalary = 30000;
	  
	  double salary = basicSalary;
	  double commission;
	  int sales;
	  
	  for (sales = 4000; salary < targetSalary ; sales ++)
	  {		  
		  salary = 0;
		  
		  if ( sales <= 5000 )
		  {
			  commission = sales * 8.0 / 100;
			  salary += commission ;
		  }
		  else if ( sales <= 10000 )
		  {			  
			  commission = 5000 * 8.0 / 100 + ( sales - 5000 ) * 10.0 / 100 ;
			  salary += commission;
		  }
		  else 
		  {			  
			  commission = 5000 * 8.0 / 100 + 5000 * 10.0 / 100 + ( sales - 10000 ) * 12.0 / 100;
			  salary += commission;
		  }		  
		  
	  }
	  System.out.print("sales must be up to at least " + sales);
	  	  
  }
}