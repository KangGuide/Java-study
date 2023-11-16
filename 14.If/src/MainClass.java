
public class MainClass {

	public static void main(String[] args) {
		/*
		  조건문
		  
		  논리연산자: && || !
		  
		  부등호: > < >= <= == !=
		  
		  형식:
		  	  if( 조건(true/false) ) {
		  	  	  처리
		  	  }
		  	
		 	
		 */
		int number = 1;
		
		if( number == 1 ) {
			System.out.println("number는 1입니다");
		}
		
		if( number > 0 && number < 10 && number != 5 ) {
			System.out.println("number는 0보다 크고 10보다 작다");
		}
		
		if( number < 5 || number > 10) {
			System.out.println("number는 5보다 작거나 10보다 크다");
		}
		
		if( true ) {
			System.out.println("무조건 실행!");
		}
		
		boolean b = true;
		
		if( b == true) {
			System.out.println("b 는 true입니다");
		}
		if( b ) {
			System.out.println("b == true입니다");
		}
		
		b = false;
		
		if(b == false) {
			System.out.println("b 는 false입니다");
		}
		if( !b ) {
			System.out.println("b == false입니다");
		}
		
		String str = "";
		String msg = "hell";
		
		str = "hello";
		msg = msg + "o";
		
		if(str == msg) {
			System.out.println("같은 문자입니다");
		}
		
		boolean b1 = str.equals(msg);
//		if( b1 == true)
//		if( str.equals(msg) == true)	
		if(str.equals(msg)) {			// 위에서 부터 밑으로 변화한다 결론은 다같은거
			System.out.println("같은 문자입니다");
		}
		if(str.length() == 5) {
			System.out.println("str은 5개의 문자입니다");
		}
		
		// str 이 빈문자열이 아닐 경우
		if(str != "") {
			System.out.println("str은 빈 문자열이 아닙니다");
		}
		if(!str.equals("")) {
			System.out.println("str은 빈 문자열이 아닙니다");
		}
		
		/*
		   형식:
		   		if( 조건 ){
		   			처리1
		   		}
		   		else{
		   			 처리2
		   		}
		   		
		 */
		
		number = 5;
		
		if(number > 5) {
			System.out.println("number는 5보다 크다");
		}
		else {
			System.out.println("number는 5보다 작거나 같다");
		}
		
		String s = (number > 5) ? "number는 5보다 크다" : "number는 5보다 작거나 같다";
		System.out.println(s);
		// if else는 삼항연산자와 기능이 거의 같다 단 조건이 하나일경우
		
		number = 70;
		
		if(number == 100) {
			System.out.println("A+입니다");
		}
		else if(number >=90) {
			System.out.println("A입니다");
		}
		else if(number >=80) {
			System.out.println("B입니다");
		}
		else {
			System.out.println("C 또는 이하입니다");
		}
		
		number = 86;
		
		// 조건문 안의 조건문
		if(number >= 85 && number < 90) {
			System.out.println("합격입니다");
		}
		else{
			System.out.println("불합격입니다");
		} //위와 아래가 동일한 방법이지만 아래는 조건문 안의 조건문이다
		if(number >= 80 && number < 90) {
			if(number >= 85) {
				System.out.println("합격입니다");
			}
			else{
				System.out.println("불합격입니다");
			}
		}
		
		// 중첩에 중첩 if 와 elseif 사용
		number = 84;
		if(number >= 80 && number < 90) {
			if(number >= 85) {
				if(number >= 87) {
					System.out.println("87보다는 크고 90보다는 작습니다");
				}
				else{
					System.out.println("85보다는 크거나 같고 87보다는 작습니다");
				}
			}
			else{
				System.out.println("85보다 작고 80보다 크거나 같습니다");
			}
		}
		
		
		
		
	}

}
