
public class MainClass {

	public static void main(String[] args) {
		
		// 논리 연산자(trule/false)
		/*
		 	&&	and		a 그리고 b
		 	||	or		a 또는 b
		 	!	not		...아닌
		 	
		 	제어문과 같이 사용하는 경우가 많다
		 	(if, while)
		 	
		 	> < >= <= == 비교 연산자
		 */
		int number = 0;
		// AND
		/*
		 	false false -> false 0 0 -> 0
		 	false true 	-> false 0 1 -> 0
		 	true false 	-> false 1 0 -> 0
		 	true true 	-> true  1 1 -> 1
		 */
		System.out.println(number >= 0 && number < 10);
		System.out.println(number > 0 && number < 10);
		
		// OR
		/*
	 	false false -> false 0 0 -> 0
	 	false true 	-> true	 0 1 -> 1
	 	true false 	-> true	 1 0 -> 1
	 	true true 	-> true  1 1 -> 1
		 */
		System.out.println(number > 0 || number < 10);
		System.out.println(number < 0 || number > 10);
		
		// OR
		/*
			false	-> true
			true	-> false  
		 */
		System.out.println(number == 0);
		System.out.println(number != 10);
		System.out.println(number != 0);
		
		System.out.println( !(number > -5 && number < 0)); // 하지만 이렇게 쓰는건 좋지않다
		// !(not)과 &&(and)등 논리연산자를 겹쳐서 적용이 가능하다
		System.out.println( number <= -5 || number >= 0); //!의해 뒤집힌 조건
		
//		System.out.println(number !> 5); <- 사용못함 !뒤에는 = 가능 / > < 불가능
		System.out.println(!(number > 5)); // 이건 사용 가능함 조건이 뒤집혀서
		
		// 삼항연산자
		/*
		  조건에 따라서 값을 대입
		  값 = (조건) ? "값1" : "값2" 알아보기 쉽게 한모양 원래는 띄어쓰기 잘안한다
		 */
		char c;
		c = (number > 0) ? 'Y' : 'N';
		System.out.println("c:" + c);
		
		int n;
		n = (number % 2 == 0) ? 2 : 1;
		System.out.println("n:" + n);
		
		String answer;
		answer = (number >= 3) ? "3보다 크거나 같다" : "3보다 작다";
		System.out.println(answer);
		
		
		
		
		
		
		
		
		
	}

}
