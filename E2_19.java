public class E2_19 {
	public static void main(String[] args) {

		long totalSeconds = System.currentTimeMillis();
		
//		(totalSeconds % 26)����õ�0-25������65-90��ASCII����д��ĸ�ַ�
		int num = (int)(totalSeconds % 26) + 65;
		
        System.out.println((char)num);  
	}
}

 