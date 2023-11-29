package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import dto.HumanDto;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	Collection : 수집
		 	
		 	List :  목록
		 			데이터의 관리를 유동적으로 할 수 있는 배열.
		 			관리는 (index) number로 접근 및 관리한다.
		 			선형구조 o-o-o-o----
		 			
		 	ArrayList(99%)
		 			검색이 효율이 우수
		 	
		 	LinkedList
		 			빈번하게 추가/삭제가 되는 경우에 적합한 구조
		*/
		
		// (유)동적인 배열을 선언!	ArrayList arrList[] = new ArrayList[];
//		ArrayList<Integer> arrList = new ArrayList<Integer>();
		List<Integer> arrList = new ArrayList<Integer>();
		
		// 추가
		arrList.add(1111);	//0
		
		Integer in = new Integer(2222);	//1
		arrList.add(in);
		
		arrList.add(new Integer(3333));	//2
		
		// 목록의 크기
		int len = arrList.size(); // == length
		System.out.println("size:" + len);
		
		// 목록에서 데이터를 산출	arrList[0 ~ n]
		Integer ii = arrList.get(0);		// arrList[0]
		System.out.println(ii);
		
		// 모든 데이터를 출력
		for (int i = 0; i < arrList.size(); i++) {
			Integer n = arrList.get(i);
			System.out.println(i + ":" + n);
		}
		
		for (Integer n : arrList) {
			System.out.println(n);
		}
		
		// 원하는 위치에 추가 0 ~ 2	1111 2222 3333 <- 3000
		Integer inum = 3000;
		arrList.add(2, inum);
		for (Integer n : arrList) {
			System.out.println(n);
		}
		System.out.println();
		
		// 삭제
		arrList.remove(1);
