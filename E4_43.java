import java.util.Scanner;

public class E4_43 {
  public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the number of second: ");
	  int seconds = input.nextInt();
	  
	  long time = System.currentTimeMillis() / 1000 % 60 ;
	  long endTime = time + seconds;
	  	  
	  for ( int i = seconds - 1 ; i >= 0 ; i --)
	  {
		  int s = 0;
		  while (s == 0)
		  {
			  long nowTime = System.currentTimeMillis() / 1000 % 60 ;
			  if (endTime - nowTime <= i)
			  {
				  if (i == 1)
				  {
					  System.out.println(i + " second remaining");
				  }
				  else if (i == 0)
				  {
					  System.out.println("Stopped");
				  }
				  else
				  {
					  System.out.println(i + " seconds remaining");  
				  }				  
				  s = 1;
			  }
		  }		  
	  }	  
  }
}


