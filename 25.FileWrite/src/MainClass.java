import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {

	public static void main(String[] args) {
		
		// 파일쓰기 - 파일이 없는 경우, 생성 + 쓰기(덮어쓰기)가 된다
		
		File file = new File("c:\\tmp\\test.txt"); // \n \" (\\ = \) 따라서 두개씀
		/*
		// 한문자씩 쓰기
		try {
			FileWriter fw = new FileWriter(file);
			fw.write("안녕하세요" + "\n");
			fw.close();  // 닫아주지 않으면 쓰기가 적용되지 않는다
			
			// 추가 쓰기
			FileWriter fw = new FileWriter(file, true);
			fw.write("건강하세요" + "\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		// 문장으로 쓰기
		try {
			FileWriter fw = new FileWriter(file); // new FileWriter(file, true); 추가쓰기
			BufferedWriter bw = new BufferedWriter(fw); // 저장소에 쓰기
			PrintWriter pw = new PrintWriter(bw);
			
			pw.print("안녕");
			pw.println("하이");
			pw.println("건강하세요");
			
			pw.close(); // 원래는 3개다 해야하지만 이것만 하면 나머지도 다 닫힌다
//			bw.close();
//			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
}