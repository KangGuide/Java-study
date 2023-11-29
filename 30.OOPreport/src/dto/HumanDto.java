package dto;

public class HumanDto {

	// 선수 기본정보
	private int number;
	private String name;
	private int age;
	private double height;
	private String position;
	
	// 
	public HumanDto(int number, String name, int age, double height, String position) {
		this.number = number;
		this.name = name;
		this.age = age;
		this.height = height;
		this.position = position;
	}
	
	
	//
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return number + "-" + name + "-" + age + "-" + height + "-" + position;
	}
	
	public String print() {
		return "번호:" + number + " 이름:" + name + " 나이:" + age + " 신장:" + height + " 포지션:" + position;
	}	
	

}
