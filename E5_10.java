public class E5_10 {
  public static void main(String[] args) {
    System.out.println("The prime numbers < 10000 has ");
    printPrimeNumbers(10000);    
  }

  public static void printPrimeNumbers(int largerstNumber) {    
    int count = 0; // Count the number of prime numbers
    int number = 2; // A number to be tested for primeness

    // Repeatedly find prime numbers
    while (number < largerstNumber) 
    {
      // Print the prime number and increase the count
      if (isPrime(number)) 
      {
        count++; // Increase the count              
      }

      // Check if the next number is prime
      number++;
    }
    
    // Print the number of the prime number
    System.out.println("The prime numbers < 10000 has " + count);    
  }

  /** Check whether number is prime */
  public static boolean isPrime(int number) {
    for (int divisor = 2; divisor <= number / 2; divisor++) 
    {
      if (number % divisor == 0) { // If true, number is not prime
        return false; // number is not a prime
      }
    }

    return true; // number is prime
  }
}