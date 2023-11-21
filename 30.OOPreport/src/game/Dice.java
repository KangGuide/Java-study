package game;

public class Dice {
	private int dice;
	
	public int getDice() {
		dice = (int)(Math.random()*6)+1;
		return dice;
	}
}
