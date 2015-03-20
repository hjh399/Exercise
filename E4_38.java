import java.util.Scanner;
public class E4_38 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the number :");
	  int number = input.nextInt();
	  
	  String number16 = "";
	  
	  while (number != 0)
	  {		  
		  int a = number % 16 ;
		  
		  switch (a)
		  {
		  case 0:number16 = a + number16 ;
		  		break;
		  case 1:number16 = a + number16 ;
	  		break;
		  case 2:number16 = a + number16 ;
	  		break;
		  case 3:number16 = a + number16 ;
	  		break;
		  case 4:number16 = a + number16 ;
	  		break;
		  case 5:number16 = a + number16 ;
	  		break;
		  case 6:number16 = a + number16 ;
	  		break;
		  case 7:number16 = a + number16 ;
	  		break;
		  case 8:number16 = a + number16 ;
	  		break;
		  case 9:number16 = a + number16 ;
	  		break;
		  case 10:number16 = "a" + number16 ;
	  		break;
		  case 11:number16 = "b" + number16 ;
	  		break;
		  case 12:number16 = "c" + number16 ;
	  		break;
		  case 13:number16 = "d" + number16 ;
	  		break;
		  case 14:number16 = "e" + number16 ;
	  		break;
		  case 15:number16 = "f" + number16 ;
	  		break;		  
		  }	
		  
		  number /= 16;
	  }
	  
	  System.out.println(number16);
	  
  }
}