package single;

public class SingletonClass {

	private static SingletonClass sc = null;
	public String name;
	public String address;
	
	public SingletonClass() {
		
	}
	
	public static SingletonClass getInstance() {
		if (sc == null) {
			sc = new SingletonClass();
		}
		return sc;
	}
	
}
