public class E2_19 {
	public static void main(String[] args) {

		long totalSeconds = System.currentTimeMillis();
		
//		(totalSeconds % 26)随机得到0-25的数；65-90是ASCII码表大写字母字符
		int num = (int)(totalSeconds % 26) + 65;
		
        System.out.println((char)num);  
	}
}

 