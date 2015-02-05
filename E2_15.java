

public class E2_15 {
	public static void main(String[] args) {

//		0个月
		double sum = 100;
		double interestRate = 1 + 0.00417;
//		1个月
		sum *= interestRate;
//		2个月		
		sum += 100;
		sum *= interestRate;
//		3个月
		sum += 100;
		sum *= interestRate;
//		4个月
		sum += 100;
		sum *= interestRate;
//		5个月
		sum += 100;
		sum *= interestRate;
//		6个月
		sum += 100;
		sum *= interestRate;

		System.out.println("六个月后：" + (int)(sum * 100) / 100.0 );

	}
}
 