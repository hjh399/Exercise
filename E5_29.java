public class E5_29 {
  public static void main(String[] args) {
	  int dice1 = (int) (Math.random() * 7 );
	  int dice2 = (int) (Math.random() * 7 );
	  int dice = dice1 + dice2;
	  
	  System.out.printf("You rolled %1d + %1d = %1d\n", dice1, dice2, dice);
	  
	  if (dice == 3 || dice == 12)
	  {
		  System.out.println("You win");
	  }
	  else if (dice == 7 || dice == 11)
	  {
		  System.out.println("You lose");
	  }
	  else
	  {
		  System.out.printf("point is %1d\n", dice);
		  do{
			  dice1 = (int) (Math.random() * 7 );
			  dice2 = (int) (Math.random() * 7 );			  
		  }while ((dice1 + dice2 != 7 && dice1 + dice2 != dice));
		  
		  System.out.printf("You rolled %1d + %1d = %1d\n", dice1, dice2, dice1 + dice2);
		  
		  if (dice1 + dice2 == dice)
		  {
			  System.out.println("You win");
		  }
		  else if (dice1 + dice2 == 7)
		  {
			  System.out.println("You lose");
		  } 		  
	  }
  }
  
 
}