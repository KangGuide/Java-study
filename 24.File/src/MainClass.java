import java.io.File;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	source code -> logic(구현)
		 	file, database -> 기능, 저장매체
		 	
		 	name	age		address
		 	홍길동	24		부산시	-> write, read
		 	
		 	목적: 데이터의 저장 및 불러오기
		 	
		 	*.txt
		 	jpg, dll, lib, jar, png
		 	
		 	dll : Dynamic Link Library 
		 		  동적	  연결	도서관(집합체)
		 	Library -> lib
		 	정적 도서관(집합체) 			 	
		 */
		
		/*
		// 파일 목록을 검색
		File fdir = new File("c:\\");
		
		// 파일명으로 문자열로 취득
		String filelist[] = fdir.list();
		
		// 디렉토리 + 파일명을 출력
		for (int i = 0; i < filelist.length; i++) {
			System.out.println(filelist[i]);
		}
		*/
		
		// 파일 + 디렉토리 검색
		File fdir = new File("c:\\"); // 대소문자 상관없음
		
		// 각 파일의 정보를 취득
		File filelist[] = fdir.listFiles();
		
		for (int i = 0; i < filelist.length; i++) {
			if(filelist[i].isFile()) {
				System.out.println("[파일]" + filelist[i].getName());
			}
			else if(filelist[i].isDirectory()) {
				System.out.println("[폴더]" + filelist[i].getName());
			}
			else {
				System.out.println("[?]" + filelist[i].getName());
			}
		}
		
		// 파일 생성
		File newfile = new File("c:\\tmp\\newfile.txt");

		try {
			if(newfile.createNewFile()) {  
				System.out.println("파일 생성 성공!");
			}else {
				System.out.println("파일 생성 실패!");
			}
		} catch (IOException e) { // IO : Input Output
			e.printStackTrace();
		}
		
		// 파일의 존재 여부
		if(newfile.exists()) {
			System.out.println("파일이 존재합니다");
		}else {
			System.out.println("파일이 존재하지 않습니다");
		}
		
		// 파일 읽기 권한 여부
		newfile.setReadable(false);
		
		// 파일의 읽기여부
		if(newfile.canRead()) {
			System.out.println("파일을 읽을 수 있습니다");
		}else {
			System.out.println("파일을 읽을 수 없습니다");
		}

		// 파일 읽기 전용
//		newfile.setReadOnly();
		
		// 파일의 쓰기여부
		if(newfile.canWrite()) {
			System.out.println("파일을 쓰기를 할 수 있습니다");
		}else {
			System.out.println("파일을 쓰기를 할 수 없습니다");			
		}
		
		// 파일 삭제
//		if(newfile.delete()) {
//			System.out.println("파일이 삭제되었습니다");
//		}else{
//			System.out.println("파일이 삭제되지 않았습니다");
//		}

	}
}