//		arrList.remove(new Integer(3000));
		//그냥 3000을 적으면 3000번지로 인식하기 때문에 위와같이 적어서 사용한다 
		for (int i = 0; i < arrList.size(); i++) {
			Integer n = arrList.get(i);
			System.out.println(i + ":" + n);
		}
		
		// 배열을 리스트 리스트를 배열로
		// 검색
		int index = arrList.indexOf( 3000 );
		System.out.println(index);
		System.out.println(arrList.get(index));
		int idx = -1;
		for (int i = 0; i < arrList.size(); i++) {
			Integer n = arrList.get(i);
			if(n == 3333) {
				idx = i;
				break;
			}
		}
		System.out.println("idx:" + idx);
		// 수정
		Integer newInt = 5555;
		arrList.set(1, newInt);
		for (int i = 0; i < arrList.size(); i++) {
			Integer n = arrList.get(i);
			System.out.println(i + ":" + n);
		}		
		List<String> list = new ArrayList<String>();		
		// 추가
		list.add("T1");
		list.add("KT");
		list.add("젠지");
		list.add("D+KIA");		
		// 원하는 위치에 추가
		String str = "한화";
		list.add(3, str);
		// 출력
		for (String st : list) {
			System.out.println(st);
		}
		System.out.println();	
		// 삭제
		list.remove(2);
		// 출력
		for (int i = 0; i < list.size(); i++) {
			String st = list.get(i);
			System.out.println((i + 1) + "등팀: " + st);
		}
		// 검색
		String Tname = "T1";		
		int id = -1;
		for (int i = 0; i < list.size(); i++) {
			String team = list.get(i);
			if(team.equals(Tname)) {
				id = i;
				break;
			}
		}
		// 출력
		System.out.println("idx:" + id + "팀이름:" + list.get(id));
		// 수정
		String str1 = "DPLUSKIA";
		list.set(3, str1);
		// 출력
		for (int i = 0; i < list.size(); i++) {
			String re = list.get(i);
			System.out.println(i + ":" + re);
		}
		
		// TODO Array -> list 변환 
		// Arrays 클래스의 asList() 메서드 사용
		Integer[] intArray = {1, 3, 5, 7, 9};
		  List<Integer> intList = Arrays.asList(intArray);
		  System.out.println("intList: " + intList);

		  String[] strArray = {"A", "AB", "ABC"};
		  List<String> strList = Arrays.asList(strArray);
		  System.out.println("strList: " + strList);

		  Boolean[] boolArray = {true, false, true};
		  List<Boolean> boolList = Arrays.asList(boolArray);
		  System.out.println("boolList: " + boolList);
		  
		// 문제점: Array원본 배열을 수정하면 list의 값도 수정됨
	    //		또한 list로 변경은 되지만 list를 정상적으로 사용할 수 없음
		  Integer[] intArray1 = {1, 3, 5, 7, 9};
		  List<Integer> intList1 = Arrays.asList(intArray1);

		  System.out.println("[0번째 요소의 값을 변경하기 전]");
		  System.out.println("intArray: " + Arrays.toString(intArray1));
		  System.out.println("intList: " + intList1);

		  intArray1[0] = 11;

		  System.out.println("\n[0번째 요소의 값을 변경 후]");
		  System.out.println("intArray: " + Arrays.toString(intArray1));
		  System.out.println("intList: " + intList1);
		
		  //TODO Collection 클래스의 addAll()메서드 사용
		  // asList()와 차이점은 배열의 값을 변경해도 list의 값이 변경되지 않는다
		  Integer[] intArray2 = {1, 3, 5, 7, 9};
		  List<Integer> intList2 = new ArrayList<>();
		  Collections.addAll(intList2, intArray2);

		  System.out.println("[변경 전]");
		  System.out.println("intArray: " + Arrays.toString(intArray2));
		  System.out.println("intList: " + intList2);

		  intArray2[0] = 11;
		  intList2.add(11);

		  System.out.println("\n[변경 후]");
		  System.out.println("intArray: " + Arrays.toString(intArray2));
		  System.out.println("intList: " + intList2);
		  
		  //
		  Integer[] intArray3 = {1, 3, 5, 7, 9};
		  List<Integer> intList3 = Arrays.stream(intArray3).collect(Collectors.toList());

		  System.out.println("[변경 전]");
		  System.out.println("intArray: " + Arrays.toString(intArray3));
		  System.out.println("intList: " + intList3);

		  intArray3[0] = 11;
		  intList3.add(11);

		  System.out.println("\n[변경 후]");
		  System.out.println("intArray: " + Arrays.toString(intArray3));
		  System.out.println("intList: " + intList3);
		  System.out.println();
		  
		  // TODO list -> Array
		  // List.toArray() 방식
		  // set List (String) - reference types
		  List<String> list1 = new ArrayList<>();
		  list1.add("a");
		  list1.add("b");
		  list1.add("c");

		  // 1. toArray() - 배열 선언과 동시에 할당
		  String[] arr = list1.toArray(new String[0]); // ["a", "b", "c"]
		  //String[] arr = list.toArray(String[]::new);   // java11~ 이상
		  for (int i = 0; i < arr.length; i++) {
			  System.out.print(arr[i] + " ");
		  }
		  System.out.println();  

		  // 2. toArray() - 배열 선언 후 채워 넣음
		  String[] arr2 = new String[list1.size()];
		  list1.toArray(arr2); // ["a", "b", "c"]
		  for (int i = 0; i < arr2.length; i++) {
			  System.out.print(arr2[i] + " ");
		  }
		  System.out.println();
		  
		  // Stream API (Java8 이상)
		  String[] arr3 = list1.stream().toArray(String[]::new);
		  for (int i = 0; i < arr3.length; i++) {
			  System.out.print(arr3[i] + " ");
		  }
		  System.out.println();
		  
		  // 기본형(primitive) 배열로의 변환 : for문 사용
		  // set List (Integer)
		  List<Integer> list2 = new ArrayList<>();
		  list2.add(1);
		  list2.add(2);
		  list2.add(3);

		  // 4. int 기본형(primitive) 변환 - 전통적인 방법
		  int[] arr4 = new int[list2.size()];
		  for(int i = 0; i < list2.size(); i++){
		      arr4[i] = list2.get(i);
		  }
		  for (int i = 0; i < arr4.length; i++) {
			  System.out.print(arr4[i] + " ");
		  }
		  System.out.println();
		  
		  // 5. int 기본형(primitive) 변환 - Stream API (Java8 이상)
		  int[] arr5 = list2.stream().mapToInt(i->i).toArray();
		  for (int i = 0; i < arr5.length; i++) {
			  System.out.print(arr5[i] + " ");
		  }
		  System.out.println();
		  
		  // TODO 강사님 내용
		  
		  List<HumanDto> hlist = new ArrayList<HumanDto>();
		  
		  // 추가
		  String name = "홍길동";
		  int age = 24;
		  double height = 172.1;
		  HumanDto dto = new HumanDto(name, age, height);
		  hlist.add(dto);
		  
		  hlist.add(new HumanDto("성춘향", 16, 157.3));
		  hlist.add(new HumanDto("일지매", 22, 181.2));
		  hlist.add(new HumanDto("홍두께", 21, 177.3));
		  
		  /*
		  for (int i = 0; i < hlist.size(); i++) {
			HumanDto h = hlist.get(i);			
			System.out.println(h.toString());
			System.out.println(h.getName());
		  }
		  */
		  for (HumanDto h : hlist) {
			  System.out.println(h.toString());
		  }
		  System.out.println();
		  
		  // 원하는 위치에 추가
		  HumanDto human = new HumanDto("홍두께", 25, 178.7);
		  hlist.add(1, human);
		  for (HumanDto h : hlist) {
			  System.out.println(h.toString());
		  }
		  System.out.println();
		  
		  // 삭제
		  int findIndex = -1;
		  for (int i = 0; i < hlist.size(); i++) {
			HumanDto h = hlist.get(i);
			if (h.getName().equals("성춘향")) {
				findIndex = i;
				break;
			}
		  }
		  
		  if (findIndex != -1) {
			hlist.remove(findIndex);
		  }
		  for (HumanDto h : hlist) {
			  System.out.println(h.toString());
		  }
		  System.out.println();
		  
		  // 검색 (동명이인 검색법)
		  List<HumanDto> findlist = new ArrayList<HumanDto>();
		  for (int i = 0; i < hlist.size(); i++) {
			HumanDto h = hlist.get(i);
			if (h.getName().equals("홍두께")) {
				findlist.add(h);
			}
		  }
		  for (HumanDto h : findlist) {
			  System.out.println(h.toString());
		  }
		  System.out.println();
		  
		  // 수정
		  findIndex = -1;
		  for (int i = 0; i < hlist.size(); i++) {
			HumanDto h = hlist.get(i);
			if (h.getName().equals("성춘향")) {
				findIndex = i;
				break;
			}
		  }
		  
		  // list 안에 Object를 변경
		  HumanDto hman = new HumanDto("김인수", 26, 179.2);
		  hlist.set(2, hman);
		  for (HumanDto h : hlist) {
			  System.out.println(h.toString());
		  }
		  System.out.println();
		  
		  // list 안에 데이터를 수정
		  HumanDto man = hlist.get(0);
		  man.setAge(20);
		  man.setHeight(180.0);
		  
		  for (HumanDto h : hlist) {
			  System.out.println(h.toString());
		  }
		  System.out.println();
		  
		  // Object는 최상위 클래스이기 때문에 모든 하위 데이터를 포함할 수 있다
		  List<Object> allDataList = new ArrayList<>();
		  
		  allDataList.add(new String("하이"));
		  allDataList.add(new Integer(123));
		  allDataList.add(new HumanDto("abc", 22, 180));
		  allDataList.add(hlist);
		  
		  
		  
	}
}
