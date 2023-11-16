import java.util.Scanner;

public class Report05_A {

	public static void main(String[] args) {
		// 1 ~ 1000 사이에수를전부합친값을출력하라 1부터1000 사이수의합은:
		int count = 1;
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			sum = sum + count;
			count++;
		}
		System.out.println("총합:" + sum);
		
		// 1 ~ 100 사이에짝수의합과홀수의합을각각출력하도록작성하라
		int sum1, sum2;
		sum1 = sum2 = 0;
//		for (int i = 1; i <= 100; i=i+2) {
//			sum1 = sum1 + i
//		}
//		for (int i = 2; i <= 100; i=i+2) {
//			sum2 = sum2 + i	
//		}
//		System.out.println("홀수의 합: " + sum1);
//		System.out.println("짝수의 합: " + sum2);  // 위아래 같은방법 다른코드
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				sum1 = sum1 + i ;
			}
			else {
				sum2 = sum2 + i ;
			}
		}
		System.out.println("홀수의 합: " + sum2);
		System.out.println("짝수의 합: " + sum1);
		
		/*
		 	하나의수를입력받고10의배수로입력받
		 	은수는어느범위에있는지출력되는프로그램을작성하라(1 ~ 10, 11 ~ 20, 21 ~ 30 …)
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 >> ");
		int number = sc.nextInt();
		
		if(number > 0 && number <= 10) {
			System.out.println("number는 0보다 크고 10보다 작거나 같은 범위에 있습니다");
		}
		
		int n = 0;
		for(int i =0;i <10; i++) {
			n = 10 * i; // 0 10 20 ... 90
			if(number > n && number <= (n + 10)) {
			System.out.println("number는 " + n + "보다 크고 " + (n + 10) + "보다 작거나 같은 범위에 있습니다");
			}
		}
		
		// 임의수를입력받고그해당하는수의구구단을출력하는프로그램을작성하라
		System.out.print("출력할 구구단의 숫자입력 >> ");
		int num99 = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.print(num99 + " x " + i + " = " + (num99 *1) + " ");
		}

		// 구구단을1단부터9단까지출력하는프로그램을작성하라
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " x " + j + " = " + (i*j) + " ");				
			}
			System.out.println();
		}
		
		// 다음의모양이출력되도록작성하시오
		char c = '*';
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		// 
		int len = 0;
		for (int i = 0; i < 9; i++) {
			
			if(i < 5) len++;
			else	  len--;
			for (int j = 0; j < len; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		// if문의 궁금점: 하나의 처리를 사용할때에는 블록문을 생략하여도 상관없음
		if(true) {
			System.out.println("hello world");
		}
		
		if(true) System.out.println("hello world");
		
		
		
		
		
		
		
		
		
	}
	
}
