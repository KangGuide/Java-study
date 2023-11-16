
public class Report01_A {

	public static void main(String[] args) {

		// (consloe)출력 (함수들)
		System.out.println("출력 문자열");
		System.out.print("출력 문자열");
		System.out.printf("%s %s", "출력", "문자열");  // %d = 숫자 / %s = 글자
		
		System.out.println();
		
		// escape sequence
		// \n(개행) \t(tab) \"(") \'(') \\(\)
		System.out.print("\"안녕하세요\n\\ 반갑습니다\"\n");
		
		// 상수 & 변수
		// 2진수   	0, 1
		// 8진수		0 ~ 7 
		// 10진수	0 ~ 9
		// 16진수	0 ~ 9 A ~ F(15) RGB: xxx,xxx,xxx -> aabbcc / Red: 255,0,0 -> ff0000
		//				16진수로 표현		  aa, bb, cc      0 ~ 255 -> 8bit
		//										   	  1111 1111   -> 2진수
		//  64bit ff000000ff000000 32bit ff000000 마지막 두개는 투명도
		// 변수 : 변경할 수 있는 메모리 공간
		int number, NUMBER, Number; // 대소문자를 구분하기 때문에 다 다르다.
		int charNumber; // 실제로는 중간에 대문자 한개씩 넣어서 구분하여 많이 사용한다.
		int char_number; // 언더바는 요즘에는 거의 안쓰는 추세로 변경중이다.
		
		//숫자
		// 정수
		byte by; // byte(1)<short(2)<int(4)<long(8)  그릇의 크기
		short sh;
		int i;   // 실무에서 가장 많이 사용됨
		long l;
		
		// 소수
		float f;  //4  
		double d; //8 실무에서 가장많이 사용됨
		
		//문자
		char c = 'A';  //2
		String str = "Hello world"; // 큰 문자를 사용하기 위해 누군가 만든것
		
		//논리
		boolean b = true; //1
		
		/*
		  //풀이 과제 3, 4
		 
		  // 과제 3 해설
		  int = age;
		  double = name;
		  이런식으로 먼저 변수를 설정하고 값을 준다음 코드를 사용하여 출력한뒤
		  그다음 변수값을 변경하여 다시 출력 반복
		  age = 20;
		  name = "홍길동"
		  System.out.println(변수값 넣기);
		  age = 18
		  name = "일지매" 
		  System.out.println(변수값 넣기);
		  
		  
		  // 과제4 스왑는법
		  int a = 1;
		  int b= 2;
		  int temp; buffer(저장소)
		  
		  temp = a;
		  a = b;
		  b = temp;
		  
	
		 */
		
		
		
	}

}
