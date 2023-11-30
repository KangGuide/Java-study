package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.StudentDto;
import io.FileIO;
import singleton.SingletonClass;

// Data Access Object : 데이터를 취급하는 클래스
public class StudentDao {
	Scanner sc = new Scanner(System.in);
	
	// 학생 데이터 관리 배열
	private int findIndex = -1;
	SingletonClass sb = SingletonClass.getInstance();
	
	// TODO 학생 입력
	public StudentDao() {

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
		
		sb.list.add(new StudentDto(name, age, height, address, kor, eng, math));
		
		System.out.print("그만입력하시겠습니까? (y/n) >> ");
		String finish = sc.next();
		if(finish.equals("y")) break;
	}
		
		
	}
	// TODO 학생검색 함수	
	public int search(String name) {
		for (int i = 0; i < sb.list.size(); i++) {
			StudentDto s = sb.list.get(i);
			if (s.getName().equals(name)) {
				findIndex = i;
				break;
			}
		  }
		return findIndex;
	}	
	
	// TODO 학생 삭제
	public void delete() {
		System.out.print("삭제하고 싶은 학생의 이름 >> ");
		String name = sc.next();
	
		findIndex = search(name);
		
		if(findIndex != -1) {	// 찾았음
			sb.list.remove(findIndex);
			System.out.println(name + "학생의 데이터를 삭제하였습니다");
		}else {
			System.out.println("학생명단에 없습니다");
		}	
	}
	
	// TODO 학생 검색
	public void select() {
		System.out.print("검색하고 싶은 학생의 이름 >> ");
		String name = sc.next();
		
		List<StudentDto> findlist = new ArrayList<StudentDto>();
		boolean b = true;
		for (int i = 0; i < sb.list.size(); i++) {
			StudentDto s = sb.list.get(i);
			if (s.getName().equals(name)) {
				findlist.add(s);
			}
			else b = false;
		}
		if (b = true) {
			for (StudentDto s : findlist) {
				  System.out.println(s.toString());
			}
		}
		else System.out.println("학생명단에 없습니다");	
	}
	
	// TODO 학생 수정
	public void update() {
		System.out.print("수정하고 싶은 학생의 이름 >> ");
		String name = sc.next();
		
		findIndex = search(name);
		 
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
				
		StudentDto h = sb.list.get(findIndex);
		h.setKor(Integer.parseInt(kor));
		h.setEng(Integer.parseInt(eng));
		h.setMath(Integer.parseInt(math));
		
		System.out.println("수정을 완료했습니다");		
	}
	
	
	// TODO 총학생 정보 출력
	public void allData() {
		for (StudentDto s : sb.list) {
			  s.print();
		  }
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
