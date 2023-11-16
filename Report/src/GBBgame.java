import java.util.Scanner;

public class GBBgame {
	
	public static void main(String[] args) {
		
		// 가위, 바위, 보 게임을 작성
		/*
			user : com(random)			
		 */
		
		// (변수)선언부
		Scanner sc = new Scanner(System.in);
		
		int userNum, comNum;
		int result = 0;
		int win, lose, draw;
		
		// 초기화(initialize)
		win = lose = draw = 0;
		
		System.out.println("---<< 가위 바위 보 게임 >>---");
		
		//////////////////////////// loop start
		while(true) {
		
			// random
			comNum = (int)(Math.random() * 3);	// 0 1 2
			System.out.println("com:" + comNum);
			
			// user input
			System.out.print("가위(0) 바위(1) 보(2) = ");
			userNum = sc.nextInt();
			
			// 판정처리 user:com  0:2 1:0 2:1 
			/*
			// user 승
			if(userNum == 0 && comNum == 2)			result = 1;
			else if(userNum == 1 && comNum == 0)	result = 1;
			else if(userNum == 2 && comNum == 1)	result = 1;
			
			// user 패
			if(userNum == 2 && comNum == 0)			result = 0;
			else if(userNum == 0 && comNum == 1)	result = 0;
			else if(userNum == 1 && comNum == 2)	result = 0;
			
			// 무승부
			if(userNum == 0 && comNum == 0)			result = 2;
			else if(userNum == 1 && comNum == 1)	result = 2;
			else if(userNum == 2 && comNum == 2)	result = 2;
			*/
			
			/*  0:2 1:0 2:1 
				com 		user			win			
				2   -       0  	+ 2		=	4	% 3	= 1			
				0	-		1	+ 2		=	1		= 1
				1	-		2	+ 2		=	1		= 1
				
											lose
				0   -       2  	+ 2		=	0	% 3	= 0			
				1	-		0	+ 2		=	3		= 0
				2	-		1	+ 2		=	3		= 0
				
											draw
				0   -       0  	+ 2		=	2	% 3	= 2			
				1	-		1	+ 2		=	2		= 2
				2	-		2	+ 2		=	2		= 2		
			*/
			
			result = (comNum - userNum + 2) % 3;		
			
			// 결과출력
			String message = "";
			switch(result) {
				case 1:
					message = "당신의 승리입니다";
					win++;
					break;
				case 0:
					message = "당신의 패배입니다";
					lose++;
					break;			
				case 2:
					message = "무승부입니다";
					draw++;
					break;
				default:
					message = "hello";
			}	
			
			System.out.println(message);
			System.out.println("전적은 " + win + "승 " + lose + "패 " + draw + "무 입니다");
					
			// 다시시작?
			System.out.print("play again?(y/n) = ");
			String answer = sc.next();
			
			if(answer.equals("N")||answer.equals("n")){
				System.out.println("안녕히 가십시오");
				break;
			}
			
			System.out.println("게임을 다시 시작합니다. 파이팅!");
		}
		
		////////////////////////////loop end
		
		// 해방(작별인사)
		
	}
}




