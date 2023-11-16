import java.util.Scanner;

public class Report06 {

	public static void main(String[] args) {
		// TODO 과제 19
		Scanner sc = new Scanner(System.in);
		
		String str;
		System.out.print("변환할 영문자를 입력하시오 >> ");
		str = sc.next();
		char c = str.charAt(0);
		
		if((int)c >= 97 && (int)c <= 122 ) {
			str = str.toUpperCase();
			System.out.println(str);
		}
		else {
			str = str.toLowerCase();
			System.out.println(str);
		}
		
		// TODO 과제 20
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
		// TODO 과제 21
		double sum1 = 1, t = 1;
		for (int i = 3; i <= 100; i++) {
			sum1 = sum1 + t;
			t = sum1 - t;
			if(i==100) {
				 System.out.println("100번째 수열의 값 :" + sum1);
			}
		}
		
		
	}
}
