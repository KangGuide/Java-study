package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import dto.StudentDto;
import io.FileIO;

// Data Access Object : 데이터를 취급하는 클래스
public class StudentDao {
	Scanner sc = new Scanner(System.in);
	
	// 학생 데이터 관리 배열
	FileIO fio = new FileIO();
	private StudentDto student[];
	private int count;
	
	

	//추가, 삭제, 검색, 수정 (CRUD)
	public StudentDao() {
		count = 0;
		
		student = new StudentDto[10];	// 변수만 생성
		// StudentDto student1, student2, student3, ...;
		
		// dto를 생성
	/*	for (int i = 0; i < student.length; i++) {
			student[i] = new StudentDto();
		} */
	}
	
	public void insert() {
	while(true) {
		System.out.println("학생 정보 입력입니다");		
		
		System.out.print("이름 >> ");
		String name = sc.next();
		
		System.out.print("나이 >> ");
		int age = sc.nextInt();
		
		System.out.print("신장 >> ");
		double height = sc.nextDouble();
		
		System.out.print("주소 >> ");
		String address = sc.next();
		
		System.out.print("국어 >> ");
		int kor = sc.nextInt();
		
		System.out.print("영어 >> ");
		int eng = sc.nextInt();
		
		System.out.print("수학 >> ");
		int math = sc.nextInt();		
		
		student[count] = new StudentDto(name, age, height, address, kor, eng, math);
		count++; // 배열의 다음으로 이동
		
		System.out.print("그만입력하시겠습니까? (y/n) >> ");
		String finish = sc.next();
		if(finish.equals("n")) break;
	}
		
		
	}
	public void delete() {
		System.out.print("삭제하고 싶은 학생의 이름 >> ");
		String name = sc.next();
		
		int findIndex = search(name);
		
		if(findIndex != -1) {	// 찾았음
			// student[findIndex] = null; 이렇게하면 한번에 삭제가능
			student[findIndex].setName("");
			student[findIndex].setAge(0);
			student[findIndex].setHeight(0);
			student[findIndex].setAddress("");
			student[findIndex].setKor(0);
			student[findIndex].setEng(0);
			student[findIndex].setMath(0);
			
			System.out.println(name + "학생의 데이터를 삭제하였습니다");
		}else {
			System.out.println("학생명단에 없습니다");
		}	
	}
	public void select() {
		System.out.print("검색하고 싶은 학생의 이름 >> ");
		String name = sc.next();
		
		int findIndex = search(name);
		
		if(findIndex != -1) {
			System.out.println("데이터를 찾았습니다");
			System.out.println("이름:" + student[findIndex].getName());
			System.out.println("나이:" + student[findIndex].getAge());
			System.out.println("키:" + student[findIndex].getHeight());
			System.out.println("주소:" + student[findIndex].getAddress());
			System.out.println("국어:" + student[findIndex].getKor());
			System.out.println("영어:" + student[findIndex].getEng());
			System.out.println("수학:" + student[findIndex].getMath());			
		}else {
			System.out.println("학생명단에 없습니다");
		}		
	}
	public void update() {
		System.out.print("수정하고 싶은 학생의 이름 >> ");
		String name = sc.next();
		
		int findIndex = search(name);
		 
		if(findIndex == -1) {
			System.out.println("학생명단에 없습니다");
			return;
		}		
		System.out.println("수정할 데이터를 찾았습니다");
		
		System.out.print("국어 >> ");
		String kor = sc.next();
		
		System.out.print("영어 >> ");
		String eng = sc.next();
		
		System.out.print("수학 >> ");
		String math = sc.next();
				
		student[findIndex].setKor(Integer.parseInt(kor));
		student[findIndex].setEng(Integer.parseInt(eng));
		student[findIndex].setMath(Integer.parseInt(math));
	
		System.out.println("수정을 완료했습니다");		
	}
	
	public void allData() {
		for (int i = 0; i < student.length; i++) {
			StudentDto dto = student[i];
			if(dto != null && !dto.getName().equals("")) {
				System.out.println(dto.toString());
			}
		}
	}
	
	public int search(String name) {
		int findIndex = -1;
		for (int i = 0; i < student.length; i++) {
			if(name.equals(student[i].getName())) { // 찾았다
				findIndex = i;
				break;
			}
		}
		return findIndex;
	}
	public void save() {
		fio.Datasave(student);
	}
	public void load(){
			student = fio.Load();
	}
	/*
	public void save() {
		File f = new File("c:\\tmp\\student.txt");
		
		String strLine[] = new String[student.length];
		
		for (int i = 0; i < student.length; i++) {
			if(student[i] != null && !student[i].getName().equals("")) {
				strLine[i] = student[i].getName() + "-" 
							+ student[i].getAge() + "-"
							+ student[i].getHeight() + "-"
							+ student[i].getAddress() + "-"
							+ student[i].getKor()  + "-"
							+ student[i].getEng()  + "-"
							+ student[i].getMath();
			}else {
				continue;
			}
		}		
		
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
			
			for (String s : strLine) {
				if(s != null && !s.equals("")) {
					pw.println(s);
				}
			}
			
			pw.close();			
		} catch (IOException e) {			
			System.out.println("파일에 저장되지 않았습니다");
			return;
		}		
		
		System.out.println("정상적으로 저장되었습니다");
	}
	
	public void load(){
		File f = new File("c:\\tmp\\student.txt");
		
		try {			
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String str = "";
			int count = 0;			
			while((str = br.readLine()) != null) {
				String data[] = str.split("-");
				student[count] = new StudentDto(data[0], Integer.parseInt(data[1]), Double.parseDouble(data[2]),
						data[3], Integer.parseInt(data[4]), Integer.parseInt(data[5]), Integer.parseInt(data[6]));
				------
				student[count].setName(data[0]);	// 이름
				student[count].setAge(Integer.parseInt(data[1]));	// 나이
				student[count].setHeight(Double.parseDouble(data[2]));	// 키
				student[count].setAddress(data[3]);	// 주소
				student[count].setKor(Integer.parseInt(data[4]));	// 국어
				student[count].setEng(Integer.parseInt(data[5]));	// 영어
				student[count].setMath(Integer.parseInt(data[6]));	// 수학
				------
				count++;				
			}			
			br.close();
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}		
	}	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
