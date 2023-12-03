package main;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainClass {
	public static void main(String[] args) {
		/*
		  	Calendar year month day + time
		  	 
		  	Date year month day + time
		  	
		*/

		// 보통 이건 사용하지 않는다
		Calendar cal1 = new GregorianCalendar();
		
		// 이걸 많이 사용함
		Calendar cal = Calendar.getInstance();
		
		// 오늘 날짜(get)
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;	// 0 ~ 11
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " 
				+ hour + "시 " + minute + "분 " + second + "초");
		
		//요일 1~ 7 일 ~ 토
		int weekday = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekday);
		
		// 지정한 달의 마지막 날짜 28 29 30 31
		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastday);
	}
}
