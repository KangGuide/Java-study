package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import dto.StudentDto;
import singleton.SingletonClass;

public class FileIO {
	File file;
	StudentDto dto = new StudentDto();
	SingletonClass sb = SingletonClass.getInstance();
	
	public FileIO() {
		
	}
	
	public void Create(String filename) {
		file = new File("c:\\tmp\\" + filename + ".txt");
		try {
			if(file.createNewFile()) {
				System.out.println("파일 생성 성공!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void save() {
		Create("study");
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			for (StudentDto st : sb.list) {
				pw.println(st);
			}
			pw.close();	
			
			System.out.println("성공적으로 저장되었습니다");			
		} catch (IOException e) {			
			e.printStackTrace();
		}	
	}

	public void load() {
		List<String> temp = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			// 데이터 읽기
			String str;
			while((str = br.readLine()) != null) {
				temp.add(str);	
			}
			for (int i = 0; i < temp.size(); i++) {
				String str1[] = temp.get(i).split("-");
				sb.list.add(new StudentDto(str1[0], Integer.parseInt(str1[1]), Double.parseDouble(str1[2]),
						str1[3], Integer.parseInt(str1[4]), 
						Integer.parseInt(str1[5]), Integer.parseInt(str1[6])));
			}
			System.out.println("파일을 성공적으로 불러왔습니다");
		} catch (Exception e) {
			System.out.println("파일을 불러오는과정에서 문제가 발생하였습니다");
		}
	}
	
	// TODO 강사님 방법
	public static void save(String filename) {
		File file = new File("c:\\tmp\\" + filename + ".txt");
		SingletonClass sb = SingletonClass.getInstance();

		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			for (StudentDto st : sb.list) {
				pw.println(st);
			}
			pw.close();	
			
			System.out.println("성공적으로 저장되었습니다");			
		} catch (IOException e) {			
			e.printStackTrace();
		}	
	}

	public static void load(String filename) {
		File file = new File("c:\\tmp\\" + filename + ".txt");
		SingletonClass sb = SingletonClass.getInstance();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			// 데이터 읽기
			String str;
			while((str = br.readLine()) != null) {
				String str1[] = str.split("-");
				sb.list.add(new StudentDto(str1[0], Integer.parseInt(str1[1]), Double.parseDouble(str1[2]),
						str1[3], Integer.parseInt(str1[4]), 
						Integer.parseInt(str1[5]), Integer.parseInt(str1[6])));
			}
			System.out.println("파일을 성공적으로 불러왔습니다");
			br.close();
		} catch (Exception e) {
			System.out.println("파일을 불러오는과정에서 문제가 발생하였습니다");
		}		
	}
	
}
