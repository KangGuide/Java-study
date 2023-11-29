package Inter;

public class HeClass implements MyInterface, YouInterface {

	@Override
	public void func() {
		System.out.println("HeClass func()");
	}

	@Override
	public void abMethod() {
		System.out.println("HeClass abMethod()");
	}

}
