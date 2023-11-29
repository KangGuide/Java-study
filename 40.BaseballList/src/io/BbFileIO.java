package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import dto.BatterDto;
import dto.HumanDto;
import dto.PitcherDto;

public class BbFileIO {
	File file;
	
	
	public BbFileIO(String filename) {
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
	
	public void Datasave(List<HumanDto> hlist) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			for (HumanDto h : hlist) {
				pw.println(h);
			}
			pw.close();	
			
			System.out.println("성공적으로 저장되었습니다");
			
		} catch (IOException e) {			
			e.printStackTrace();
		}	
	}

	// 파일에 불러오기
	public List<HumanDto> dataLoad() {
		List<HumanDto> hlist = new ArrayList<HumanDto>();
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
				if (str1[4].equals("투수")) {
					hlist.add(new PitcherDto(Integer.parseInt(str1[0]), str1[1], Integer.parseInt(str1[2]), Double.parseDouble(str1[3]),
							str1[4], Integer.parseInt(str1[5]), 
							Integer.parseInt(str1[6]), Double.parseDouble(str1[7])));
				}
				else {
					hlist.add(new BatterDto(Integer.parseInt(str1[0]), str1[1], Integer.parseInt(str1[2]), Double.parseDouble(str1[3]),
							str1[4], Integer.parseInt(str1[5]), 
							Integer.parseInt(str1[6]), Double.parseDouble(str1[7])));
				}	
			}
			br.close();
			System.out.println("파일을 성공적으로 불러왔습니다");
		} catch (Exception e) {
			System.out.println("파일을 불러오는과정에서 문제가 발생하였습니다");
		}
		return hlist;
	}

	
	
}
