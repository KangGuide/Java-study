package cls;

import single.SingletonClass;

public class Human {
	
	private String name;
	private String address;
	
	public Human() {
		name = "성춘향";
	}
	
	public void sad() {
		SingletonClass sc = SingletonClass.getInstance();
		this.address = sc.address;

	}
	
	public void func() {
		// singleton class의  instance를 취득하고
		SingletonClass sc = SingletonClass.getInstance();
		// 그 인스턴스의 변수에 값을 넣는다
		sc.name = this.name;
	}

	
	@Override
	public String toString() {
		return "Human [name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	
	/*
	public String getName() {
		return name;
	}
	*/
}
