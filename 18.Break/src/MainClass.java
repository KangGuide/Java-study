import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	break: (loop)탈출
		 				단독으로 사용하지 않는다
		 				for, while, do while
		 	
		 	for(int i = 0;i < 100; i++){
		 		if(i ==25){
		 			break;
		 		}
		 	}	
		*/
		
		for (int i = 0; i < 100; i++) {
			System.out.println("i = " + i);
			if(i == 18) {
				break;
			}
		}
		
		// 문자 'C'였을 때 탈출
		char arr[] = { 'A', 'B', 'C', 'D', 'E'};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if(arr[i] == 'C') {
				break;
			}
		}
		
		int numArr[] = { 2, 5, 7, 1, -6, 8, 9 };
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("numArr[" + i + "] = " + numArr[i]);
			if(numArr[i] < 0 ) {
				break;
			}
		}
		
		for(int n : numArr) {
			System.out.println(n);
			if(n < 0) {
				break;
			}
		}
		
		// 2중 for 탈출
//		for (int i = 0; i < 10; i++) {
//			System.out.println("i = " + i);
//			for (int j = 0; j < 5; j++) {
//				System.out.println("\t j = " + j);
//				
//				if (i == 5 && j == 3) {
//					break;
//				}
//			}
//		}
		
		// 1. 탈출방법
		boolean b = false;
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("\t j = " + j);
				
				if (i == 5 && j == 3) {
					b = true;
				}
				
				if (b == true) {
					break;
				}
			}
			if (b == true) {
				break;
			}
		}
		// 2. 탈출방법
		out:for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("\t j = " + j);
				if (i == 4 && j == 2) {
					break out;
				}
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
