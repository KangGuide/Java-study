import java.util.Scanner;

public class Report09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 과제33
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("sum="+sum);
		
		// TODO 과제34
		
		int[][] arr1= {
				{ 5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		int total = 0;
		float average = 0;
		
		// 총합 구하기
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				total = total + arr1[i][j];
			}
		}
		// 평균 구하기
		average = (float)total / (arr1.length * arr1[0].length);
		
		System.out.println("모든값의 총합은 =" + total);
		System.out.println("모든값의 평균은 =" + average);
		
		// TODO 과제35 암호화 시키는것이지만 복호화시키는 작업까지

		// abcdefghijklmnopqrstuvwxyz
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*', 
				'(',')','-','_','+','=','|',
				'[',']','{', '}',';',':',',','.','/'};
		char[] abcCode1 =
			{ 'a','b','c','d','e','f','g','h','i','j', 
				'k','l','m','n','o','p','q',
				'r','s','t', 'u','v','w','x','y','z'};
					
		
		// 0123456789
		char[] numcode = {'q','w','e','r','t','y','u','i','o','p'};
		char[] numcode1 = {'0','1','2','3','4','5','6','7','8','9'};
		String src = "abc123535353";
		String result ="";
		String back ="";
		
		// 문자열src의문자를charAt()으로하나씩읽어서변환후result에저장
		for(int i=0; i< src.length();i++) {
			char ch= src.charAt(i); 
			// 일단 읽은 문자를 코드에 대입해서 확인해야함
			for (int j = 0; j < abcCode1.length; j++) {
				if(ch == abcCode1[j]) {
					 result = result + abcCode[j];
				 }
			}
			for (int j = 0; j < numcode1.length; j++) {
				 if(ch == numcode1[j]) {
					 result = result + numcode[j];
				 }
				}
			
		} 
		// 복호화
		for(int i=0; i< result.length();i++) {
			char ch= result.charAt(i); 
			for (int j = 0; j < abcCode.length; j++) {
				if(ch == abcCode[j]) {
					 back = back + abcCode1[j];
				 }
			}
			for (int j = 0; j < numcode.length; j++) {
				if(ch == numcode[j]) {
					back = back + numcode1[j];
				}
			}
		}
		System.out.println("src:"+src);
		System.out.println("result:"+result);
		System.out.println("rollback :"+back);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
