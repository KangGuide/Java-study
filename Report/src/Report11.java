import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Report11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		// TODO 과제1
		// 파일명 입력 및 생성
		System.out.print("파일명을 입력해주세요 = ");
		String str = sc.next();
		String str1[] = new String[3];
		File work1 = new File("c:\\tmp\\" + str +".txt");
		
		// 학생 입력 및 파일쓰기
		try {
			FileWriter fw = new FileWriter(work1); 
			BufferedWriter bw = new BufferedWriter(fw); 
			PrintWriter pw = new PrintWriter(bw);
			
			for (int i = 0; i < 3; i++) {
				System.out.print((i+1) + "번째 학생의 이름을 입력해주세요 = ");
				str1[i] = sc.next();
				pw.println(str1[i]);
			}
			pw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// 파일 읽기 및 콘솔출력
		try {
			FileReader fr = new FileReader(work1);
			BufferedReader br = new BufferedReader(fr);
			
			String str2 = "";
			
			while((str2 = br.readLine()) != null) {
				System.out.println(str2);
			}
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		// TODO 과제2
		int sum = 0;
		String str3 = "";
		File work2 = new File("c:\\tmp\\work2.txt");
		
		// 파일 쓰고 저장
		try {
			FileWriter fw1 = new FileWriter(work2);
			BufferedWriter bw1 = new BufferedWriter(fw1);
			PrintWriter pw1 = new PrintWriter(bw1);
			
			pw1.println("홍길동-24-서울시");
			pw1.println("성춘향-16-남원시");
			pw1.println("일지매-22-부산시");
			
			pw1.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		//파일 읽기 및 콘솔 출력
		try {
			FileReader fr1 = new FileReader(work2);
			BufferedReader br1 = new BufferedReader(fr1);
			
			while((str3 = br1.readLine()) != null) {
				System.out.println(str3);
				String splitArr[] = str3.split("-");
				sum = sum + Integer.parseInt(splitArr[1]);
			}
			br1.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("3명의 나이의 합 = " + sum);		
	}

	
	
	
	
	
	
	
	
	
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		
	}
	
	static void write() {
		
	}
	
	static void read() {
		
	}
	
	static void save() {
		
	}
	
	static void print() {
		
	}
	
	
	
	
	
	
	
	
	
}
