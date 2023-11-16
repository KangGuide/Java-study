
public class MainClass {

	public static void main(String[] args) {
		/*
		 	String:
		 		wrapper class
		 		문자열을 저장, 편집, 정보취득
		 		
		 	객체: 동적할당
		 		클래스명 변수 = new 클래스명();
		*/
		
		String str; // String == 클래스명, str == 객체(object) == class변수
		 str = "안녕하세요";
		 System.out.println(str);
		
		String str1 = new String(); // 기본(오리지날)형
		 str1 = " 반갑습니다";
		 System.out.println(str1);
		 
		// 문자열길이
		// length()
		System.out.println(str1.length());
		
		String str2 = str.concat(str1);
//		String str2 = str + str1; // 위와 동일한 함수
		System.out.println(str2);
		
		// 비교함수
		String str3 = "hello";
		String str4 = "helloworld";
		
		boolean b = str3.equals(str4);
		System.out.println(b);
		
		// 지정문자의 위치
		String str5 = "안녕하세요 반갑습니다";
		System.out.println(str5.length());
		
		int num = str5.indexOf("하");
		System.out.println(num);
		
		// 수정		크롤링(데이터 수집을 위한 검색) 할때 많이 사용
		// replace
		String str6 = "A*B**C";
		String str7 = str6.replace("*", "");
		System.out.println(str7);
		
		// 문자열 자르기
		/*
		 	split : token을 이용해서 문자열을 자를 수 있다
		 	hello-my-world '-' : token
		 	
		 	홍길동-24-부산광역시
		 	성진-22-서울특별시
		 	
		 	홍길동
		 	24
		 	부산광역시
		 */
		String str8 = "홍길동-24-2001/10/12-181.2";
		String splitArr[] = str8.split("-");	// - : 토큰
		System.out.println(splitArr[0]);
		System.out.println(splitArr[1]);
		System.out.println(splitArr[2]);
		System.out.println(splitArr[3]);
		
		// (범위)문자열 자르기
		// substring
		String str9 = "하이 반갑습니다";
		String str10 = str9.substring(0, 2);
		System.out.println(str10);
		
		str10 = str9.substring(3);
		System.out.println(str10);
		
		// 대문자, 소문자 (모두)변경
		// toUpperCase, toLowerCase
		String str11 = "abcEDF";
		String str12 = str11.toUpperCase();
		System.out.println(str12);
		
		str12 = str11.toLowerCase();
		System.out.println(str12);
		
		// (앞뒤)공백을 제거해 주는 함수
		// trim
		String str13 = "        java C언어 python  ";
		String str14 = str13.trim();
		System.out.println(str14);
		
		// contains 탐색
		String str15 = "부산시 수영구";
		boolean b1 = str15.contains("수영");
		System.out.println(b1);
		
		// charAt 
		String str16 = "hello";
		char c = str16.charAt(3);
		System.out.println(c);
		
	}

}
