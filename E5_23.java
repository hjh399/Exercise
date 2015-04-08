public class E5_23 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i ++)
		{
			String a = (i % 10 != 0)? "\t" : "\n";
			System.out.print(getRandomUpperCaseLetter() + a);
		}
		
		for (int i = 1; i <= 100; i ++)
		{
			String a = (i % 10 != 0)? "\t" : "\n";
			System.out.print(getRandomDigitCharacter() + a);
		}		
	}
	
	/** Generate a random uppercase letter */
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	/** Generate a random digit character */
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}
	
	/** Generate a random character between ch1 and ch2 */
	public static char getRandomCharacter(char ch1, char ch2) {		
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}

} 