import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		// NullPointerException:
		int array[] = null; // 0x34323454 -> 0x00000000
		// c언어에서는 포인터 즉 주소를 바꿀 수 있으나 자바는 접근권한을 주지 않는다
		// reference(참조) == pointer == 주소를 저장하는 변수
//		int array[] = new int[5];
		System.out.println(array);
		
		try {
		System.out.println(array.length);
		}catch(NullPointerException e) {
			System.out.println("동적확보되지 않음");	
		}

		int array1[] = {1,2,3};
		try {
		System.out.println(array1[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위 초과");	
		}
		
		/*
		File file = new File("c:\\xxx.txt");
		FileInputStream is;
		
		try {
		is = new FileInputStream(file);
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");	
		}
		*/
		
		int num;
		try {
		num = Integer.parseInt("123.456");
		} catch(NumberFormatException e) {
			System.out.println("숫자의 형태가 다릅니다");
		}
	
		double d = Double.parseDouble("123.456");
		
		
		
		boolean out = true;
		while(true) { // 원하는 변수에 맞는 입력을 하지 않았을때 적용하는 방법
			Scanner sc = new Scanner(System.in);
			try {
				System.out.print("number = ");
				int number = sc.nextInt();
				System.out.println("입력후 실행");				
				out = true;
			}catch(InputMismatchException e) {
				System.out.println("숫자가 아닙니다");
				out = false;
			}catch(Exception e) {
				e.printStackTrace();
			}
			if(out == true) {
				break;
			}
		}
		
		// StringIndexOutOfBoundsException
		String str = "abc";
		
		try {
			str.charAt(3);
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("문자열의 길이 초과");	
		}
		
		
		
		
	}

}
