import java.util.Scanner;

public class Report06_A {

	public static void main(String[] args) {
		// TODO 과제 19
		// 소문자를 대문자로 변경해서 출력하고
		// 대문자면 소문자로 출력하는 코드를 작성하라
		Scanner sc = new Scanner(System.in);

		System.out.print("변환할 영문자를 입력하시오 >> ");
		String str = sc.next();
		
		// 대문자/소문자의 판정
		char c = str.charAt(0);
		int char_num = (int)c;
		
		int upper = 0;
		if(char_num >= 65 && char_num <= 90 ) {
			str = str.toUpperCase();
			upper = 1;
		}
		else if(char_num >= 97 && char_num <= 122){
			str = str.toLowerCase();
			upper = 2;
		}
		else {
			upper = 3;
		}
		
		// 문자의 처리
		switch(upper) {
		case 1: // 대문자 -> 소문자
			char_num = char_num + 32;
			System.out.println((char)char_num);
			break;
		case 2: // 소문자 -> 대문자
			char_num = char_num - 32;
			System.out.println((char)char_num);
			break;
		default:
			System.out.println("영문자가 아닙니다");
			break;
		}
		
		// TODO 과제 20
		// 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("합계: " + sum);
		
		// TODO 과제 21
		// 피보나치
		// 0 1 1 2 3 5 8 13 21 34 ...
		// a b c
		//   a b c
		//     a b c
		
		long a, b, cc;
		long array[] = new long[100];
		
		a = 0;
		b = 1;
		
		array[0] = a;
		array[1] = b;
		
		int w = 0;
		while(w < 98) {
			
			cc = a + b;
			array[2 + w] = cc;
			a = b;
			b = cc;
			w++;
		}
		System.out.println(array[99]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
