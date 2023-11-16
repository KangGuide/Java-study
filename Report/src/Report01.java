
public class Report01 {

	public static void main(String[] args) {
		
		// 과제1
		System.out.print("========================================");
		System.out.println();
		System.out.print("|이름       나이    전화번호          주소  |");
		System.out.println();
		System.out.print("========================================");
		System.out.println();
		System.out.print("|홍길동      20     010-111-2222   경기도 |");
		System.out.println();
		System.out.print("|일지매      18     02-123-4567    서울  |");
		System.out.println();
		System.out.print("========================================");
		System.out.println();
		
		// 과제2
		System.out.print("=================================================\n");
		System.out.print("\\ name \t\tage \tphone \t\taddress \\ \n");
		System.out.print("=================================================\n");
		System.out.print("\\ \"홍길동\" \t20 \t010-111-2222 \t\'경기도\' \t\\ \n");
		System.out.print("\\ \"일지매\" \t18 \t02-123-4567 \t\'서울\' \t\\ \n");
		System.out.print("================================================= \n");

		
		// 과제3
		double q,w,e; // 신장
		q = 175.12;
		w = 180.01;
		e = 155.78;
		
		byte a,b,c; // 나이
		a = 20;
		b = 18;
		c = 14;
		
		boolean m,f; // 남자
		m = true;
		f = false;
		
		String aa, ab, ac, ba, bb, bc, ca, cb, cc;
		aa = "\"홍길동\"";
		ab = "010-111-2222";
		ac = "\"경기도\"";
		ba = "\"일지매\"";
		bb = "02-123-4567";
		bc = "\"서울\"";
		ca = "\"장옥정\"";
		cb = "02-345-7890";
		cc = "\"부산\"";
		
		System.out.println("==========================================================");
		System.out.println("\\ name \tage \tman \tphone \t\theight \taddress\t \\");
		System.out.println("==========================================================");
		System.out.println("\\" + aa + "\t" + a + "\t" + m + "\t" + ab + "\t" + q + "\t" + ac +"\t \\");
		System.out.println("\\" + ba + "\t" + b + "\t" + m + "\t" + bb + "\t" + w + "\t" + bc +"\t \\");
		System.out.println("\\" + ca + "\t" + c + "\t" + f + "\t" + cb + "\t" + e + "\t" + cc +"\t \\");
		System.out.println("==========================================================");
		
		
		// 과제4
		int x,y,xy;
		x = 1;
		y = 2;
		xy = x;
		x = y;
		y = xy;
		
		System.out.println();
		System.out.println("출력:");
		System.out.println("x = " + x + " y = " + y );

		
	}

}
