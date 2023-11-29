package dao;

public interface BaseballDaoInter {
	
	// 여기서 먼저 작성할 메소드를 대략 적어두고 클래스에 상속하여 오버라이드 하여 작성하기 쉽게함
	// 한눈에 볼 수 있는 장점이 있고 클래스 이름은 Impl(Implement)을 뒤에 붙여서 작성한다
	
	public void insert();
	public void delete();
	public void select();
	public void update();
	public void batranking();
	public void pitranking();
	
	public void allData();
	
	public void save();
	public void load();
	
}
