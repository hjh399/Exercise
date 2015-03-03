import java.util.Scanner; 

public class E3_14 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int number = (int)(Math.random() * 2);

    System.out.print("Enter 0 or 1 :");
    int guess = input.nextInt();
    
    if (guess == number)
    {
    	System.out.println("well done");
    }
    else
    {
    	System.out.println("wrong");
    }
    
  }
}


