package singleton;

import java.util.ArrayList;
import java.util.List;

import dto.StudentDto;

public class SingletonClass {
	
	private static SingletonClass sc = null;
	public List<StudentDto> list;	
	
	private SingletonClass() {
		list = new ArrayList<StudentDto>();
	}
	
	public static SingletonClass getInstance() {
		if (sc == null) {
			sc = new SingletonClass();
		}
		return sc;
	}

}
