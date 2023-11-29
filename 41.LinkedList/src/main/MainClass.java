package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MainClass {
	public static void main(String[] args) {
		/*
		 	ArrayList : 검색, 대입(배열)
		 				o-o-o-o-o-o
		 				
		 	
		 	LinkedList : 실시간 추가/삭제에 적합
		 				o-o-o-o-o-o
		*/
		
		// generic 만 빼면 객체다
//		ArrayList<String> list = new ArrayList<String>();
//		List<E> list = new ArrayList<>();
		
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("Giants");
		arrlist.add("Tigers");
		arrlist.add("Twins");
		
		// LinkedList에 ArrayList를 집어 넣는 방법
		LinkedList<String> linkList = new LinkedList<String>( arrlist );
		
		// 맨 앞의 node에 element(Object)를 추가한다
		// (0번지에 하나의 객체를 추가)
		linkList.addFirst("Eagles"); // linkList.add(0, null);
		linkList.addLast("Bears");   // linkList.add("str");
		
		for (String s : linkList) {
			System.out.println(s);
		}
		
		// 결과를 보면 linkList가 arrlist의 배열을 바꾸지 않는다
//		for (String s : arrlist) {
//			System.out.println(s);
//		}
		System.out.println();
		/*
		 	iterator : 반복자 == 포인터(주소)
		 	
		 	list.get(0 ~ n)
		 	[0]  → 	[1]  → 	[2]		index
		 	0x01 →	0x02 →	0x03	iterator
		*/
		Iterator<String> it = linkList.iterator();
		while(it.hasNext()) {	// hasNext 는 true/false 리턴
			String value = it.next(); // 다음주소로 보내면서 현재값을 리턴해준다
			System.out.println(value);
		}
		
		
		
		
		
		/*
		Vector<String> vec = new Vector<String>();
		vec.add("자이언츠");
		vec.add("타이거즈");
		vec.add("트윈즈");		
		for (String v : vec) {
			System.out.println(v);
		}
		*/
		
		
		
	}
}
