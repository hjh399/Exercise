public class E3_24 {
  public static void main(String[] args) {
	  
	  int sizeNumber = (int)(Math.random() * 4);
	  int flowerNumber = (int)(Math.random() * 13);
	  
	  String size = "wrong";
	  String flower = "wrong";
	  
	  switch (sizeNumber)
	  {
	  case 0 :
		  size = "Clubs";
		  break;
	  case 1 :
		  size = "Diamond";
		  break;
	  case 2 :
		  size = "Heart";
		  break;
	  case 3 :
		  size = "Spades";
		  break;
	  }
	  
	  switch (flowerNumber)
	  {
	  case 0 :
		  flower = "Ace";
		  break;
	  case 1 :
		  flower = "2";
		  break;
	  case 2 :
		  flower = "3";
		  break;
	  case 3 :
		  flower = "4";
		  break;
	  case 4 :
		  flower = "5";
		  break;
	  case 5 :
		  flower = "6";
		  break;
	  case 6 :
		  flower = "7";
		  break;
	  case 7 :
		  flower = "8";
		  break;
	  case 8 :
		  flower = "9";
		  break;
	  case 9 :
		  flower = "10";
		  break;
	  case 10 :
		  flower = "Jack";
		  break;
	  case 11 :
		  flower = "Queen";
		  break;
	  case 12 :
		  flower = "King";
		  break;		  
	  }	
	  
	  System.out.println("The card youy picked is " + flower + " of " + size);	  	  
  } 
}  

//public class Exercise3_24 {
//  public static void main(String[] args) {
//    final int NUMBER_OF_CARDS = 52;
//    
//    // Pick a card
//    int number = (int)(Math.random() * NUMBER_OF_CARDS);
//
//    System.out.print("The card you picked is ");
//    if (number % 13 == 0)
//      System.out.print("Ace of ");
//    else if (number % 13 == 10)
//      System.out.print("Jack of ");
//    else if (number % 13 == 11)
//      System.out.print("Queen of ");
//    else if (number % 13 == 12)
//      System.out.print("King of ");
//    else
//      System.out.print((number % 13) + " of ");
//
//    if (number / 13 == 0)
//      System.out.println("Clubs");
//    else if (number / 13 == 1)
//      System.out.println("Diamonds");
//    else if (number / 13 == 2)
//      System.out.println("Hearts");
//    else if (number / 13 == 3)
//      System.out.println("Spades");
//  }
//}