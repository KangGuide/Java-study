
public class MainClass {

	public static void main(String[] args) {
		/*
		  	Operator (연산자)
		  	+ - * / %
		  	/ : 몫
		  	% : 나머지
		  	
		 */
		
		int num1, num2;
		int result;
		
		num1 = 25;
		num2 = 7;
		
		result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		
		result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
		
		result = num1 % num2;
		System.out.println(num1 + " % " + num2 + " = " + result);
		
		// 주의점 / % 나누려고 하는 값이 0일경우 계산불가
		num1 = 3;
		num2 = 0;
		
		// 자기 자신(변수)의 값을 갱신
		int number =1;
		number = number + 1;
		System.out.println(number);
		
		number += 1; // 위쪽 방법과 똑같지만 이방법이 최신방법
		System.out.println(number);
		
		// increment(증가) ++, decrement(감소) --
		number++; // number = number + 1;
		++number; // number = number + 1;
		System.out.println(number);
		
		number--; // number = number - 1;
		--number; // number = number - 1;
		System.out.println(number);
		
		// 주의점
		// 일반 연산자와 increment를 같이 사용하는 경우(혼용)
		number = 1;
		
		int tag;
		tag = number++; //일반 연산이 먼저 계산되고 그다음 ++ 연산이된다
		System.out.println("tag: " + tag + " number: " + number);
		
		number =1;
		tag = ++number; // ++앞에 사용했을경우 먼저 연산후 일반 연산이 나중에 된다
		System.out.println("tag: " + tag + " number: " + number);
		
		number =1;
		tag = (number++); // 일반 연산에서는 괄호가 먼저 연산이 되지만 혼용할때에는 소용없다
		System.out.println("tag: " + tag + " number: " + number);
		
		// result = a + b * c; 
		// 일반 수학 원리와 같다 () -> * / -> + - 순으로 동시에 있을경우 왼쪽부터 순차적으로 계산
		int a, b, c;
		a = 2;
		b = 3;
		c = 4;
		result = a + b * c;
		System.out.println(result);
		
		
		
		
	}

}
