
public class MainClass {
	public static void main(String[] args) {
		
		/*
		 	bit operator
		 	lower level, (고급)연산자
		 	(처리)속도가 빠르다
		 	
		 	bit : 0(false), 1(true)
		 	
		 	&	AND
		 	|	OR
		 	^	XOR				-> 보안
		 	<<	Left Shift
		 	>>	Right Shift
		 	~	NOT
		 	
		 	1100 1010
		 	C	 A
		 	
		 	1111 0000
		 	F	 0
		*/
		 
		 // AND
		 /*
		 	1	0 1
		 	0	0 0 
		 		0 1
		 		
		 	1100 1010
		 	1111 0000
		 	1100 0000
		 	C	 0	
		 		
		 */
		
		int result = 0xCA & 0xF0; //16진수는 표기가 가능하고 작성시 대소문자 구분하지 않아도됨
		System.out.println(result);
		System.out.printf("%x\n", result); // 16진수로 보는법
		
		
	 	// or
		/*
	 		1	1 1
	 		0	0 1 
	 			0 1
	 		
	 		1100 1010
	 		1111 0000
	 		1111 1010
	 		F	 A	
	 		
	    */
		
		result = 0xCA | 0xF0; 
		System.out.println(result);
		System.out.printf("%x\n", result); 
		
		// XOR
		/*
		 	1	1 0
	 	 	0	0 1 
	 			0 1
		 
		 	1100 1010
	 		1111 0000
	 		0011 1010
	 		3	 A
	 		
	 		1100 1010				-> 중요 데이터
	 		1111 0000				-> key(password)
	 		0011 1010	-> 결과		-> 암호화
	 		1111 0000	-> 다시 연산	-> key
	 		1100 1010	-> 원상 복귀	-> 복호화
		 */
		result = 0xCA ^ 0xF0; 
		System.out.println(result);
		System.out.printf("%x\n", result); 
		
		// Left Shift	* 2
		byte by1;
		by1 = 0x38 << 1;
		System.out.println(by1);
		
		// Right Shift	/ 2
		by1 = 0x38 >> 1;
		System.out.println(by1);
		
		// ~	0 -> 1	1 -> 0
		byte by2 = ~0x2a;	// 0010 1010
							// 1101	0101
							// D	5
		System.out.printf("0x%x", by2);
		
		
	}
}
