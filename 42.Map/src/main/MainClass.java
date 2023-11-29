package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	Collection
		 	
		 	HashMap : 사전
		 			  "apple":"사과"
		 			  	key	 :value
		 			  (이진)tree 구조
		 			  index로 관리, 접근하는 것이 아님!!!
		 			  key 값은 중복을 허용하지 않음
		 	
		 	TreeMap : HashMap + Sorting(key)
		 			  HashMap 에 비해서 효율은 떨어진다	 
		*/
		
//		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		Map<Integer, String> hMap = new HashMap<Integer, String>();
		
		// 추가
		hMap.put(111, "백십일");
		hMap.put(222, "이백이십이");
		hMap.put(333, "삼백삼십삼");
		hMap.put(new Integer(444), new String("사백사십사"));
		hMap.put(555, new String("오백오십오"));
		
		// Map의 크기
		System.out.println("node의 총수: " + hMap.size());
		
		// value 취득
		String value = hMap.get(333);
		System.out.println(value);
		
		// 삭제
		String val = hMap.remove(222);
		System.out.println(val + "값이 삭제되었습니다");
		
		// 검색
		// 있다/없다 <- key만 해당
		boolean b = hMap.containsKey(new Integer(333)); //Wrapper class이기 때문에 그냥 바로 적어도된다
		System.out.println(b);
		
		// 찾아서 값을 취득
		if (hMap.containsKey(333)) {
			val = hMap.get(333);
			System.out.println(val);
		}
		
		// 수정
		val = hMap.replace(333, "300 + 30 + 3"); 
//		hMap.put(333, "300 + 33");

		System.out.println(val + " 값이 수정되었음");		
		
		val = hMap.get(333);
		System.out.println(val);
		
		// 모두 출력
		Iterator<Integer> it = hMap.keySet().iterator();
		while(it.hasNext()) { // next element 있는지 확인하는 것
			
			Integer key = it.next();
			String _value = hMap.get(key);
			
			System.out.println("key:" + key + " value" + _value);
		}
		System.out.println();
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("apple", "사과");
		hashMap.put("pear", "배");
		hashMap.put("grape", "포도");
		hashMap.put("banana", "바나나");
		
		Iterator<String> it1 = hashMap.keySet().iterator();
		while(it1.hasNext()) {
			
			String k = it1.next();
			String v = hashMap.get(k);
			
			System.out.println("key:" + k + " value:" + v);
		}
		System.out.println();
		
		// Sorting
		// HashMap -> TreeMap
		// 변경조건으로 key, value 값이 HashMap이랑TreeMap이 동일해야한다
		TreeMap<String, String> treeMap = new TreeMap<String, String>( hashMap );
		
		// 오름차순
//		Iterator<String> it2 = treeMap.keySet().iterator();
		
		// 내림차순
		Iterator<String> it2 = treeMap.descendingKeySet().iterator();
		
		while(it2.hasNext()) {
			String k = it2.next();
			System.out.println("key:" + k + " value" + treeMap.get(k));
		}
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("이름", "홍길동");
		map.put("나이", 24);
//		map.put("dto", dto);

	}
}
