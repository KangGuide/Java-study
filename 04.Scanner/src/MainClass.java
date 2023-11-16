import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner; // module

public class MainClass {

	public static void main(String[] args) throws IOException {
        /*
            input -> console
            출력 -> System.out.println("변수 or 값(value)");
            
            입력 -> 변수
            
         
		// 출력
		int number = 123;
		System.out.println(number + " " + 224);
		
		*/
		
		// Scanner 단점 : 스페이스바를 인식못한다 == nul(빈)문자
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		// boolean
		boolean b;
//		System.out.print("b = ");
//		b = sc.nextBoolean(); 		// true/false
//		System.out.println("b:" + b);
		
		// int
		int age;
		System.out.print("당신의 나이 = ");
		age = sc1.nextInt();
		System.out.println("age:" + age);
		
		// double
		double height;
		System.out.print("당신의 키 = ");
		height = sc2.nextDouble();
		System.out.println("height: " + height);
		
		// String
		String name;
		System.out.print("당신의 이름 = ");
		name = sc3.next();
		System.out.println("name:" + name); // ' ' == nul(빈)문자
		
		// Buffer 빈문자 인식할 수 있는 방법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String address;
		System.out.print("주소 = ");
		address = br.readLine();
		System.out.println("address" + address);
		
		
	}

}
