public class E4_44 {
  public static void main(String[] args) {
	  
	    final int NUMBER_OF_TRIALS = 1000000;
	    int numberOfHits = 0;

	    for (int i = 0; i < NUMBER_OF_TRIALS; i++) 
	    {
	      double x = Math.random() * 2.0 - 1;
	      double y = Math.random() * 2.0 - 1;
	      if ( x <= 0 || ( y > 0 && y < -x + 1) )
	        numberOfHits ++;
	    }
	    
	    double probability = numberOfHits * 1.0 / NUMBER_OF_TRIALS ;
	    
	    System.out.println("The probability is " + probability );	  	
  }
}



