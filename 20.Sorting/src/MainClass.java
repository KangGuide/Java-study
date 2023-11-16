import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 	Sorting : 정렬
		 				숫자의 크기에 따라서 순번대로 배치하는 처리
		 				오름차순(큰값이 뒤로), 내림차순(작은값이 뒤로)
		 				입사순위				연봉순위
		 				
		 				선택 == 버블 < 합병 < 퀵		 	
		 */
		
		// bubble sort
		/*
		int number[] = { 2, 4, 3, 5, 1};
		int temp; // swap용 변수
		
		for (int i = 0; i < number.length - 1; i++) { // 0 ~ 3
			
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] > number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}			
		}
		
//		for (int i = 0; i < number.length; i++) {
//			System.out.println(number[i] + " ");
//		}
		
		System.out.println(Arrays.toString(number)); //1차원 배열을 쉽게 보는법
		// 2차원 배열은 불가능 하다
		*/
		
		
		// 두개의 배열을 바꿀때
		/* 
		int myArray[] = { 1, 2, 3, 4, 5};
		int youArray[] = { 3, 6, 9, 12, 15};
		int swap;		
		// 원본데이터가 보존되지 않고 변경된다
		for (int i = 0; i < myArray.length; i++) {
					swap = youArray[i];
					youArray[i] = myArray[i];
					myArray[i] = swap;
		}
		
		
		// 두 배열의 데이터를 교환하는 경우(원본데이터 보존)
		int mArr[] = myArray; //배열의 주소를 넣어 배열을 가져올때 쓰는것
		int yArr[] = youArray;
		
		System.out.println(Arrays.toString(myArray));
		System.out.println(Arrays.toString(youArray));
		
		int temp[] = mArr;
		mArr = yArr;
		yArr = temp;
		System.out.println(Arrays.toString(mArr));
		System.out.println(Arrays.toString(yArr));
		 */
		
		// Sorting
		
		// 선언부 (전체문장에서 필요한것만 여기다가 입력)
//		int num[] = null; // 이렇게 기본적으로 만들 수 있다
		int all; //정렬 숫자
		int number, temp; //입력 및 스왑
		String updown; //오름or내림
		boolean b = true;
		
		// 입력
		while(b == true) {
		// 몇개를 정렬?
		System.out.print("몇개의 숫자를 정렬하시겠습니까? >> ");
		all = sc.nextInt();
		int num[] = new int[all];
		
		// 숫자들을 입력
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자를 입력해주세요 >> ");
			num[i] = sc.nextInt(); //이게 가능하다
//			number = sc.nextInt(); //내가한 생각
//			num[i] = number;
		}

		// 오름/내림
		System.out.print("오름/내림 을 적어주세요 >> ");
		updown = sc.next();
		// 정렬처리
		// 오름/내림
		/* 나중에 한 생각
		 for (int i = 0; i < num.length - 1; i++) {				
		 			for (int j = i + 1; j < num.length; j++) {
				if (updown == "오름") {
					if(num[i] < num[j]){
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					}
				}
				else{
					if(num[i] < num[j]){
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					}
				}
			}			
		}
		*/
//		/* 먼저한 생각
		if (updown == "오름") {
			for (int i = 0; i < num.length - 1; i++) {				
				for (int j = i + 1; j < num.length; j++) {
					if (num[i] < num[j]) {
						temp = num[i];
						num[i] = num[j];
						num[j] = temp;
					}
				}			
			}			
		}
		else {
			for (int i = 0; i < num.length - 1; i++) {
				
				for (int j = i + 1; j < num.length; j++) {
					if (num[i] > num[j]) {
						temp = num[i];
						num[i] = num[j];
						num[j] = temp;
					}
				}			
			}	
		}
//		*/

		// 결과출력
		System.out.println("적어주신 " + all + "개의 숫자를 " + updown + "차순으로 정렬한 결과입니다");
		System.out.println(Arrays.toString(num));
		
		System.out.print("다시 하시려면 \"네\"를 입력해주세요 >> ");
		String con = sc.next();
		b = con.equals("네");
		
		} //무한루프 구문
		
		
	} // 건들지마시오

}
