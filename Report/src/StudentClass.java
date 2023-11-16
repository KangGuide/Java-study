import java.util.Scanner;

public class StudentClass {

	public static void main(String[] args) {				
		// 유저로부터 입력 받은 (이름, 국어, 영어, 수학)들의 합계와 평균을 구하는 프로그램을 작성하라.
		
		// 선언
		Scanner sc = new Scanner(System.in);
		String student[][] = null;		// (0x324ad3fd) -> (0x00000000)
		
		// 총 학생 수를 입력
		System.out.print("학생의 총원 = ");
		int count = sc.nextInt();
		
		// 배열을 학생 수에 맞게 생성
		student = new String[count][4];
		
		// 학생들의 이름과 점수를 입력
		for(int i = 0;i < student.length; i++) {
			System.out.print("학생이름 = ");
			student[i][0] = sc.next();
			
			System.out.print("국어 = ");
			student[i][1] = sc.next();
			
			System.out.print("영어 = ");
			student[i][2] = sc.next();
			
			System.out.print("수학 = ");
			student[i][3] = sc.next();
		}	
		// 확인용
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				System.out.print(student[i][j] + " ");
			}
			System.out.println();
		}
		
		// 총점을 계산 그리고 배열에 대입
		int total[] = new int[student.length];
		for (int i = 0; i < student.length; i++) 
		{
			for (int j = 1; j < student[i].length; j++) 
			{
				total[i] = total[i] + Integer.parseInt(student[i][j]);
			}
		}
		
		// 총점 출력
		for(int i = 0;i < student.length; i++) {
			System.out.println(student[i][0] + ": " + total[i]);
		}		
		
		// 평균 출력
		for(int i = 0;i < student.length; i++) {
			System.out.println(student[i][0] + ": " + ((double)total[i] / 3));
		}
				
		// 최고점수를 받은 학생이름과 점수를 출력
		int max = total[0];
		for (int i = 0; i < total.length; i++) {
			if(max < total[i]) {
				max = total[i];
			}
		}
		int numberOne = 0;
		for(int i = 0;i < total.length; i++) {
			if(max == total[i]) {
				numberOne = i;
				break;
			}
		}
		
		System.out.println("현재 클래스의 일등은 " + student[numberOne][0] 
						+ "님이며 총점은 " + total[numberOne] + "입니다");
		
		// 최하점수를 받은 학생이름과 점수를 출력
		
		
	}
}








