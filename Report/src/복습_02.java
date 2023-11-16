
public class 복습_02 {

	public static void main(String[] args) {
		/*
		 제어문
		 
		 조건문
			 if
			 if else
			 if else if else
			 
			 switch case break
		 
		 반복문
			 for
			 
			 while
			 
			 do while
		 
		 제어자
			 break
			 
			 continue
			 
			 exception
		*/
	   
		int number = 5;
		
		if(number == 5) {
			System.out.println("number는 5입니다");
		}
		
		if (number > 0 && number <= 10) {
			System.out.println("number는 1부터 10사이의 수입니다");
		}
		if (number < 0 || number > 3) {
			System.out.println("number는 0보다 작거나 3보다 큽니다");
		}
		if (number != 0) {
			System.out.println("number는 0이 아닙니다");
		}
		
		boolean b = false;
		
		if (!b) { //( b == false) 같은구문
			System.out.println("b는 false입니다");
		}
		
		// else
		if (number > 5) {
			System.out.println("number는 5보다 큽니다");
		} else { // number <= 5
			System.out.println("number는 5이거나 작습니다");
		}
		
		number = 92;
		
		if (number >= 95) {
			System.out.println("A+입니다");
		}
		else if(number >= 90) {
			System.out.println("A입니다");
		}
		else if(number >= 80) {
			System.out.println("B입니다");
		}
		else if(number >= 70) {
			System.out.println("C입니다");
		}
		else {
			System.out.println("D입니다");
		}
		number = 2;
		
		// switch (소수점을 사용할 수 없다)
		switch (number) {
			case 1: 	// number == 1
				System.out.println("number는 1입니다");
				break;
			case 2:
				System.out.println("number는 2입니다");
				break;
			default: 	// else
				System.out.println("number는 ?입니다");
				break;
		}
		
		// 반복문
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}
		
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("sum:" + sum);
		
		int array[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
			if (array[i] == 66) {
				System.out.println("66이 있습니다");
			}
		}
		
		for (int num : array) {
			System.out.println(num);
//			if (array[num] == 44) {
//				System.out.println("44를 찾았습니다");
				break;
		}
		
		// while
		int w ;
		w = 0;
		while(w < 10) {
			System.out.println("w = " + w);
			w++;
		}
		
		String arrStr[] = { "hi", "hello", "world" };
		w = 0;
		while(w < arrStr.length) {
			System.out.println(arrStr[w]);
			w++;
		}
		
		// break (for, while) 음수뒤 숫자 제거 예문
		int []arrNumber = { 12, 34, 45, 56, -23, 18};
		for(int i = 0;i < arrNumber.length; i++) {
			System.out.println(arrNumber[i]);
			if(arrNumber[i] < 0 ) {
				break;
			}
		}
		
		// continue 음수만 제거 예문
		for(int i = 0;i < arrNumber.length; i++) {
			if(arrNumber[i] < 0 ) {
				continue;
			}
			System.out.println(arrNumber[i]);
		}

		
		
	}
}
