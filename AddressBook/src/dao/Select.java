package dao;

import java.util.ArrayList;
import java.util.List;

import dto.AddressBookDto;

public class Select {


	AddressBookDao ab = AddressBookDao.getInstance();
	List<AddressBookDto> findlist = new ArrayList<>();
	
	// 검색 화면
	public void select() {
			System.out.print("검색조건을 적어주세요 이름(1), 생년월일(2), 메모(3) >> ");
			int selectnumber = ab.sc.nextInt();
			switch (selectnumber) {
			case 1:
				nameSelect();
				break;
			case 2:
				birthdaySelect();
				break;
			case 3:
				memoSelect();
				break;
			default:
				System.out.println("조건번호를 잘못 적었습니다.");
				break;
			}
	}
	
	// TODO 이름으로 검색
	public void nameSelect() {
		System.out.print("검색하고싶은 사람의 이름을 적어주세요 >> ");
		String name = ab.sc.next();

		boolean b = true;
		for (int i = 0; i < ab.list.size(); i++) {
			AddressBookDto s = ab.list.get(i);
			if (s.getName().equals(name)) {
				findlist.add(s);
			}
			else b = false;
		}		
		
		if (b == true) {
			System.out.println("동명이인이 있습니다 아래의 생년월일을 확인후 번호를 입력해주세요");
			int i = 0;
			for (AddressBookDto a : findlist) {
				System.out.println((i+1) + "번 " + a.getName() + " 생년월일:" + a.getBirthday());
				i++;
			}		
			System.out.print("찾으려던 사람은 몇번입니까? >>");
			i = (ab.sc.nextInt()-1);
			findlist.get(i).print();
		} else System.out.println("주소록 명단에 없습니다");
	}
	
	// TODO 생년월일로 검색
	public void birthdaySelect() {
		System.out.print("검색할 생년월일을 적어주세요 >> ");
		String birthday = ab.sc.next();
		
		boolean b = true;
		for (int i = 0; i < ab.list.size(); i++) {
			AddressBookDto s = ab.list.get(i);
			if (s.getBirthday().equals(birthday)) {
				findlist.add(s);
			}
			else b = false;
		}
		
		if (b == true) {
			System.out.println("입력하신 생년월일을 가진사람이 여려명 있으니 확인후 번호를 입력하세요");
			int i = 0;
			for (AddressBookDto a : findlist) {
				System.out.println((i+1) + "번 " + a.getName() + " 생년월일:" + a.getBirthday());
				i++;
			}		
			System.out.print("찾으려던 사람은 몇번입니까? >>");
			i = (ab.sc.nextInt()-1);
			findlist.get(i).print();
		} else System.out.println("주소록 명단에 없습니다");
	}
	
	// TODO 메모로 검색
	
	public void memoSelect() {
		System.out.print("검색하고싶은 메모를 적어주세요 >> ");
		String memo = ab.sc.next();
		
		int people = 0; // 메모가 맞지않는 사람을 찾아내기 위함
		for (int i = 0; i < ab.list.size(); i++) {
			AddressBookDto s = ab.list.get(i);
			if (s.getMemo().contains(memo) == true) {
				findlist.add(s);
				people++;
			}
		}
		if (people > 0) {
			System.out.println("입력하신 메모를 가지고있는 사람의 신상정보를 알려드리겠습니다");
			int i = 0;
			for (AddressBookDto a : findlist) {
				System.out.println((i+1) + "번 " + a.getName() + " 생년월일:" + a.getBirthday() + 
									" 메모:" + a.getMemo());
				i++;
			}		
			System.out.print("찾으려던 사람은 몇번입니까? >>");
			i = (ab.sc.nextInt()-1);
			findlist.get(i).print();
		}	else System.out.println("주소록 명단에 없습니다");
			
	}

	
	
	// TODO 이름 검색함수
	public int Search() {
		String Matchmemo = ""; //찾으려는 사람의 메모
		int findIndex = -1;
		
		System.out.print("검색하고싶은 사람의 이름을 적어주세요 >> ");
		String name = ab.sc.next();

		boolean b = true;
		for (int i = 0; i < ab.list.size(); i++) {
			AddressBookDto s = ab.list.get(i);
			if (s.getName().equals(name)) {
				findlist.add(s);
			}
			else b = false;
		}		
		
		if (b == true) {
			System.out.println("동명이인이 있습니다 아래의 생년월일을 확인후 번호를 입력해주세요");
			int i = 0;
			for (AddressBookDto a : findlist) {
				System.out.println((i+1) + "번 " + a.getName() + " 생년월일:" + a.getBirthday());
				i++;
			}		
			System.out.print("찾으려던 사람은 몇번입니까? >>");
			i = (ab.sc.nextInt()-1);
			Matchmemo = findlist.get(i).getMemo();
		} else System.out.println("주소록 명단에 없습니다");
		
		for (int i = 0; i < ab.list.size(); i++) {
			AddressBookDto s = ab.list.get(i);
			if (s.getMemo().equals(Matchmemo)) {
				findIndex = i;
				break;
			}
		}
		return findIndex;		
	}
	
/*
 for (i = 0; i < findlist.size(); i++) {
			AddressBookDto a = new AddressBookDto(name, i, name, name, name);
			System.out.println((i+1) + "번" + a.getName() + " 생년월일:" + a.getBirthday());
		}
 */	
}
