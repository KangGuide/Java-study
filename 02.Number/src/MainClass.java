
public class MainClass {

	public static void main(String[] args) {
		/*
			숫자(상수) : 정해진 숫자. 12, 45, ...
				2진수 : 0, 1
				8진수 : 0 ~ 7 -> 8 == 10 => 010
				10진수 : 0 ~ 9 
				16진수 : 0 ~ 9 A B C D E F(15) -> 0xf => 255 => 0xff
				
				1010 1100
				8421 8421
				A    C  -> 0xAC
				
				16진수 -> 2진수
				F    3
				1111 0011
			
			
			변수(Variable) : 변경되는 수
			   별명을 작명해서 그 이름에 값을 넣는다.
			   그릇(크기, 자료형)
			   변수의 작명은 선택
			   
			자료형 변수명; <- 변수 선언
			변수명 = 값;  <- 대입
			
			int number;
			number = 135;
			
			
		*/
		
		System.out.println(010);
		System.out.println(0xac);
		
		int number;
		number = 123;
		System.out.println(number);
		
		int num = 234;
		System.out.println(num);
		
		number = num;
		System.out.println(number);
		
		/* 
		   변수의 작명(규칙)
		   int a;  -> 너무 간단한 변수 이름 안됨  integer(정수)
		   int A:
		   
		   예약어
		   int int; int는 작성이 불가
		   
		   int 2aa; 맨앞에 숫자는 안됨  int aa2; (O) 숫자를 영문 뒤로 옮겨야함
		   
		   int 123; 상수만으로 이루어진 변수는 사용못함
		   
		   int _abc; // + - * 연산자는 안됨 int -abc;(X)
		   
		   int number_position_char; 안되는건 아니나 너무길면 코드작성할때 힘들다
		   int numPosChar;   줄여서 작성할때 단어의 첫번째를 대문자로 바꾸면 알기 편하다
		   낙타형 -> 많이 사용		   
		*/
		
		int 마징가;
		마징가 = 1123;
		System.out.println(마징가);
		
		int iCharPos;
		iCharPos = 마징가;
		System.out.println(iCharPos);
		
		// 흔한 변수명은 피하는 것이 좋다
		// object, length, number, size
		
		
		

	}

}
