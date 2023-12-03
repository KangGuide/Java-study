package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.AddressBookDto;


public class AddressBookDao {

	public Scanner sc = new Scanner(System.in);
	public List<AddressBookDto> list;
	
	// singleton
	private static AddressBookDao ab;
	private AddressBookDao() {
		list = new ArrayList<AddressBookDto>();
	}
	public static AddressBookDao getInstance() {
		if (ab == null) {
			ab = new AddressBookDao();
		}
		return ab;
	}	
	
	// 주소록 입력	
	public void insert() {
		while(true) {
			System.out.println("주소록 입력창 입니다");		
			
			System.out.print("이름 >> ");
			String name = sc.next();	
			
			System.out.print("나이 >> ");
			int age = sc.nextInt();		
			
			System.out.print("전화번호 >> ");
			String phonenumber = sc.next();		
			
			System.out.print("생년월일 >> ");
			String birthday = sc.next();	
			
			System.out.print("메모 >> ");
			String memo = sc.next();

			list.add(new AddressBookDto(name, age, phonenumber, birthday, memo));
			
			System.out.print("그만입력하시겠습니까? (네/아니요) >> ");
			String finish = sc.next();
			if(finish.equals("네")) break;
		}
	}
	
	// TODO 주소록 삭제
	public void delete() {
		Select se = new Select();
		int findIndex = se.Search();
		
		if(findIndex != -1) {	// 찾았음
			list.remove(findIndex);
			System.out.println("데이터를 삭제하였습니다");
		}else {
			System.out.println("주소록 명단에 없습니다");
		}	
	}
	
	// TODO 주소록 원하는사람 검색
	public void select() {
		Select se = new Select();
		se.select();
	}
	
	// TODO 주소록 수정
	public void update() {
		Select se = new Select();
		int findIndex = se.Search();
		
		if(findIndex == -1) {
			System.out.println("주소록 명단에 없습니다");
			return;
		}		
		System.out.println("주소록 수정에 들어갑니다");
		
		System.out.print("나이 >> ");
		int age = sc.nextInt();		
		
		System.out.print("전화번호 >> ");
		String phonenumber = sc.next();		
		
		System.out.print("메모 >> ");
		String memo = sc.next();
				
		AddressBookDto a = list.get(findIndex);
		a.setAge(age);
		a.setPhonenumber(phonenumber);
		a.setMemo(memo);
		
		System.out.println("수정을 완료했습니다");		
	}
	
	// TODO 총학생 정보 출력
	public void allData() {
		for (AddressBookDto a : list) {
			  a.print();
		  }
	}
			

}
