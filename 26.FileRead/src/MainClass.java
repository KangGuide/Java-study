import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {
	public static void main(String[] args) {

		// 파일 읽기
		
		File file = new File("c:\\tmp\\test.txt");
		
		// 한문자씩 읽음
		/*
		try {
			FileReader fr = new FileReader(file);
			
			String str = "";
			int c = fr.read();
			while (c != -1) { // -1 은 파일의 끝
				System.out.println((char)c);
				str = str + (char)c;
				c = fr.read();
			}
			fr.close();
			System.out.println(str);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		//문장으로 읽기
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String str = "";
			
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
