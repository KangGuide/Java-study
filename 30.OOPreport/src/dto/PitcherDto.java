package dto;

public class PitcherDto extends HumanDto {
		//변수 선언
	private int win;
	private int lose;
	private double defence;
	
	public PitcherDto(int number, String name, int age, double height, String position, int win, int lose, double defence) {
		super(number, name, age, height, position);
		this.win=win;
		this.lose=lose;
		this.defence=defence;
	}

	//	TODO set,get
	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public double getDefence() {
		return defence;
	}

	public void setDefence(double defence) {
		this.defence = defence;
	}
	/*
	@Override
	public String toString() {
		return "PitcherDto number=" + super.getNumber() + ", name=" + super.getName() + ", age=" + super.getAge() + ", height=" + super.getHeight() + "position=" + position + ", win=" + win + ", lose=" + lose + ", defence=" + defence + "]";
	}
	*/
	@Override
	public String toString() {
		return super.toString() + "-" + win + "-" + lose + "-" + defence;
	}
	@Override
	public String print() {
		return super.print() + " 승:" + win + " 패:" + lose + " 방어율:" + defence;
	}

}
