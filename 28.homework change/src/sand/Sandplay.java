package sand;

import java.util.Scanner;

public class Sandplay {
	// 변수선언
	Scanner sc = new Scanner(System.in);  // composition(합성)
	private int p, result, shovel, suspect;
	private String pName[];
	private int sandplag;
	
	
	// 룰설명
	public Sandplay() {
		System.out.println("Sand Game 기본 규칙");
		System.out.println("유저는 최대 15명까지 가능합니다.");
	}
	
	// 입력
	public void Input() {
		System.out.print("게임에 참여할 유저의 수를 입력해주세요 = ");
		p = sc.nextInt();
		
		pName = new String[p];
		for (int i = 0; i < pName.length; i++) {
			System.out.print((i+1) + "번째 유저의 이름을 입력해주세요 = ");
			pName[i] = sc.next();
		}
		/*
		for (int i = 0; i < p; i++) {
			player[i] = i;
		}
		*/
	}
	
	// 처리
	public void Process() {
		//모래성 깃발 위치 선정
		Sandplag sp = new Sandplag();
		sandplag = sp.Plag();
		result = sandplag;
//		System.out.println(sandplag);
		
		//모래성 빼기
		out: while(true){
			for (int i = 0; i < p; i++) {
				System.out.print(pName[i] + "님 가져갈 모래의 숫자를 입력해주세요 >> ");
				shovel = sc.nextInt();
//				System.out.println((player[i]+1) + "번 플레이어 가 가져간 모래의 숫자는" + shovel + "입니다");
				result = result - shovel;
//				System.out.println(result);
				if(result <= 0) {
					suspect = i;
					break out;
				}
			}
			System.out.println("플레이어들이 전부 한번씩 모래를 가져갔지만 깃발은 아직 쓰러지지 않았습니다");
			System.out.println("따라서 다시 처음부터 모래를 퍼가겠습니다");
		}
		/*
		out: while(true){
			for (int i = 0; i < p; i++) {
				shovel = sp.Dice();
//				System.out.println((player[i]+1) + "번 플레이어 가 가져간 모래의 숫자는" + shovel + "입니다");
				result = result - shovel;
//				System.out.println(result);
				if(result <= 0) {
					suspect = i;
					break out;
				}
			}
			System.out.println("플레이어들이 전부 한번씩 모래를 가져갔지만 깃발은 아직 쓰러지지 않았습니다");
			System.out.println("따라서 다시 처음부터 모래를 퍼가겠습니다");
		}
		*/
	}
	
	// 출력
	public void Print() {
		System.out.println("모래성을 쓰러트린 사람은 " + pName[suspect] + " 입니다");
	}
	
	// 프로그램 형식
	public void replay() {
		while(true) {
		Input();
		Process();
		Print();
		System.out.print("다시 하시겠습니까? (y/n) >> ");
		String str = sc.next();
			if(str.endsWith("n")) {
				System.out.println("게임이 종료되었습니다");
				break;
			}
		}
	}
	
	
	
}
