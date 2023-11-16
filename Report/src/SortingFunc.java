import java.util.Arrays;
import java.util.Scanner;

public class SortingFunc {

	public static void main(String[] args) {
		// TODO Sorting 프로그램 만들기
		
		// 선언부
		int num[] = null;
		boolean updown[] = new boolean[1];
				
		// 입력		
		num = input(updown);
		
		// 정렬처리
		process(updown, num);

		// 결과출력
		output(updown, num);
	}

	static int[] input(boolean[] updown) { //입력함수
		Scanner sc = new Scanner(System.in);
		int num[] = null;
		
		// 몇개를 정렬?
		int count;
		System.out.print("몇개의 숫자를 정렬하시겠습니까? >> ");
		count = sc.nextInt();
		num = new int[count];
				
		// 숫자들을 입력
		for (int i = 0; i < num.length; i++) {
			System.out.print((i+1) + "번째 숫자를 입력해주세요 >> ");
			num[i] = sc.nextInt();
				}

		// 오름/내림 1
		int ud;
		System.out.print("오름(1) 내림(2) 원하시는 숫자를 입력해주세요 >> ");
		ud = sc.nextInt();
		if(ud == 1) updown[0] = true;
		else		updown[0] = false;
		
		
		return num;
		
	}
	
	static void process(boolean updown[], int num[]) { //처리함수
		int temp;
		 for (int i = 0; i < num.length - 1; i++) {				
	 		for (int j = i + 1; j < num.length; j++) {
				if (updown[0] == true) {
					if(num[i] > num[j]){
					swap(num, i, j);
					}
				}
				else{
					if(num[i] < num[j]){
					swap(num, i, j);
					}
				}
			}			
		 }
	}
	
	static void output(boolean updown[], int num[]) { //결과출력
		String str = "오름";
		if (updown[0] == false) str = "내림"; 
		System.out.println("적어주신 " + num.length + "개의 숫자를 " + str + "차순으로 정렬한 결과입니다");
		System.out.println(Arrays.toString(num));
	}
	
	static void swap(int num[], int i, int j) { // 스왑함수
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
	
}
