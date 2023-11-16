import java.util.Scanner;

public class StudentM {

	public static void main(String[] args) {
		/*
		 <처리조건>
	1. 데이터구조 : 이름(String),학번(int),학과(String),전화번호(String)
	 
	2. 학생수 결정 : 키보드로 입력 받는다.
	3. 메뉴 선택 : 다음 메뉴를 구성하여 프로그램을 관리한다.
	
	[메뉴 구성]
	1. 학생등록 : 키보드로 학생정보 입력 -> 배열저장 : 학번은 고유한 데이터이므로 중복되면 안됨.
	2. 전체출력 : 등록학생 전체출력
	3. 학생조회 : 학번 입력 -> 이름, 학번, 학과, 전화번호 출력
	4. 정보수정 : 학번 입력 -> 학과와 전화번호 수정
	5. 프로그램 종료 : 프로그램을 종료하시겠습니다?(y/n) y입력-> 종료(System.exit(0), n입력 -> 프로그램 반복
		 */
		// TODO 학생관리 프로그램
		// 변수선언
		String student[][] = new String[4][];
		boolean b = true;
		// 무한루프 프로그램
		while(b == true) {
			
			// 프로그램 종료
			b = PGoff();
		}
		
	} // main 끝
	
	// 학생등록
	static void add(String arr[][]) {
		Scanner sc = new Scanner(System.in);
		//int arr[][] = new int[4][];
		String str1;
		int count = 0;
		String str[] = {"학번", "이름", "학과", "전화번호"};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print(str[i] + "를 입력해주세요 = ");
				str1 = sc.next();
			} 
			
		}
		
	}
	
	// 전체출력
	static void allprint() {
		
	}

	// 학생조회
	static void StudentSearch() {
		Scanner sc = new Scanner(System.in);
	}
	
	// 정보수정
	static void InformationFix() {
		Scanner sc = new Scanner(System.in);
	}
	
	// 프로그램 종료
	static boolean PGoff() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("프로그램을 종료하시겠습니까?(y/n) >> ");
		String str = sc.next();
		boolean b = str.equals("n");
		return b;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
