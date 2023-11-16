import java.util.Scanner;

public class Report05 {

	public static void main(String[] args) {
		// TODO: 과제12
		int sum = 0;
		for (int i = 1; i < 1001; i++) {
			sum = sum + i;
		}
		System.out.println("총합:" + sum);
		
		// TODO: 과제13
		int sum2 = 0;
		int sum3 = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				sum2 = sum2 + i ;
			}
			else {
				sum3 = sum3 + i ;
			}
		}
		System.out.println(sum2);
		System.out.println(sum3);

		// TODO: 과제 14
		Scanner sc = new Scanner(System.in);
		
		int t;
		System.out.print("100이하의 임의의 수를 입력하시오 >>");
		t = sc.nextInt();
		
		if (t > 0 && t <= 10) {
			System.out.println("입력한 수는 0보다 크고 10보다 작거나 같다");
		}
		else if(t <= 20) {
			System.out.println("입력한 수는 10보다 크고 20보다 작거나 같다");
		}
		else if(t <= 30) {
			System.out.println("입력한 수는 20보다 크고 30보다 작거나 같다");
		}
		else if(t <= 40) {
			System.out.println("입력한 수는 30보다 크고 40보다 작거나 같다");
		}
		else if(t <= 50) {
			System.out.println("입력한 수는 40보다 크고 50보다 작거나 같다");
		}
		else if(t <= 60) {
			System.out.println("입력한 수는 50보다 크고 60보다 작거나 같다");
		}
		else if(t <= 70) {
			System.out.println("입력한 수는 60보다 크고 70보다 작거나 같다");
		}
		else if(t <= 80) {
			System.out.println("입력한 수는 70보다 크고 80보다 작거나 같다");
		}
		else if(t <= 90) {
			System.out.println("입력한 수는 80보다 크고 90보다 작거나 같다");
		}
		else {
			System.out.println("입력한 수는 90보다 크고 100보다 작거나 같다");
		}
		
		int n = 0, number = 0; // 아래의 방법이 코딩이 더 간단하다
		for(int i =0;i <10; i++) {
			n = 10 * i; // 0 10 20 ... 90
			if(number > n && number <= (n + 10)) {
			System.out.println("number는 " + n + "보다 크고 " + (n + 10) + "보다 작거나 같은 범위에 있습니다");
			}
		}
		
		//TODO: 과제15
		int f, re;
		System.out.print("양수로 된 한자리 수를 입력하시오 >>");
		f = sc.nextInt();
		
		for (int i = 1; i < 10; i++) { 
			re = f * i;
			System.out.print(f + " * " + i + " = " + re + " ");
		}
		System.out.println();
		
		//TODO: 과제16 
		int res = 0;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				res = i * j;
				System.out.print(i + " * " + j + " = " + res + " ");				
			}
			System.out.println();
		}
		
		//TODO: 과제17
		char c = '*';
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(c);	
			}
			System.out.println();
		}
		
		//TODO: 과제18
		
		for (int i = 1; i < 10; i++) {
			if (i <= 5) {
				for (int j = 0; j < i; j++) {
					System.out.print(c);	
				}	
			}
			else {
				for (int j = 10; j > i; j--) {
					System.out.print(c);	
				}
			}
			System.out.println();
		}
		
		/*
		 	처음 생각한 과제18의 방식
			for (int i = 1; i < 10; i++) {
			if (i <= 5) {
				for (int j = 0; j < i; j++) {
					System.out.print(c);	
				}	
			}
			else if(i == 6) {
				for (int j = 0; j < 4; j++) {
					System.out.print(c);	
				}
			}
			else if(i == 7) {
				for (int j = 0; j < 3; j++) {
					System.out.print(c);	
				}
			}
			else if(i == 8) {
				for (int j = 0; j < 2; j++) {
					System.out.print(c);	
				}
			}
			else {
				for (int j = 0; j < 1; j++) {
					System.out.print(c);	
				}
			}
			System.out.println();
		}
		*/
		// 마지막 문단 건드리지 마시오
	}

}
