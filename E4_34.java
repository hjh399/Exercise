import java.util.Scanner;

public class E4_34 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);

	  
	  int computerWin = 0;
	  int guessWin = 0;
	  
	  while (computerWin < 2 && guessWin < 2)
	  {
		  System.out.print("scissor (0), rock (1), paper (2):");
		  
		  int computer = (int)(Math.random() * 3);
		  int guess = input.nextInt();
		  
		  switch (guess)
		  {
		  case 0:
			  switch (computer)
			  {
			  case 0:
				  System.out.println("The computer is scissor. You are scissor too. It is a draw");
				  computerWin = 0;
				  guessWin = 0;
				  break;
			  case 1:
				  System.out.println("The computer is rock. You are scissor. Computer won");
				  computerWin ++;
				  guessWin = 0;
				  break;
			  case 2:
				  System.out.println("The computer is paper. You are scissor. You won");
				  computerWin = 0;
				  guessWin ++;
				  break;
			  }
			  break;
		  case 1:
			  switch (computer)
			  {
			  case 0:
				  System.out.println("The computer is scissor. You are rock. You won");
				  computerWin = 0;
				  guessWin ++;
				  break;
			  case 1:
				  System.out.println("The computer is rock. You are rock too. It is a draw");
				  computerWin = 0;
				  guessWin = 0;
				  break;
			  case 2:
				  System.out.println("The computer is paper. You are rock. Computer won");
				  computerWin ++;
				  guessWin = 0;
				  break;
			  }
			  break;
		  case 2:
			  switch (computer)
			  {
			  case 0:
				  System.out.println("The computer is scissor. You are paper. Computer won");
				  computerWin ++;
				  guessWin = 0;
				  break;
			  case 1:
				  System.out.println("The computer is rock. You are paper. You won");
				  computerWin = 0;
				  guessWin ++;
				  break;
			  case 2:
				  System.out.println("The computer is paper. You are paper too. It is a draw");
				  computerWin = 0;
				  guessWin = 0;
				  break;
			  }
			  break;
		  }
  
	  }
	  
	  if (computerWin > 0)
	  {
		  System.out.println("Computer won more than two times");  
	  }	  	  
	  else
	  {
		  System.out.println("You won more than two times");
	  }
		  
  }
}