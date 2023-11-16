import java.util.Scanner;

public class Report08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// TODO 과제31
		boolean b = true;
		int w=0, l=0, d=0; // 승무패 횟수
		System.out.println("<< 가위 바위 보 게임 >>");
		while(b == true){
		//입력
		int rnum; // 가위바위보 숫자
		rnum = (int)(Math.random() * 3);		
		System.out.print("가위(0), 바위(1), 보(2) 중에서 숫자로입력하세요 >> ");
		int mynum = sc.nextInt();
		
		//처리
		switch (mynum) {
		case 0:
			switch (rnum) {
			case 0:
				System.out.println("무승부 입니다!");
				d++;
				break;
			case 1:
				System.out.println("당신이 패배했습니다!");
				l++;
				break;
			case 2:
				System.out.println("당신이 승리했습니다!");
				w++;
				break;
			}
			break;
		case 1:
			switch (rnum) {
			case 0:
				System.out.println("당신이 승리했습니다!");
				w++;
				break;
			case 1:
				System.out.println("무승부 입니다!");
				d++;
				break;
			case 2:
				System.out.println("당신이 패배했습니다!");
				l++;
				break;
			}
			break;
		case 2:
			switch (rnum) {
			case 0:
				System.out.println("당신이 패배했습니다!");
				l++;
				break;
			case 1:
				System.out.println("당신이 승리했습니다!");
				w++;
				break;
			case 2:
				System.out.println("무승부 입니다!");
				d++;
				break;
			}
			break;
		}
		//누적 승패 표시
		System.out.println("현재 당신의 전적은 " + w + "승 " + l + "패 " + d + "무 입니다");
		//다시하기
		System.out.print("다시 하시겠습니까? (y/n) >> ");
		String con = sc.next();
		String match = "y";
		b = match.equals(con);
		
		} //무한루프 닫기
		
		// TODO 과제32
		
		while(true) {
		// 입력요소
		System.out.print("총 학생 수 = ");
		int all = sc.nextInt();	
		String student[] = new String[all];
		int study[][] = new int[all][3];
		double avg[] = new double[all]; // 인당 과목 평균
		int to[] = new int[all]; 		// 인당 과목 총점
		int total = 0; 					// 총 과목 총점
		int tavg = 0; 					// 총 과목 평균 
		int rmb = 0;					// 최고 최하 점수 학생 기억식

		// 입력		
		String title[] = { "국어", "영어", "수학" }; 
		for(int i = 0;i < student.length; i++) {	
			System.out.print((i + 1) + "번째 학생의 이름 = ");
			String name = sc.next();
			student[i] = name;
			System.out.println(student[i] + " 학생의 점수 >> ");
			for(int j = 0;j < title.length; j++) {
				System.out.print(title[j] + " = ");
				int chap = sc.nextInt();
				study[i][j] = chap;
			}			
		}

		//처리
		// 평균 및 총점 구하기
		for(int i = 0;i < study.length; i++) {	
			int temp = 0;
			for (int j = 0; j < study[i].length; j++) {
				total = total + study[i][j];
				temp = temp + study[i][j];
				to[i] = temp;
			}
			avg[i] = (double)temp / study[i].length;
			temp = 0;
		}
		tavg = (total / 3) / study.length;
		// 총학생 총점 및 평균 출력
		System.out.println("총 학생의 수는 " + all + "명 입니다");
		System.out.println("총 학생들의 총점은 = " + total + "점 입니다");
		System.out.println("총 학생들의 평균은 = " + tavg + "점 입니다");
		
		// 개인별 학생 총점 및 평균출력
		for(int i = 0;i < study.length; i++) {
		System.out.println(student[i] + "학생의 총점은 = " + to[i] + "점 입니다");
		System.out.println(student[i] + "학생의 평균은 = " + avg[i] + "점 입니다");
		}
		
		// 최하&최고 점수를 받은 학생이름 및 점수 출력 
		// 최고점수 출력
		int max = to[0];
		for(int i = 0;i < to.length; i++) {
			if(max < to[i]) {
				max = to[i];	// max보다 큰 값으로 갱신
				rmb = i;
			}
		}
		System.out.println("최고 점수를 받은 학생은 " + student[rmb] + "학생이며 총점수는 " + max + "점 이고 평균은 "+ avg[rmb] + "점입니다");
		
		// 최소값
		int min = to[0];
		for (int i = 0; i < to.length; i++) {
			if(min > to[i]) {
				min = to[i];
				rmb = i;
			}
		}
		System.out.println("최하 점수를 받은 학생은 " + student[rmb] + "학생이며 총점수는 " + min + "점 이고 평균은 "+ avg[rmb] + "점입니다");
		System.out.println();
		} //무한루프 닫기
		
	}

}
