import java.util.Scanner;

public class Report07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// TODO 과제22
				
		// 10개의 수 입력
		// 연습용
		int arrnum[] = new int[10];
		System.out.print("1 ~ 100 사이의 10개의 수를 입력하시오 >> ");
		for (int i = 0; i < arrnum.length; i++) {
			arrnum[i] = sc.nextInt();
		}
		
		// 최대값 최솟값 출력
		int max = -1, min = 101;
		for (int i = 0; i < arrnum.length; i++) {
			if (arrnum[i] > max) {
				max = arrnum[i];
			}
			if (arrnum[i] < min) {
				min = arrnum[i];
			}
		}
		// 출력
		System.out.println("최솟값: " + min + " 최대값: " + max);
				
		// TODO 과제23
		
		int arrS[][] = new int[5][3];	//학생들 성적 입력
		for (int i = 0; i < 5; i++) {
			System.out.print((i+1) + "번째 학생의 국어, 수학, 영어 순으로 입력하시오 >> ");
			for (int j = 0; j < 3; j++) {
				arrS[i][j] = sc.nextInt();
			}
		}
				
		double arrs[] = new double [5];		//학생들 성적 처리
		for (int i = 0; i < 5; i++) {
		 arrs[i] = (arrS[i][0] + arrS[i][1] + arrS[i][2]) / 3;
		 if(arrs[i] >= 80) {
			 System.out.println((i+1) + "번 학생 합격");
		 }
		 else if(arrs[i] <= 60) {
			 System.out.println((i+1) + "번 학생 불합격");
		 }
//		 else {
//			 System.out.println((i+1) + "번 학생 합격도 불합격도 아님");
//		 }
			 
		}
		
		// TODO 과제24
		
		System.out.print(">> ");						//입력
		String str = sc.next();
		int n10 = 0;								
		for (int i = 0; i < str.length(); i++) {		//출력
			char c =str.charAt(i);
			// 아스키 코드 조건 영어만 제외할 경우
			// ((int)c >=65 && (int)c <=90) || ((int)c >=97 && (int)c <=122)
			if ((int)c <48 || (int)c >57) { //아스키 코드 숫자만 제외할 경우
				System.out.println("모두 숫자가 아닙니다");
				n10 = 1;
				break;
			}
		}
		if (n10 == 0) { 
			System.out.println("모두 숫자 입니다");
		}
		
		
		// TODO 과제25
		// 숫자를 입력받고 있는데 문자가 들어올 경우 처리하는 방법
		// 입력
		int x = 0, y = 0;
		String num1, num2;
		String stR;
		char c = 0;
		System.out.print("정수를 입력하시오>> ");
		num1 = sc.next();
		for (int i = 0; i < num1.length(); i++) {	
			c =num1.charAt(i);
			if (((int)c <48 || (int)c >57) && (int)c !=45) { //아스키코드 정수만 제외
				System.out.print("정수가 아닙니다 다시 입력하세요 >> ");
				num1 = sc.next();
			}
		}
	
		System.out.print("연산자를 입력하시오>> ");
		stR = sc.next();
		char ch = 0;
		System.out.print("정수를 입력하시오>> ");
		num2 = sc.next();
		for (int i = 0; i < num2.length(); i++) {	
			ch =num2.charAt(i);
			if (((int)ch <48 || (int)ch >57) && (int)ch !=45) {
				System.out.print("정수가 아닙니다 다시 입력하세요 >> ");
				num2 = sc.next();
			}	
		}
		
		// 문자열로 받은 정수를 숫자열로 변환
		x = Integer.parseInt(num1);
		y = Integer.parseInt(num2);
		c = stR.charAt(0);
		int char_num = (int)c;
				
		// 처리 (아스키코드 %37, *42, +43, -45, /47)
		if (char_num == 43) {
			System.out.println(x + " + " + y + " = " + (x+y));
		}
		else if(char_num == 45){
			 System.out.println(x + " - " + y + " = " + (x-y));
		}
		else if(char_num == 42){
			 System.out.println(x + " X " + y + " = " + (x*y));
		}
		else if((char_num == 47 || char_num == 37) && ch == 48){
			 System.out.println(x + " / " + y + " = " + "0");
		} // 나누기 및 나머지 를 0으로 계산시 발생하는 오류를 막았다 
		else if(char_num == 47){
			 System.out.println(x + " / " + y + " = " + (x/y));
		}
		else if(char_num == 37){
			 System.out.println(x + " % " + y + " = " + (x%y));
		}

		
		// 처리 (아스키코드 %37, *42, +43, -45, /47)
//		switch (char_num) {
//		case 37: { 
//			System.out.println(x + " % " + y + " = " + (x%y));
//			break;
//			}
//		case 42: {
//		System.out.println(x + " X " + y + " = " + (x*y));
//		break;
//			}
//		case 43: {
//		System.out.println(x + " + " + y + " = " + (x+y));
//		break;
//			}
//		case 45: {
//		System.out.println(x + " - " + y + " = " + (x-y));
//		break;
//			}
//		case 47: {
//		System.out.println(x + " / " + y + " = " + (x/y));
//		break;
//			}		
//		}

		// TODO 과제27
		// 배열 크기 배정 및 2차원배열 값 저장		 
		int array1[][] = new int [2][3];
		int array2[] = new int[3];
		int array3[] = new int[3];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				array1[i][j] = i+j;
//				System.out.println(array1[i][j]);
			}
		}
			
		// 2차원 배열을 이용하여 1차원 배열에 값 저장 및 출력
		for (int i = 0; i < array2.length; i++) {
			array2[i] = array1[0][i];
			array3[i] = array1[1][i];
			System.out.println(array2[i]);
			System.out.println("\t" + array3[i]);
		}
		
		/* 처음 생각을 잘못한것 1차원배열을 -> 2차원 배열에 저장 출력
		// 배열 크기 배정
		int array1[][] = new int[2][];
		int array2[] = new int[5];
		int array3[] = new int[5];

		// 1차원 배열을 이용하여 2차원 배열에 값 저장 및 출력
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				array2[j] = j;
				array3[j] = j;
				array1[i] = array2;
				array1[i] = array3;
				System.out.println(array1[i][j]);
			}
		}
		*/
		
		// 마지막 건들지 마시오 
	}
}
