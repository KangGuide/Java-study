package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import dto.StudentDto;

public class FileIO {
	
	File file;
	StudentDto dto = new StudentDto();
	
	public FileIO(String filename) {
		file = new File("c:\\temp\\" + filename + ".txt");
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
	public void Datasave(String arr[]) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			
			for (int i = 0; i < arr.length; i++) {
				pw.println(arr[i]);
			}
			pw.close();	
			
			System.out.println("성공적으로 저장되었습니다");
			
		} catch (IOException e) {			
			e.printStackTrace();
		}	
	}
	public String[] Dataload() {
		String arr[] = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String str = "";
			int count = 0;
			// 데이터의 갯수를 카운터
			while((str = br.readLine()) != null) {
				count++;
			}
			arr = new String[count];
			// 파일의 처음 위치로
			br = new BufferedReader(new FileReader(file));
			
			// 데이터 읽기
			int i = 0;
			while((str = br.readLine()) != null) {
				arr[i] = str;
				i++;
			}
			
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;
	}
	
		
	public void Datasave(StudentDto[] student) {
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
	
	public StudentDto[] Load(){
		File f = new File("c:\\tmp\\student.txt");
		StudentDto[] student = new StudentDto[10];
		try {			
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String str = "";
			int count = 0;			
			while((str = br.readLine()) != null) {
				String data[] = str.split("-");
				student[count] = new StudentDto(data[0], Integer.parseInt(data[1]), Double.parseDouble(data[2]),
						data[3], Integer.parseInt(data[4]), Integer.parseInt(data[5]), Integer.parseInt(data[6]));
				count++;				
			}			
			br.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return student;		
	}
	
	
	
	
	
	
	
	
	
	
}
