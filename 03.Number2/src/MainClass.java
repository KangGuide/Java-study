
public class MainClass {

	public static void main(String[] args) {
		
		// 변수의 자료형(그릇)의 종류
		// 숫자형
		// 정수
		byte by; // 1 byte == 8 bit ->256개(2^8)
		by = 123;
		System.out.println(by); // 127 ~ -128 (변수선언을 byte로 했기 때문)
		
		short sh; // 2 byte
		sh = 12345;
		
		int i; // 4byte
		i = 1234567000;
		i= 123456789;
		System.out.print(i);
		
		long lo;
		lo = 123444;
		System.out.println(lo);
		
		//소수
		float f;
		f = 123.3456789f;
		System.out.println(f);
		
		double d;
		d = 123.456789012;
		System.out.println(d);
		
		
		// 문자형
		// 문자
		char c;     // 2 byte character <- unicode  ASCII code
		c = 'a';
		c = '한';
		c = '+';
		c = 'A';
	//	c = 'ab';
		System.out.println(c);
		
		// 문자열
		// String == wrapper class
		String str;
		str = "hello";
		System.out.println(str);
		
		str = "world";
		System.out.println(str);
		
		
		// 논리형(참/거짓) true(1)/false(0)
		boolean b;
		b = true;
		System.out.println(b);
		b = false;
		System.out.println(b);
		

	}

}
