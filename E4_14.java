public class E4_14 {
  public static void main(String[] args) {
	  int count = 0;
	  
	  for (int i = 33 ; i < 127 ; i ++ )
	  {		  
		  count ++;
		  System.out.print((count % 10 != 0) ? (char)i + "\t": (char)i + "\n");
	  }
//	    int count = 1;
//	    for (int i = '!'; i < '~'; i++) {
//	      System.out.print((count++ % 10 != 0) ? (char)i + " " :
//	        (char)i + "\n");
  }
}	  