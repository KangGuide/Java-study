
public class Encodint_old {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a b c d e ...
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
		
		// 암호화
		String src = "yoonpy56781";
		String result = "";
		
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			int n = (int)ch;	// 아스키 코드 취득
		
			// 알파벳의 경우(97 ~)
			if(n >= 97 && n <= 122) {
				n = n - 97;
				result = result + abcCode[n];
			}
//			if(ch >= 'a' && ch <= 'z') {
//				
//			}			
			// 숫자의 경우(48 ~ )
			else if(n >= 48 && n <= 57){
				n = n - 48;
				result = result + numCode[n];
			}			
		}
		
		System.out.println("src:"+src);
		System.out.println("result:"+result);
		
		
		
		// 복호화
		String originalSrc = "";
		for(int i = 0;i < result.length(); i++) {
			char ch = result.charAt(i);
			int n = (int)ch;
			
			int index = 0;
			
			// 알파벳인 경우(숫자였던 것)
			if(n >= 97 && n <= 122) {
				
				for(int j = 0;j < numCode.length; j++) {
					if(ch == numCode[j]) {
						index = j;
						break;
					}					
				}	
				index = index + 48;
				originalSrc = originalSrc + (char)index;				
			}			
			// 그 외의 경우(알파벳이였던 경우)
			else {
				
				for(int j = 0;j < abcCode.length; j++) {
					if(ch == abcCode[j]) {
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

}
