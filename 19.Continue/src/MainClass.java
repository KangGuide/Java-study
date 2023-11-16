import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	continue: skip(생략)
		 			루프문 안의 처리를 생략한다
		 			단독으로 사용은 못함
		 			loop문과 같이 사용함
		 			for, while
		 			
		 	for (int i = 0; i < 10; i++) {
				처리 1
				처리 2
				
				if(i == 4){
				 continue;
				}
				
				처리 3
				처리 4
			}
		*/
		
		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			System.out.println("\t처리 1");
			System.out.println("\t처리 2");
			
			if (i > 2) continue;
			// skip
			System.out.println("\t처리 3");
			System.out.println("\t처리 4");
		}
		
		
		
		
		
	}

}
