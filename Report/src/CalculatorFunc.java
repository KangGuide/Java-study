import java.util.Scanner;

public class CalculatorFunc {

	public static void main(String[] args) {
		// TODO 계산기 프로그램 함수화

		/*
		Scanner sc = new Scanner(System.in);
		int number1;
		while(true) {
			System.out.print("첫번째 수 = ");
			String numStr1 = sc.next();

			// 숫자인지 검사
			boolean isNum = true;
			for (int i = 0; i < numStr1.length(); i++) {
				int n = numStr1.charAt(i);
				if(n < 48 || n > 57) {
				isNum = false;
				break;
				}
			}
			// 문자열 -> 숫자
			if(isNum) { // 정상적으로 숫자가 입력된 경우
				number1 = Integer.parseInt(numStr1);
				break;
			}
			System.out.println("정확히 숫자를 입력해 주십시오");
		} //숫자입력 무한루프


			// int number1 = sc.nextInt();

			System.out.print("(+, -, *, /) = ");
			String oper = sc.next();

			System.out.print("두번째 수 = ");
			int number2 = sc.nextInt();

			// calculator
			int result = calculator(number1, number2, oper);
			
			// print
			System.out.println(number1 + " " + oper + " " + number2 + " = " + result);

	}
	
	// TODO 연산함수 제작
	static int calculator(int num1, int num2, String oper) {
		int result = 0;
		switch(oper) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
		}
		return result;
		*/
	// TODO 계산기 프로그램2 시작
	
	boolean b = true;
	while(b == true) {
	// 변수선언
	int num[] = new int[3];
	String oper;
	// 입력
	oper = input(num);
	
	// 처리
	num[2] = calculator(num, oper);
		
	// 출력
	b = print(num, oper);
	
	}		
	}

	//TODO input
	static String input(int num[]) {
	Scanner sc = new Scanner(System.in);	
	while(true) {
		System.out.print("첫번째 수 = ");
		String numStr1 = sc.next();

		// 숫자인지 검사 (또한 함수로 변경가능)
		boolean isNum = true;
		for (int i = 0; i < numStr1.length(); i++) {
			int n = numStr1.charAt(i);
			if(n < 48 || n > 57) {
			isNum = false;
			break;
			}
		}
		// 문자열 -> 숫자
		if(isNum) { // 정상적으로 숫자가 입력된 경우
			num[0] = Integer.parseInt(numStr1);
			break;
		}
		System.out.println("정확히 숫자를 입력해 주십시오");
	}
	System.out.print("(+, -, *, /) = ");
	String oper = sc.next();

	while(true) {
		System.out.print("두번째 수 = ");
		String numStr2 = sc.next();

		// 숫자인지 검사
		boolean isNum = true;
		for (int i = 0; i < numStr2.length(); i++) {
			int n = numStr2.charAt(i);
			if(n < 48 || n > 57) {
			isNum = false;
			break;
			}
		}
		// 문자열 -> 숫자
		if(isNum) { // 정상적으로 숫자가 입력된 경우
			num[1] = Integer.parseInt(numStr2);
			break;
		}
		System.out.println("정확히 숫자를 입력해 주십시오");
	}
	
	return oper;
	}

	// TODO 계산처리
	static int calculator(int num[], String oper) {
		int result = 0;
		int num1 = num[0], num2 = num[1];
		switch(oper) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
		}
		return result;
	}
	
	// TODO 출력 및 무한루프
	static boolean print(int num[], String oper) {
		Scanner sc = new Scanner(System.in);
		System.out.println(num[0] + " " + oper + " " + num[1] + " = " + num[2]);
		
		System.out.print("초기화 하려면 y를 입력해주세요 >> ");
		String re = sc.next();
		char c = re.charAt(0);
		if(c == 'y') return true;
		else return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
