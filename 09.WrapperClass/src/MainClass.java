
public class MainClass {

	public static void main(String[] args) {
		/*
		  Wrapper class 
		  일반 자료형(char, int..)들을 클래스화 해 놓은 것
		  String
		  
		  일반자료형			Wrapper class
		  boolean			Boolean
		  
		  byte				Byte
		  short				Short
		  int				Integer		--> 빈도수가 많다
		  long				Long
		  
		  float				Float
		  double			Double		--> 빈도수가 많다
		  
		  char				Character
		  char[]			String		--> 빈도수가 많다 제일 중요한 부분!
		  
		*/
		
		Integer iobj = 123;
		System.out.println(iobj);
		
		iobj = iobj * 2;
		System.out.println(iobj);
		
		//valueOf
		int number1 = iobj.valueOf("1234");
		System.out.println(number1);
		
		// 숫자 -> 문자열
//		String str = iobj + "";
		String str = iobj.toString();  // 위와 동일한 방법이다
		System.out.println(str);
		
		
		// 문자열 -> 숫자열 
		String strNum = "2345";
		int number = Integer.parseInt(strNum);
		System.out.println(number * 2);
		
		String strDNum = "123.4567";
		double dnumber = Double.parseDouble(strDNum);
		System.out.println(dnumber);
		
		// 10진수 -> 2, 8, 16 진수 변환은 String / Integer.to~() 를 써야하고
		// 2, 8, 16 진수 -> 10진수 변환은 int / Interger.parseInt() 를 써야한다
		
		// 10진수 -> 2진수 
		int ten = 10;
		System.out.println("기본값: " + ten);
		
		String binary = Integer.toBinaryString(ten);
		System.out.println("2진수: " + binary);
		
		// 2진수  ->	10진수
		int Dec = Integer.parseInt("1010", 2); //"1010" 의 1010을 String 값준것을 넣어도됨
		System.out.println("10진수: " + Dec);
		
		// 10진수 -> 16진수
		String HexaD = Integer.toHexString(ten);
		System.out.println("16진수: " + HexaD);
		
		// 16진수 -> 10진수
		int Sixt = Integer.parseInt("FF", 16);
		System.out.println("10진수: " + Sixt);
		
		
		
		
		
		
	}

}
