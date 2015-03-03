public class E3_16 {
  public static void main(String[] args) {
	  int number = 0;
	  while (number < 64)
	  {
		  number = (int)(Math.random() * 91) ;  
	  }
	  char num = (char)number; 
	  System.out.println(num);
//	  System.out.println((char)('A' + Math.random() * 27));
  }
}

