package cal;

import java.util.Scanner;

public class Calculator {
	
	int num1, num2;
	String operator;
	int result;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 = ");
		num1 = sc.nextInt();
		
		System.out.print("(+, -, *, /) = ");
		operator = sc.next();
		
		System.out.print("두번째 수 = ");
		num2 = sc.nextInt();
		
		
	}
	public void process() {
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;			
		}
	}
	public void print() {
		System.out.println(num1 + " " + operator + " " + num2 + " =  " + result);
	}
	
	
	
}
