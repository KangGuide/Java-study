import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Report04 {

	public static void main(String[] args) {
		// 과제 8
		int number;

		number = 5;					// 0000 0101
		number = number << 4; 		// 0101 0000
		System.out.println(number);
		number = number >> 3;		// 0000 1010
		System.out.println(number);
		number = number << 1;		// 0001 0100
		System.out.println(number);
		
		// 과제 9
		
		
		int r16 = (0x80 & 0x38) | (0x80 & 0x38); 
		System.out.printf("%x\n", r16);
		
		r16 = ~(0x80 ^ 0x38); 
		System.out.printf("%x\n", r16);
		
		// 과제 10
		Scanner sc = new Scanner(System.in);
		int Pn ;
		System.out.print("값을 입력해주세요 ");
		Pn = sc.nextInt();
		String s = (Pn > 0) ? "양수입니다" : "음수입니다";
		System.out.println(s);
			
		
		// 과제 11
		
		int R1 = (int)(Math.random() *100);
		System.out.println(R1);
		
		int arrnum[] = {11, 12, 13, 14, 15};
		int R2 = (int)(Math.random() * 5);
		System.out.println(arrnum[R2]);
		
		int R3 = (int)(Math.random() * 45) + 1;
		int R4 = (int)(Math.random() * 45) + 1;
		int R5 = (int)(Math.random() * 45) + 1;
		int R6 = (int)(Math.random() * 45) + 1;
		int R7 = (int)(Math.random() * 45) + 1;
		int R8 = (int)(Math.random() * 45) + 1;
		System.out.print(R3 + " ");
		System.out.print(R4 + " ");
		System.out.print(R5 + " ");
		System.out.print(R6 + " ");
		System.out.print(R7 + " ");
		System.out.print(R8);
		
//		int numArr[] = new int[6];
//		numArr[0] = (int)(Math.random() * 45) + 1;
//		numArr[1] = (int)(Math.random() * 45) + 1;
//		numArr[2] = (int)(Math.random() * 45) + 1;
//		numArr[3] = (int)(Math.random() * 45) + 1;
//		numArr[4] = (int)(Math.random() * 45) + 1;
//		numArr[5] = (int)(Math.random() * 45) + 1;
//		
//		for (int i = 0; i < 6; i++) {
//			System.out.print(numArr[i] + " ");
//		}
		
		
	}

}
