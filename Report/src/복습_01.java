import java.util.Scanner; //module

public class 복습_01 {

	public static void main(String[] args) {
		// output
		System.out.println("Hello World");
		System.out.print("Hello~");
		System.out.printf("%c %d %.1f %s", 'A', 123, 222.3333, "안녕");
			// 콘솔 출력용
		System.out.println();
		
		// input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력숫자 = ");
		int number = sc.nextInt();
		
		System.out.print("이름 = ");
		String name = sc.next(); // next는 개행이 되는거고, nextline은 개행이 안된다.
		
		System.out.print("신장 = ");
		double height = sc.nextDouble();
		
		System.out.println("숫자: " + number + " 이름: " + name + " 신장: " + height);
		
		// variable(변수)의 자료형의 종류
		// 숫자
		// 정수
		byte by = 127;		// 1 byte 127 ~ -128 0111 1111 (127) 1111 1111 (255)
		short sh = 265;;	// 2 byte
		int i = 1024;		// 4 byte
		long l = 1234L;		// 8 byte
		
		// 소수
		float f = 123.4567f;	// 4 byte
		double d = 1234.5678;	// 8 byte
		
		// 문자
		char c = 'A';			// 2 byte
		String str = "hello";	
		
		System.out.println(c + " " + (int)c + " " + (char)33); 
		// 문자를 int 강제변환시 아스키 코드 숫자가 나옴 단 아스키 코드에 없는것은 이상한 값이 도출된다
				
		// 논리
		boolean b = true; // 1 byte = false
		
		// cast(변환)
		// 자동
		short sh1 = 1024;
		int num = sh1;
		double d1 = num;
		
		
		// 강제(cast)
		num = (int)d1;
		sh1 = (short)num;
		
		System.out.println("sh1: " + sh1);
		
		int num1 = 7, num2 = 2;
		System.out.println((double)num1 / num2); //하나만 바꿔도 제대로 된다
		
		// operator - 기본
		// + - * / %
		int result;
		result = num1 + num2;
		result = num1 - num2;
		result = num1 * num2;
		result = num1 / num2;	// num2가 0이면 오류발생
		result = num1 % num2;	// num2가 0이면 오류발생
		
		// operator - 논리
		// &&(and) ||(or) !(not)
		
		System.out.println(num1 > 0 && num2 < 10);
						//	true		true
		System.out.println(num1 <= 5 || num2 >= 1);
						//	false		true
		System.out.println(!(num1 >=10));
						// num1 < 10
		System.out.println(num1 ==1);
		System.out.println(num1 !=0);

		// 삼항연산자
		int n = ( num1 > 10  ? 20 : 10);
		System.out.println(n);
		
 
		
	}

}
