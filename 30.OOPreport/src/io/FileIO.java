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
	
	StudentDto dto = new StudentDto();
	
	public void Create(String filename) {
		
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
