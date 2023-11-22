package main;

import dao.StudentDao;

public class MainClass4 {

	public static void main(String[] args) {
		// menu
		
		StudentDao dao = new StudentDao();
		
		dao.insert();
		
		dao.allData();

	}

}
