import java.util.Scanner;

public class Book01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// TODO 팩토리얼 프로그램 (while문으로 무한루프 구성)
		int num = 0;
		double result;		
		String strnum;

		// 입력
	while(true) {
		while(true) {
			System.out.print("팩토리얼(!)을 구할 정수값을 입력해주세요 >> ");
			strnum = sc.next();
			
			boolean bnum = true;
			for (int i = 0; i < strnum.length(); i++) {
				int n = strnum.charAt(i);
				if(n < 48 || n > 57) {
					bnum = false;
					break;
				}
			}
			if(bnum) {	
				num = Integer.parseInt(strnum);
				break;
				}
			System.out.println("정확히 숫자를 입력해 주십시오");			
		}
		
		// 처리
		int n1 = num;
		result = 1;
		while (n1 > 0) {
			result = result * n1;
			n1--;
		}
		// 출력
		System.out.println("입력하신 "+num+"! 의값은"+result+"입니다");
		}
		

	}

}
