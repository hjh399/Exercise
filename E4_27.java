public class E4_27 {
  public static void main(String[] args) {	  	  
	  	  	  
	  int numberOfYear = 0;
		  
	  for ( int year = 2001 ; year < 2101 ; year ++)
	  {			  
		  if ( (year % 4 == 0 && year % 100 != 0) ||  year % 400 == 0 )
		  {			  
			  numberOfYear ++;
			  String a = (numberOfYear % 10 == 0) ?  "\n" : "\t" ;
			  System.out.print(year + a);  			  
		  }
	  }		  		  	  
  }
}