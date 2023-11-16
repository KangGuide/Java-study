import java.util.Scanner;

public class Report03 {
	public static void main(String[] args) {
		
		//과제5
		Scanner sc = new Scanner(System.in);
		
		double q, w;
		System.out.print("첫번째 수 : ");
		q = sc.nextDouble();
		System.out.print("두번째 수 : ");
		w = sc.nextDouble();
		
		double result;
		result = q + w;
		System.out.println("더하기 결과 : " + String.format("%.2f", result));
		result = q - w;
		System.out.println("빼기 결과 : " + String.format("%.2f", result));
		result = q * w;
		System.out.println("곱하기 결과 : " + String.format("%.2f", result));
		result = q / w;
		System.out.println("나누기 결과 : " + String.format("%.2f", result));
		result = q % w;
		System.out.println("나머지 결과 : " + String.format("%.2f", result));
		/* result = q % w;
		System.out.printf("%.2f", result");
		// "%s, %.2f", "나머지 결과", result 이렇게 하면 나온다!
		*/
		
		// 과제6
		double e;
		System.out.print("단위 환산 하고싶은 값 : ");
		e = sc.nextDouble();
		
		double result1;
		result1 = e * 2.54;
		 System.out.println(e + "inch = " + String.format("%.2f", result) + "cm");
		result1 = e * 0.3048;
		 System.out.println(e + "yard = " + String.format("%.2f", result) + "m");
		result1 = e * 1.6093;
		 System.out.println(e + "mile = " + String.format("%.2f", result) + "km");
		
		// 과제7
		double x,y,z;
		 System.out.println("(x-y)/(z-y) 값을 알기위한 프로그램 입니다");
		 System.out.print("X : ");
		 x= sc.nextDouble();
		 System.out.print("Y : ");
		 y= sc.nextDouble();
		 System.out.print("Z : ");		 
		 z= sc.nextDouble();
		 
		 System.out.println("결과 : " + String.format("%.2f",(x-y)/(z-y)));
		 
		
		
	}
}
