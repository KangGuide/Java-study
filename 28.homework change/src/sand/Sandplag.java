package sand;

public class Sandplag {
	private int dice;
	private int sandplag;
	
	// 모래깃발 70~100 랜덤 설정
	public int Plag() {
		sandplag = (int)(Math.random()*30)+69;
		return sandplag;
	}
	
	// 1~50 랜덤 주사위 설정
	public int Dice() {
		dice = (int)(Math.random()*10)+1;
		return dice;
	}
}
