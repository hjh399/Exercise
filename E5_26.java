public class E5_26 {
	public static void main(String[] args) {		
		for (int i = 1, number = 2; i <= 100;number ++)
		{
			if (isPalindrome(number) && isPrimeNumber(number))
			{				
				System.out.printf("%6d", number);
				
				String s = (i % 10 == 0) ? "\n" : "\t";
				System.out.print(s);
				i ++;
			}
		}		
	}
	
	//	Return the reversal of an integer, i.e. reverse(456) returns 654  
	public static int reverse(int number) {	  
		String sum = "";	  
		while ( number != 0 )
		{
			int digit = number % 10;
			sum = sum + digit;
			number /= 10;
		}		
		int reverse = Integer.parseInt(sum);
		return reverse;
	  }
	  
	//  Return true if number is palindrome
	public static boolean isPalindrome(int number) {	  	
		return (reverse(number) == number)? true : false;		  
	  }
	
	//	Return true if number is primeNumber
	public static boolean isPrimeNumber(int number) {	
		boolean isPrimeNumber = true;
		
		for (int divisor = 2; divisor <= number / 2; divisor++) 
		{
		    if (number % divisor == 0) 
		    { // If true, number is not prime
		          isPrimeNumber = false; // Set isPrime to false          
		       break; // Exit the for loop
		    }		    
		}	 
		
		return isPrimeNumber;	    
	}
} 