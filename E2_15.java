

public class E2_15 {
	public static void main(String[] args) {

//		0����
		double sum = 100;
		double interestRate = 1 + 0.00417;
//		1����
		sum *= interestRate;
//		2����		
		sum += 100;
		sum *= interestRate;
//		3����
		sum += 100;
		sum *= interestRate;
//		4����
		sum += 100;
		sum *= interestRate;
//		5����
		sum += 100;
		sum *= interestRate;
//		6����
		sum += 100;
		sum *= interestRate;

		System.out.println("�����º�" + (int)(sum * 100) / 100.0 );

	}
}
 