
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ctrl + '/'
		System.out.println("Hello World");
		
		System.out.println("안녕하세요");
		
		// 주석문 : 컴파일되지 않는 문장
		// 코드의 설명이나 내용
		// 한줄주석문
		
		/*
		  	범위 주석문
		  	java, CSS, MySQL
		  	
		  	python """ 범위 주석문 """
		  	html <!-- 범위 주석문 -->
		  	JSP <%-- 범위 주석문 --%>
		 
		 */
		
		 /*
		  		unix -> C언어 -> C++ -> java -> C#(자동화기기)
		  				절차지향  객체지향(OOP)
		  				
		  		C언어 : 절차지향 -> function(함수), 순서	
		  	    Java : 객체지향 ->	class + function, 설계		  
		  */
		
		 // 출력
		 System.out.println("hello java");
		 System.out.print("world ");
		 System.out.println("welcome");
		 
		 // 개행
		 System.out.println();
		 System.out.println("hi");
		 
		 System.out.println("문자열"); // 문자열 == string
		 System.out.println('A');
		 System.out.println('한');
		 System.out.println('1');
		 
		 System.out.println(123);
		 System.out.println(123 + 1);
		 
		 System.out.println("123" + 1);
		 
		 // printf -> format
		 System.out.printf("%s", "안녕");
		 System.out.printf("%d", 1024);
		 System.out.printf("%c", 'A');
		 System.out.printf("%.2f", 123.456); //f앞 .2(소수점 뒤에자리수)
		 
		 System.out.println();
		 // escape sequence
		 // \n(개행) \b(백스페이스) \t(띄어쓰기)
		 System.out.println("welcome to \nmy world");
		 
		 System.out.println("welcome\b");
		 
		 System.out.println("홍길동\t 95");
		 System.out.println("춘향\t 100");
		 System.out.println("일지매\t 90");
		
		 // \" \\
		 System.out.println("\"나는 문제없어\" 라고 말했습니다.");
		 
		 System.out.println("\\ 하이 반가워 \\");
		
		
	}

}
