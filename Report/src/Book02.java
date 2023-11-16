import java.util.Scanner;

public class Book02 {

	public static void main(String[] args) {
	//	TODO 가위 바위 보 프로그램
		
		
		String c = input("철수");
		String y = input("영희");
		whosWin(c, y);
		
	}
	
	// 입력
	static String input(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(s) 바위(r) 보(p)");
		System.out.print("3개중에 원하시는것을 입력해주세요 >> ");
		str = sc.next();
		return str;
	}
	
	static void whosWin(String c, String y) {
		String win[] = {"r", "p", "s"};
		boolean drow = c.equals(y);
		boolean cs, yh;
		int c1 = 0, y1 = 0;
		if (drow == true) {
			System.out.println("무승부 입니다");
		}
		else {
			// 이기는경우 s p / r s / p r [s > p > r]
			for (int i = 0; i < win.length; i++) {
				for (int j = 0; j < win.length; j++) {
					yh = y.equals(win[j]);
					if(yh == true) y1 = j; 
				}
				cs = c.equals(win[i]);
				if(cs == true) c1 = i;
			}
			if (c1 < y1 || (c1==2 && y1==0)) System.out.println("영희, 승!");
			else System.out.println("철수, 승!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		/*
		// 입력 r바위114 s가위115 p보112
		String result, winner = "철수";
		System.out.print("철수의 선택 = ");
		String metal = sc.next();
		System.out.print("영희의 선택 = ");
		String young = sc.next();
		
		String metal = "r";
		String young = "s";
		
		// 처리
		boolean b = false;
		int t = 0;
		int win[] = {0, 1, 2};
		String arrwho[] = {"r", "s", "p"};
		for (int i = 0; i < arrwho.length; i++) {
			b = metal.endsWith(arrwho[i]);
			if(b==true) {
				t=i;
				break;
			}
		}
		*/


}
