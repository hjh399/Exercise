import java.util.Scanner;
public class E4_9 {
  public static void main(String[] args) {
	  System.out.println("Enter the number of students and their name and score :");
	  Scanner input = new Scanner(System.in);
	  int number = input.nextInt();
	  String name0 = " " ;
	  int score0 = 0;
	  String name1 = " " ;
	  int score1 = 0;
	  
	  for (int i = 0; i < number ; i++)
	  {
		String name = input.next();
		int score = input.nextInt();
		
		if (score > score1)
		{
			name1 = name0;
			score1 = score0;
			
			name0 = name;
			score0 = score;
		}
		else if (score > score1)
		{
			name1 = name;
			score1 = score;
		}
	  }
	  
	  System.out.println("The NO.1 student is " + name0 + ", got " + score0 + " scores");
	  System.out.println("The NO.2 student is " + name1 + ", got " + score1 + " scores");
  }
}	  