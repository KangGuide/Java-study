import java.util.Arrays;
import java.util.Scanner;

public class Encoding {

	public static void main(String[] args) {
		// TODO 암호화, 복호화

		// 입력 -> 숫자 + 문자
		// 암호화, 복호화 -> 함수
		char abcCode[] = {	
				'`', '~', '!', '@', '#', 
				'$', '%', '^', '&', '*',
				'(', ')', '-', '_', '+', 
				'=', '|', '[', ']', '{', 
				'}', ';', ':', ',', '.', '/'
		};
		
		// 0 1 2 3 4 5 ...
		char numCode[] = {	
				'q', 'w', 'e', 'r', 't', 
				'y', 'u', 'i', 'o', 'p' 
		};
		
		// 입력
		String str = input();
		System.out.println(str);
		
		// 암호화
		String encry = encryption(abcCode, numCode, str);
		// 복호화
		decryption(abcCode, numCode, encry);
		
		// 2차원배열 -> 1차원 배열 (함수화)
		int arr2[][] = {
				{1,2,3},
				{4,5,6}
		};
		int arr1[] = Array2ToArray(arr2);
		System.out.println(Arrays.toString(arr1));
		
	}

	// 입력
	static String input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 및 문자를 입력해주세요 >> ");
		String str1 = sc.next();
		return str1;
	}
	
	// 암호화
	static String encryption(char abc[], char num[], String str) {
		String result = "";
		for(int i=0; i < str.length();i++) {
			char ch = str.charAt(i);
			int n = (int)ch;	// 아스키 코드 취득
		
			// 알파벳의 경우(97 ~)
			if(n >= 97 && n <= 122) {
				n = n - 97;
				result = result + abc[n];
			}
			// 숫자의 경우(48 ~ )
			else if(n >= 48 && n <= 57){
				n = n - 48;
				result = result + num[n];
			}
		}
		System.out.println("암호화된 코드: " + result); 
		return result;
	}
	
	// 복호화
	static void decryption(char abc[], char num[], String str) {
		String originalSrc = "";
		for(int i = 0;i < str.length(); i++) {
			char ch = str.charAt(i);
			int n = (int)ch;
			
			int index = 0;
			
			// 알파벳인 경우(숫자였던 것)
			if(n >= 97 && n <= 122) {
				
				for(int j = 0;j < num.length; j++) {
					if(ch == num[j]) {
						index = j;
						break;
					}					
				}	
				index = index + 48;
				originalSrc = originalSrc + (char)index;				
			}			
			// 그 외의 경우(알파벳이였던 경우)
			else {
				
				for(int j = 0;j < abc.length; j++) {
					if(ch == abc[j]) {
						index = j;
						break;
					}
				}
				index = index + 97;
				originalSrc = originalSrc + (char)index;
			}			
		}
		
		System.out.println("복호화된 코드:" + originalSrc);		
	}
	
	// 2차원배열을 1차원 배열로
	static int[] Array2ToArray(int array2[][]) {
		int array[] = new int[array2.length * array2[0].length];
		int count = 0;
		
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array[count] = array2[i][j];
				count++;
			}
		}
		return array;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
