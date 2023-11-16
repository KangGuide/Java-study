import java.util.Scanner;

public class Report07_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1 ~ 100 사이의 10개의 수를 입력 받아서
		// 최소 값과 최대 값을 출력하는 프로그램을 작성하시오
		// TODO 과제22
		
		int number[] = new int[10];
		
		for(int i = 0;i < number.length; i++) {
			System.out.print((i + 1) + "번째 수 = ");
			number[i] = sc.nextInt();
		}
		
		// 최대값  { 3, 2, 4, 1, 5 }	max = 3
		int max = number[0];
		for(int i = 1;i < number.length; i++) {
			if(max < number[i]) {
				max = number[i];	// max보다 큰 값으로 갱신
			}
		}
		System.out.println("최대값:" + max);
		
		// 최소값
		int min = number[0];
		for (int i = 1; i < number.length; i++) {
			if(min > number[i]) {
				min = number[i];
			}
		}
		System.out.println("최소값:" + min);
		
		
		/*
		5명의 학생의 국어, 영어, 수학를 입력 받고
		평균 점수가
		80점 이상이면 합격
		60점 이하면 불합격이라고 출력하는 프로그램을 작성하라
		*/
		// TODO 과제23
		int student[][] = new int[5][3];
		/*
		int student[][] = {
				{ 100, 90, 80 },
				{ 60, 50, 65 },
				{ 70, 45, 50 },
				{ 100, 40, 75 },
				{ 90, 90, 85 },
		};
		*/
		
		double avg[] = new double[5];
		
		for(int i = 0;i < student.length; i++) {
			// 입력
			System.out.print("국어 = ");
			int lang = sc.nextInt();
			System.out.print("영어 = ");
			int eng = sc.nextInt();
			System.out.print("수학 = ");
			int math = sc.nextInt();			
			
			// 저장
			student[i][0] = lang;
			student[i][1] = eng;
			student[i][2] = math;
		}
		
		
		String title[] = { "국어", "영어", "수학" }; 
		for(int i = 0;i < student.length; i++) {	
			System.out.println((i + 1) + "번째 학생의 점수 >> ");
			for(int j = 0;j < title.length; j++) {
				System.out.print(title[j] + " = ");
				int chap = sc.nextInt();
				student[i][j] = chap;
			}			
		}
		
		// 1. 방법
		// 합격/불합격 판정
		/*
		for(int i = 0;i < student.length; i++) {		
			int sum = student[i][0] + student[i][1] + student[i][2];
			avg[i] = (double)sum / student[i].length;
			
			System.out.print("평균점수는 " + avg[i] + "점으로 ");
			if(avg[i] >= 80) {
				System.out.println((i + 1) + "번 학생은 합격입니다");
			}
			else if(avg[i] < 60){
				System.out.println((i + 1) + "번 학생은 불합격입니다");
			}
			else {
				System.out.println((i + 1) + "번 학생은 재시험을 응시하세요");
			}
		}
		*/
		
		
		// 2. 방법
		// 평균 점수 구하기
		for(int i = 0;i < student.length; i++) {	
			int chapsum = 0;
			for (int j = 0; j < student[i].length; j++) {
				chapsum = chapsum + student[i][j];
			}
			avg[i] = (double)chapsum / student[i].length;			
		}
		
		// 합격/불합격 판정
		for(int i = 0;i < student.length; i++) {
			System.out.print("평균점수는 " + avg[i] + "점으로 ");
			if(avg[i] >= 80) {
				System.out.println((i + 1) + "번 학생은 합격입니다");
			}
			else if(avg[i] < 60){
				System.out.println((i + 1) + "번 학생은 불합격입니다");
			}
			else {
				System.out.println((i + 1) + "번 학생은 재시험을 응시하세요");
			}
		}
		
		
		
		
		// 문자열을 입력받고, 입력받은 문자열이 모두 숫자로 되어 있는지 메시지로 출력하시오.
		// TODO 과제24
		System.out.print("입력 = ");
		String numStr = sc.next();
		
		boolean isNumber = true;
		for(int i = 0;i < numStr.length(); i++) {
		//	System.out.println(numStr.charAt(i));
			int num = (int)numStr.charAt(i);
			if(num < 48 || num > 57) {
				isNumber = false;
				break;
			}
		}
		
		if(isNumber) {
			System.out.println("모두 숫자로 되어 있습니다");
		}
		else {
			System.out.println("문자가 포함되어 있습니다");
		}
		
		
		 
		// 두 개의 정수와 연산자를 입력 받아서 사칙연산의 결과를 출력하는 프로그램을 작성하시오.
		// TODO 과제25
		// input
		int number1 = 0;
		
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
		if(isNum) {	// 정상적으로 숫자가 입력된 경우
			number1 = Integer.parseInt(numStr1);
			break;
			}
			System.out.println("정확히 숫자를 입력해 주십시오");
		}
		
		
	//	int number1 = sc.nextInt();
		
		System.out.print("(+, -, *, /) = ");
		String oper = sc.next();
		
		System.out.print("두번째 수 = ");
		int number2 = sc.nextInt();
		
		// calculator
		int result = 0;
		switch(oper) {
			case "+":
				result = number1 + number2;
				break;
			case "-":
				result = number1 - number2;
				break;
			case "*":
				result = number1 * number2;
				break;
			case "/":
				result = number1 / number2;
				break;				
		}		
//		if(oper.equals("+")) {
//			
//		}
		
		// print
		System.out.println(number1 + " " + oper + " " + number2 + " = " + result);
		
		
		
		
		// 2차원 배열을 1차원 배열에 제어 문을 이용하여 저장하고 출력하라
		// TODO 과제27
		
		char array2[][] = {	// 4 x 3
				{ 'A', 'B', 'C' },
				{ 'D', 'E', 'F' },
				{ 'G', 'H', 'I' },
				{ 'J', 'K', 'L' },
		};
		
		char array1[] = new char[array2.length * array2[0].length];
	//	System.out.println(array1.length);
		
		/*
		  							i	j
			array2[0][0] 	A	3 *	0 +	0	-> 0	
			array2[0][1] 	B	3 *	0 +	1	-> 1
			array2[0][2] 	C	3 *	0 +	2	-> 2
			
			array2[1][0] 	D	3 *	1 +	0	-> 3
			array2[1][1] 	E	3 *	1 +	1	-> 4
			array2[1][2] 	F	3 *	1 +	2	-> 5		
		*/
		
		/*
		for(int i = 0;i < array2.length; i++) {			
			for(int j = 0;j < array2[i].length; j++) {				
				array1[array2[i].length * i + j] = array2[i][j];
			}			
		}
		*/
		
		int count = 0;
		for(int i = 0;i < array2.length; i++) {			
			for(int j = 0;j < array2[i].length; j++) {
				array1[count] = array2[i][j];
				count++;
			}
		}		
		
		for(int i = 0;i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		
		
	}

}
