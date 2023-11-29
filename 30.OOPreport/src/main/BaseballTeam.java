package main;

import java.util.Scanner;

import dao.BaseballDao;

public class BaseballTeam {

	public static void main(String[] args) {
		/*
		 baseball team
		 pitcher
		 	win
		 	lose
		 	방어율
		 batter
		 	bat count
		 	hit
		 	타율
		*/
		Scanner sc = new Scanner(System.in);

		// menu
		
		BaseballDao dao = new BaseballDao();

		while(true) {
			System.out.println("========= 야구팀 프로그램 ==========");
			System.out.println("1.선수추가");
			System.out.println("2.선수삭제삭제");
			System.out.println("3.선수검색");
			System.out.println("4.선수수정");
			System.out.println("5.타율순위");
			System.out.println("6.방어율순위");
			System.out.println("7.야구팀저장");
			System.out.println("8.야구팀불러오기");
			System.out.println("9.전체명단보기");
			//동명이인 출력방법
	
			System.out.print("메뉴의 번호 >> ");
			int menuNumber = sc.nextInt();
			
			switch(menuNumber) {
			case 1:
				dao.insert();
				break;
			case 2:
				dao.delete();
			break;
			case 3:
				dao.select();
				break;
			case 4:
				dao.update();
				break;
			case 5:
				dao.batranking();
				break;
			case 6:
				dao.pitranking();
				break;
			case 7:
				dao.save();
				break;
			case 8:
				dao.load();
				break;
			case 9:
				dao.allData();
				break;
			}
		}

		
		
	}
}
