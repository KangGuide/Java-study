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
		
//		String student[][] = new String[20][7];
		// 더미데이터
		String student[][] = {
				{"홍길동", "23", "167.1", "부산", "90", "80", "70"},
				{"이지매", "22", "155.4", "서울", "50", "30", "40"},
				{"복덕방", "24", "159.4", "서울", "70", "10", "40"},				
		};
		
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
		boolean b = false;
		for (int i = 0; i < student.length; i++) {
			b = name.equals(student[i][0]);
			if(b == true) {
				count = i;
				break;
			}
		}
		if(b == false) {
			System.out.println("학생 정보를 찾을 수 없습니다");
			count = -1;
		}
		return count;
	}
	
	// TODO 학생정보저장	
	static void savedata(String student[][], String colunm[]) {
		File f = new File("c:\\tmp\\Student.txt");
		
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
			
		/*	for (int i = 0; i < student.length; i++) {
				if(student[i][0] == null) break;
	// null일 경우에만 생각했는데 학생정보 삭제 했을경우 "" 이렇게 저장되도록 하였기 때문에 이부분도 상정해야함
				for (int j = 0; j < student[0].length; j++) {
					pw.println(colunm[j] + " = " + student[i][j]);
				}				
			}*/
			// 토큰을 집어 넣고 내용을 저장
			for (int i = 0; i < student.length; i++) {
				if(student[i][0] == null && student[i][0] == "") break;
				for (int j = 0; j < student[0].length; j++) {
					if(j==0) {
						pw.print(student[i][j]);
						j++;
					}
					pw.print(" - " + student[i][j]);
				}
				pw.println();
			}
	// 또한 강사님 생각은 "-" 토큰을 이용하여 내용을 저장하고 불러올때 
	// 토큰을 제거해서 2차원 배열에 다시 집어 넣을 수 있도록 한다
			pw.close();
			System.out.println("파일이 정상적으로 저장되었습니다");
		} catch (IOException e) {
			System.out.println("파일이 정상적으로 저장되지 못했습니다");
		}		
	}
	
	// TODO 학생정보불러오기
	static void loaddata() {
		File f = new File("c:\\tmp\\Student.txt");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String str = "";
			int count = 0;
		/*	while((str = br.readLine()) != null) {
				String data[] = str.split("-");
				student[count][0] = data[0];
			}
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			return student;
		}			*/
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
