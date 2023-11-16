
public class MainClass {
	public static void main(String[] args) {
		/*
		 	while 사용할때에는 초기화와 연산식의 위치가 진짜 중요하다
		 	while 	: 루프
		 	do while 
		 	
		 	형식:
		 			(루프용)변수 선언
		 			변수 초기화
		 			while( 조건 ) {
		 				처리
		 				연산식
		 			}		 	
		 			
		 			(루프용)변수 선언
		 			변수 초기화
		 			do{
		 				처리
		 				연산식
		 			}while( 조건 );
		 			
		 	initialize(초기화)
		 	loop(main) - while
		 	release(해방)
		*/
		
		int w;
		w = 0; //초기화
		while(w < 10) { //조건식
			System.out.println("w = " + w); //처리
			w++; // 연산식
		}
		
		int w1, w2;
		w1 = 0;
		w2 = 0;
		
		while(w1 < 5) {
			System.out.println("w1 = " + w1);
//			w2 = 0; 2중 while문일 경우 변수 초기화 위치가 여기여야함
			while (w2 < 3) {
				System.out.println("\tw2 = " + w2);
				w2++;
			}
			w1++;
		}
		
		w = 10;
		do {
			w++;
			System.out.println("w = " + w);			
		}while(w < 10);
		
		// 무한루프
//		while(true) {
//			System.out.println("무한루프~~");
//		}
		        
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
