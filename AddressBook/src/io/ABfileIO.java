package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import dao.AddressBookDao;
import dto.AddressBookDto;

public class ABfileIO {
	
	public static void save(String filename) {
		
		File file = new File("c:\\tmp\\" + filename + ".txt");
		try {
			if(file.createNewFile()) {
				System.out.println("파일 생성 성공!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		AddressBookDao ab = AddressBookDao.getInstance();

		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			for (AddressBookDto at : ab.list) {
				pw.println(at);
			}
			pw.close();	
			
			System.out.println("성공적으로 저장되었습니다");			
		} catch (IOException e) {			
			e.printStackTrace();
		}	
	}

	public static void load(String filename) {
		File file = new File("c:\\tmp\\" + filename + ".txt");
		AddressBookDao ab = AddressBookDao.getInstance();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			// 데이터 읽기
			String str;
			while((str = br.readLine()) != null) {
				String str1[] = str.split("\\*");
				ab.list.add(new AddressBookDto(str1[0], Integer.parseInt(str1[1]), str1[2], str1[3], str1[4]));
			}
			System.out.println("파일을 성공적으로 불러왔습니다");
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일을 불러오는과정에서 문제가 발생하였습니다");
		}
	}
	
}
