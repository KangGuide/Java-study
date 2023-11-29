package main;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	Generic == template(형태)
		 	자료형 변수
		 	같은 클래스에서 다양한 자료형을 사용하고 싶은 경우에 설정하는 요소
		*/
		
//		Box box = new Box(333);
//		int temp = box.getTemp();
		
		// Object 자료형만 가능! 
		Box<Integer> box = new Box<Integer>(333);
		System.out.println(box.getTemp());
		
		Box<String> sBox = new Box<String>("안녕하세요");
		System.out.println(sBox.getTemp());
		
		BoxMap<Integer, String> bMap = new BoxMap<Integer, String>(111, "Hello");
		System.out.println(bMap.toString());
		
		BoxMap<Double, String> dMap = new BoxMap<Double, String>(123.456, "World");
		System.out.println(dMap.toString());
		
	}
}

class Box<T>{
	T temp;
	
	public Box(T temp) {
		this.temp = temp;
	}
	public T getTemp() {
		return temp;
	}
	public void setTemp(T temp) {
		this.temp = temp;
	}
}
/*
class BoxDouble{
	double temp;
	
	public BoxDouble(double temp) {
		this.temp = temp;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
}
*/

class BoxMap<Key, Value>{
	Key key;
	Value value;

	public BoxMap(Key key, Value value) {
		super();
		this.key = key;
		this.value = value;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "BoxMap [key=" + key + ", value=" + value + "]";
	}	
}
