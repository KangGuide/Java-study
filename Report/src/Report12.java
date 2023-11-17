import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Report12 {

	public static void main(String[] args) {
		// 학생 성적관리 프로그램 -> 가계부, 주소록
		/*
		 	과목: 국어, 영어, 수학  <- column(항목)
		 	이름, 나이, 키, 주소
		 	
		 	 2차원 배열 -> 20개
		 	 
		 	 메뉴:		Data Access Object(DAO) CRUD
		 	 	1.학생정보(추가)입력		insert	create
		 	 	2.학생정보삭제		"" 0	delete	delete
		 	 	3.학생정보검색				select	read
		 	 	4.학생정보수정				update	update
		 	 	5.파일저장
		 	 	6.파일불러오기
		 */
		Scanner sc = new Scanner(System.in);
		
		String student[][] = new String[20][7];
		String column[] = {"이름", "나이", "신장", "주소", "국어", "영어", "수학"}; //
		int count = 0 ;
	
		out:while(true) {
			System.out.println("====== 학생정보 프로그램 ======");
			System.out.println("1. 학생정보추가");
			System.out.println("2. 학생정보삭제");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 학생정보수정");
			System.out.println("5. 학생전체보기");
			System.out.println("6. 파일저장   ");
			System.out.println("7. 파일불러오기");			
			System.out.println("0. 프로그램종료");
			System.out.println("===========================");
			
			System.out.print("메뉴의 번호 >> ");
			int menuNumber = sc.nextInt();
			
			switch(menuNumber) {
				case 1:
					if(count == student.length) System.out.println("저장공간이 가득찼습니다");
					count = insert(student, column, count);
					break;
				case 2:
					delete(student);				
					break;
				case 3:
					select(student, column);
					break;
				case 4:
					update(student, column);
					break;
				case 5:
					alldata(student);
					break;
				case 6:
					savedata(student, column);
					break;	
				case 7:
					loaddata();
					break;	
				case 0:
					break out;						
			}
			
		}
		
	} //main 끝
	
	// TODO 학생정보입력
	static int insert(String student[][],String column[], int count) {
		Scanner sc = new Scanner(System.in);
		String con; 
		System.out.println("===========================");
		System.out.println("학생 정보 입력입니다");
		System.out.println("===========================");

		for (int i = count; i < student.length; i++) {
			for (int j = 0; j < column.length; j++) {
				System.out.print(column[j] + "를 입력해주세요 >> ");
				student[i][j] = sc.next();
				if(j == (column.length-1)) {
					System.out.println("다른 학생의 정보를 입력하시겠습니까?");
					System.out.print("네 또는 아니요 를 입력해주세요 >> ");
					con = sc.next();
					boolean b = con.equals("네");
					if(b == true) {
						count++;
						break;
					}
					else {
						return count;
					}
				}
			}
		}
		System.out.println("저장공간이 가득찼습니다");
		return count; 		
	}
	
	// TODO 학생정보삭제	
	static void delete(String student[][]) {
		Scanner sc = new Scanner(System.in);
		// 이름입력시 -> name = "" age = 0
		System.out.println("===========================");
		System.out.println("특정학생의 정보를 삭제하는곳 입니다");
		System.out.println("===========================");
		int count = 0;		
		
		while(true) {
		System.out.print("원하시는 학생의 이름을 입력해주세요 = ");
		String name = sc.next();
		
		count = foundStudent(student, name);
		if (count == -1) continue;

		for (int i = 0; i < student[0].length; i++) {
			student[count][i] = "";
		}
		System.out.println("다른학생의 정보를 삭제하시겠습니까?");
		System.out.print("네 또는 아니요 를 입력해주세요 >> ");
		String str = sc.next();
		boolean b = str.equals("네");
		if (b == false) break;
		}	
	}
	
	// TODO 특정학생 정보출력	
	static void select(String student[][], String column[]) {
		Scanner sc = new Scanner(System.in);
		// 이름입력시 -> 그 학생의 모든 정보 출력
		System.out.println("===========================");
		System.out.println("특정학생의 정보 열람구역 입니다");
		System.out.println("===========================");
		int count = 0;
		
		while(true) {
		System.out.print("원하시는 학생의 이름을 입력해주세요 = ");
		String name = sc.next();
		
		count = foundStudent(student, name);
		if (count == -1) continue;
		
		for (int i = 0; i < column.length; i++) {
			System.out.println(column[i] + " = " + student[count][i]);
		}
		System.out.println("다른학생의 조회를 원하십니까?");
		System.out.print("네 또는 아니요 를 입력해주세요 >> ");
		String str = sc.next();
		boolean b = str.equals("네");
		if (b == false) break;
		}

	}
	
	// TODO 학생정보수정	
	static void update(String student[][], String column[]) {
		Scanner sc = new Scanner(System.in);
		// 이름입력 -> 국어, 영어, 수학 수정

		System.out.println("===========================");
		System.out.println("특정학생의 정보 수정구역 입니다");
		System.out.println("===========================");
		int count = 0, menu = 0;
		
		while(true) {
		System.out.print("원하시는 학생의 이름을 입력해주세요 = ");
		String name = sc.next();
		
		count = foundStudent(student, name);
		if (count == -1) continue;
		
		System.out.print(student[count][0] + "학생의 수정하고 싶은 정보를 입력해주세요(예: 나이) = ");
		String info = sc.next();		
		
		for (int i = 0; i < column.length; i++) {
			boolean b1 = info.equals(column[i]);
			if(b1 == true) {
				menu = i;
				break;
			}
		}
		if (menu == -1) continue;

		System.out.print("수정할 내용을 적어주세요 = ");
		String ch = sc.next();
		student[count][menu] = ch;

		System.out.println("다른학생의 조회를 원하십니까?");
		System.out.print("네 또는 아니요 를 입력해주세요 >> ");
		String str = sc.next();
		boolean b = str.equals("네");
		if (b == false) break;
		}
	}

	// TODO 학생정보검색		
	static int foundStudent(String student[][], String name) {
		int count = 0;
		for (int i = 0; i < student.length; i++) {
			boolean b = name.equals(student[i][0]);
			if(b == true) {
				count = i;
				break;
			}
			else {
				System.out.println("학생 정보를 찾을 수 없습니다");
				count = -1;
				return count;
			}
		}
		return count;
	}
	
	// TODO 학생정보저장	
	static void savedata(String student[][], String colunm[]) {
		File file = new File("c:\\tmp\\Student.txt");
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			for (int i = 0; i < student.length; i++) {
				if(student[i][0] == null) break;
				for (int j = 0; j < student[0].length; j++) {
					pw.println(colunm[j] + " = " + student[i][j]);
				}				
			}
			
			pw.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	// TODO 학생정보불러오기
	static void loaddata() {
		File file = new File("c:\\tmp\\Student.txt");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String str = "";
			
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// TODO 학생정보전체출력
	static void alldata(String student[][]) {
		for (int i = 0; i < student.length; i++) {
			if (student[i][0] == null) break;
			System.out.println(Arrays.toString(student[i]));		
		}	
	}
}
