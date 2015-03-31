public class E5_12 {
  public static void main(String[] args) {
	  final char CH1 = '1' ;
	  final char CH2 = 'Z' ;
	  final int NUMBER_PER_LIN = 10;
	  
	  printChars(CH1, CH2, NUMBER_PER_LIN);	  
  }
  
  public static void printChars(char ch1, char ch2, int numberPerLine) {	  
	  int count = 1;
	  for (char i = ch1 ; i <= ch2 ; i++ , count ++)
	  {
		  String a = (count % numberPerLine == 0)? "\n" : "\t" ;
		  System.out.print(i + a);
	  }
  }
}
