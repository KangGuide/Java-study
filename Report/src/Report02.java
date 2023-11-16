import java.util.Scanner;

public class Report02 {

	public static void main(String[] args) {
		/*
		 	편의점
		 	
		 	입력 >>
		 	지불해야될 금액: 3230원
		 	입력 >>
		 	자신이 지불한 금액: 10000원
		 	
		 	거스름돈
		 	5000원 : ?장	1
		 	1000원 : ?장	1
		 	500원  : ?개	1
		 	100원  : ?개	2
		 	50원   : ?개	1
		 	10원   : ?개	2
		 */
		
		Scanner sc1 = new Scanner(System.in);	// 스캐너는 굳이 여러개 쓸 필요 X
		//Scanner sc2 = new Scanner(System.in);	   하나만 써도 ok
		
		int buy, pay; // 구매가, 지불금액 
		System.out.print("지불해야될 금액 : ");
		buy = sc1.nextInt();
		System.out.print("내가 지불한 금액 : ");
		pay = sc1.nextInt();
		
		int result; // 거스름돈
		result = (pay - buy);
		System.out.println("거스름돈은 " + result + "원 입니다.");
//		result = (pay - buy) / 5000;
//		System.out.println("5000원 : " + result + "장");
//		result = (pay - buy) % 5000 / 1000;
//		System.out.println("1000원 : " + result + "장");
//		result = (pay - buy) % 5000 % 1000 / 500;
//		System.out.println("500원 : " + result + "개");
//		result = (pay - buy) % 5000 % 1000 % 500 / 100;
//		System.out.println("100원 : " + result + "개");
//		result = (pay - buy) % 5000 % 1000 % 500 % 100 / 50;
//		System.out.println("50원 : " + result + "개");
//		result = (pay - buy) % 5000 % 1000 % 500 % 100 % 50 / 10;
//		System.out.println("10원 : " + result + "개");
		
		result = (pay - buy) / 5000;
		System.out.println("5000원 : " + result + "장");
		result = (pay - buy) % 5000 / 1000;
		System.out.println("1000원 : " + result + "장");
		result = (pay - buy) % 1000 / 500;
		System.out.println("500원 : " + result + "개");
		result = (pay - buy) % 500 / 100;
		System.out.println("100원 : " + result + "개");
		result = (pay - buy) % 100 / 50;
		System.out.println("50원 : " + result + "개");
		result = (pay - buy) % 50 / 10;
		System.out.println("10원 : " + result + "개");

	}

}
