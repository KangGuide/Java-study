import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Report10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// TODO 과제1
		// 입력
		int num1[] = {1, 2, 3, 4, 5};
		// 처리
		num1 = getDouble(num1);
		// 출력
		System.out.println(Arrays.toString(num1));
		System.out.println("과제1 끝");
		
		// TODO 과제2 (함수 하나로)
		// 입력
		System.out.print("정수를 입력해주세요 >> ");
		int n1 = sc.nextInt();
		System.out.print("정수를 입력해주세요 >> ");
		int n2 = sc.nextInt();
		int result, tag[] = new int[2]; 
		
		//
		// 처리
		result = getResult(n1, n2, tag); // result = 몫, tag = 나머지
		
		// 출력
		System.out.println("result(몫) = " + result + ", tag(나머지) = " + tag[0]);
		System.out.println("과제2 끝");
		
		// TODO 과제3 공식 : 루트((y1 - y)^2 + (x1 - x)^2) 
		System.out.println(getDistance(1,1,2,2));
		System.out.println("과제3 끝");
		
		
		// TODO 과제4
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result1 = shuffle(original);
		System.out.println(java.util.Arrays.toString(result1));
		System.out.println("과제4 끝");
		
		// TODO 과제5
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+max(data));
		System.out.println("과제5 끝");
		
		// TODO 과제6 (계산기 함수 참조)
		String str= "123";
		System.out.println(str+"는숫자입니까? "+isNumber(str));
		str= "1234o";
		System.out.println(str+"는숫자입니까? "+isNumber(str));
		System.out.println("과제6 끝");
		
		
	} // main 메소드 끝
	
	// TODO 함수 생성구역
	
	static int[] getDouble(int get[]) { // 과제1 더블메소드
		for (int i = 0; i < get.length; i++) {
			get[i] = get[i] * 2;
		}
		return get;
	}
	
//	static int[] getResult(int n1, int n2) { // 과제2 몫과나머지
//		int result[] = new int[2]; 
//		result[0] = n1 / n2; //몫
//		result[1] = n1 % n2; //나머지
//		
//		return result;
//	}
	
	static int getResult(int n1, int n2, int[] arr) { // 과제2 몫과나머지
		int result = n1 / n2; //몫
		arr[0] = n1 % n2; //나머지
		return result;
	}

	static double getDistance(int x, int y, int x1, int y1) { // 과제3 거리측정
		double result = Math.sqrt(Math.pow(y1 - y, 2) + Math.pow(x1 - x, 2));
		return result;
		// Math.sqrt 루트(제곱근), Math.pow 거듭제곱
	}
	
	static int[] shuffle(int arr[]) { // 과제4 셔플
		for (int i = 0; i < arr.length; i++) {			
			int r = (int)(Math.random() * arr.length);
			int temp = arr[r];
			arr[r] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	static int max(int[] arr) { //과제5 맥스
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0 || arr == null) {
				max = -999999;
				return max;
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	// utility
	static boolean isNumber(String str) { //과제6 메소드
		if(str == null || str.equals("")) return false;
		boolean b = true;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c < 48 || c > 57) {
				b = false;
				break;
			}
		}
		return b;
	}
	

}
