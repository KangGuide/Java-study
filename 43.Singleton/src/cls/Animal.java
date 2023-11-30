package cls;

import single.SingletonClass;

public class Animal {

	private String name;
	
	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	public void method() {
		// singleton class의  instance를 취득하고
		SingletonClass sc = SingletonClass.getInstance();
		// singleton class의 name변수로부터 값을 취득
		this.name = sc.name;
	}
	
	
	
	

	/*
	public void setName(String name) {
		this.name = name;
	}
	*/
}
