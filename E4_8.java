import java.util.Scanner;

public class E4_8 {
  public static void main(String[] args) {
	  System.out.println("Enter the number of students and their name and score :");
	  Scanner input = new Scanner(System.in);
	  int number = input.nextInt();
	  String name0 = " " ;
	  int score0 = 0;
	  
	  for (int i = 0; i < number ; i++)
	  {
		String name = input.next();
		int score = input.nextInt();
		if (score > score0)
		{
			name0 = name;
			score0 = score;
		}
	  }
	  
	  System.out.println("The best student is " + name0 + ", got " + score0 + " scores");
  }
}	  