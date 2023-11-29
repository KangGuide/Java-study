package dto;

public class BatterDto extends HumanDto {

	//변수 선언
	private int batcount;
	private int hit;
	private double hivAvg;
	
	public BatterDto(int number, String name, int age, double height, String position, int batcount, int hit, double hivAVg) {
		super(number, name, age, height, position);
		this.batcount=batcount;
		this.hit=hit;
		this.hivAvg=hivAVg;
	}
	
	// TODO set,get
	public int getBatcount() {
		return batcount;
	}

	public void setBatcount(int batcount) {
		this.batcount = batcount;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public double getHivAvg() {
		return hivAvg;
	}

	public void setHivAvg(double hivAvg) {
		this.hivAvg = hivAvg;
	}

	/*
	@Override
	public String toString() {
		return "BatterDto number=" + super.getNumber() + ", name=" + super.getName() + ", age=" + super.getAge() + ", height=" + super.getHeight() + ", position=" +  position + ", batcount=" + batcount + ", hit=" + hit + ", hivAvg=" + hivAvg
				+ "]";
	}
	*/
	
	@Override
	public String toString() {
		return super.toString() + "-" + batcount + "-" + hit + "-" + hivAvg;
	}
	@Override
	public String print() {
		return super.print() + " batcount:" + batcount + " hit:" + hit + " 타율:" + hivAvg;
	}

}
