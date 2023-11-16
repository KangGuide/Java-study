
public class MainClass {

	public static void main(String[] args) {
		/*
		 	random : 난수, 무작위 <> pattern
		 	
		 	1, 2, 3, 4, 5 -> 3, 5
		*/
		
		int rnumber;
		
		rnumber = (int)(Math.random() * 5);  // 0, 1, 2, 3, 4
		System.out.println(rnumber);
		
		// 0 ~ 9
		rnumber = (int)(Math.random() * 10);
		System.out.println(rnumber);
		
		// 10 20 30 40 50
		rnumber = ((int)(Math.random() * 5) + 1) * 10;
		System.out.println(rnumber);
		
		// -1 0 1
		rnumber = ((int)(Math.random() * 3) - 1);
		System.out.println(rnumber);
		
		// 게임에서 몬스터 움직이는 코드 -1 후진 0 멈춤 1 전진 x,y축합하면 2d에서 몹이 움직임
		int x = ((int)(Math.random() * 3) - 1);
		int y = ((int)(Math.random() * 3) - 1);
		
		// 3, 7, 9, 12, 21   
		int rNum[] = {3, 7, 9, 12, 21};
		int r = (int)(Math.random() * rNum.length);
		System.out.println(rNum[r]);
	}
}
