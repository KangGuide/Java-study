package game;
import java.util.Scanner;

public class Dicegame {
	private int coin = 20;
	private int bet,sum;
	private int A,B;
	private int re;
	Scanner sc = new Scanner(System.in);
// rule
	public void rule() {
		System.out.println("시작시 소지코인 : 20개");
		System.out.println("합을 맞추면 제시한 숫자에 따라서 배당금이 달라집니다");
		System.out.println("2,12 : 제시할 수 없음");
		System.out.println("3,11 : 18배");
		System.out.println("4,10 : 12배");
		System.out.println("5,9  : 9배");
		System.out.println("6,8  : 7배");
		System.out.println(" 7   : 6배");
	}
// Input
	public void Input() {

		
		while(true) {
		System.out.println("현재 소지코인 : "+coin+"개");
		System.out.print("베팅할 코인을 입력해주세요 = ");
		bet = sc.nextInt();
		if(coin<bet) {
			System.out.println("현재 가진코인보다 베팅하실 코인이 더많아서 게임시작이 불가능합니다 다시 입력해주세요");
			}
		else{
			coin = coin-bet;
			break;
			}
		}
		while(true) {
			System.out.print("두 주사위의 합을 적어주세요 = ");
			sum = sc.nextInt();
			if(sum==2 || sum==12) {
				System.out.println("2 와 12는 합으로 제시할 수 없으니 다시입력해주세요");
			}
			else break;
		}
	}

// Process
	public void Process() {
		Dice dic = new Dice();
		A = dic.getDice();
		B = dic.getDice();
		re = A+B;
		
	// 합의배수
	if(re == sum) {
		if (re == 3 || re == 11) {
			bet = bet * 18;
			coin = coin+bet;
		}
		else if (re == 4 || re == 10) {
			bet = bet * 12;
			coin = coin+bet;
		}
		else if (re == 5 || re == 9) {
			bet = bet * 9;
			coin = coin+bet;
		}
		else if (re == 6 || re == 8) {
			bet = bet * 7;
			coin = coin+bet;
		}
		else if (re == 7) {
			bet = bet * 6;
			coin = coin+bet;
		}
	}
	
	}
	
	
// Print
	public void Print() {
		System.out.println("두 주사위의 번호는 "+A+","+B+"이며 두 주사위의 합은 "+re+"입니다");
		if(re == sum) {
			System.out.println("축하 드립니다! 주사위의 합을 맞췄습니다");
		}
		else {
			System.out.println("합을 맞추지 못했습니다!");
		}
	}
// finish
	public boolean finish() {
		if(coin <= 0) {
			System.out.println("소지코인이 0개가 되어서 게임을 종료합니다");
			return false;
		}
		return true;
	}
	
	public void play() {
		while(true) {
			Input();
			Process();
			Print();
			
			if(coin <= 0) {
				System.out.println("소지코인이 0개가 되어서 게임을 종료합니다");
				break;
			}
			System.out.print("play again(y/n) >> ");
			String again = sc.next();
			if(again.equals("n")) {
				System.out.println("안녕히 가십시오");
				break;
			}
			
			System.out.println("play restart!!!");
		}
	}
	
	
}
