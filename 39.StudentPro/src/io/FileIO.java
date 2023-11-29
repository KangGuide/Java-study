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

public class FileIO {
	
	File file;
	StudentDto dto = new StudentDto();
	
	public FileIO(String filename) {
		file = new File("c:\\tmp\\" + filename + ".txt");
	}
	
	public void Create(String filename) {
		try {
			if(file.createNewFile()) {
				System.out.println("파일 생성 성공!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void Datasave(List<StudentDto> list) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			for (StudentDto st : list) {
				pw.println(st);
			}
			pw.close();	
			
			System.out.println("성공적으로 저장되었습니다");			
		} catch (IOException e) {			
			e.printStackTrace();
		}	
	}
	
	public List<StudentDto> Dataload() {
		List<StudentDto> list = new ArrayList<StudentDto>();
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
				list.add(new StudentDto(str1[0], Integer.parseInt(str1[1]), Double.parseDouble(str1[2]),
						str1[3], Integer.parseInt(str1[4]), 
						Integer.parseInt(str1[5]), Integer.parseInt(str1[6])));
			}
			System.out.println("파일을 성공적으로 불러왔습니다");
		} catch (Exception e) {
			System.out.println("파일을 불러오는과정에서 문제가 발생하였습니다");
		}
		return list;
	}

	
	
	
	
	
	
	
	
	
}
