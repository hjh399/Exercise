import java.util.Scanner;

public class E3_17 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
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
				  break;
			  case 1:
				  System.out.println("The computer is rock. You are scissor. Computer won");
				  break;
			  case 2:
				  System.out.println("The computer is paper. You are scissor. You won");
				  break;
			  }
			  break;
		  case 1:
			  switch (computer)
			  {
			  case 0:
				  System.out.println("The computer is scissor. You are rock. You won");
				  break;
			  case 1:
				  System.out.println("The computer is rock. You are rock too. It is a draw");
				  break;
			  case 2:
				  System.out.println("The computer is paper. You are rock. Computer won");
				  break;
			  }
			  break;
		  case 2:
			  switch (computer)
			  {
			  case 0:
				  System.out.println("The computer is scissor. You are paper. Computer won");
				  break;
			  case 1:
				  System.out.println("The computer is rock. You are paper. You won");
				  break;
			  case 2:
				  System.out.println("The computer is paper. You are paper too. It is a draw");
				  break;
			  }
			  break;
		  }
	  
		  
  }
}
