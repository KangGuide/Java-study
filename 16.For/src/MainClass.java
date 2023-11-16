
public class MainClass {

	public static void main(String[] args) {
		/*
		 	for: loop문, 순환문, 반복문
		 		 지정된 횟수만큼 반복하는 제어문
		 		 
		 	형식:
		 		 for( 초기화 ; 조건 ; 연산식 ) {
		 		 	  처리
		 		 }
		 		 
		 		 int number = 0;
		 		 
		 		 number++;
		 		 number++;
		 		 number++;
		 		 number++;
		 		 	:
		 		 	
		 		 for( 초기화(1) ; 조건(2)(5)(8) ; 연산(4)(7) ){
		 		 		처리(3)(6)
		 		 }
		 */
		int n;
//		for(n = 0;n < 10; n++) { //한번도 처리안하고 넘어갈 수 있긴하다
//			System.out.println("n = " + n);
//		}
//		System.out.println("n: " + n);
		
		for(n =1; n <=100; n++) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		for(int i = 0;i < 10; i++) { //for문 안에서 선언한것은 안에서만 가능하다
			System.out.println("i = " + i);
		}
		
		for(int i =10;i > 0; i--) {
			System.out.println("i = " + i);
		}
		
		for(int i = 0;i < 10; i=i+2) {
			System.out.println("i = " + i);
		}
		
		int count = 0;
		for( ; count < 10 ;) {
			System.out.println("count:" + count);
			count++;
		}
		
		//endless loop(무한루프)
//		for( int i = 0; ; i++) {
//			System.out.println("i = " + i);
//		}
		
		// 조건은 하나만 가능하지만 연산 및 변수는 두개이상이 가능하다
		for (int i = 0, j = 0; i < 10; i++, j=j+2) {
			System.out.println("i = " + i + " j = " + j);
		}		
		
		// 1 ~ 10 까지의 합계를 구하라
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;			
		}
		System.out.println("합계:" + sum);
		
		sum = 0;
		count = 1;
		for (int i = 0; i < 10; i++) {
			sum = sum + count;
			count++;
		}
		System.out.println("합계:" + sum);
		
		// for문 안에 for
		for(int i = 0;i < 5; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 3; j++) {
				System.out.println("\tj = " + j);
			}
		}
		
		// for + if 진짜 많이 사용한다
		for (int i = 0; i < 10; i++) {
			if (i % 2 ==0) {
				System.out.println("i = " + i);
			}
		}
		
		// for + if + array
		// for
		int array[] = { 11, 22, 33, 44, 55};
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				System.out.println(array[i]);	
			}
		}
		
		// foreach (배열과 함께 사용한다)
		for (int num : array){
			if(num % 2 == 1) {
				System.out.println(num);
			}
		}
		
		
		
		
		
	}
}
