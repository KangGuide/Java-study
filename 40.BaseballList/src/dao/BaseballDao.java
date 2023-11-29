package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import dto.BatterDto;
import dto.HumanDto;
import dto.PitcherDto;
import io.BbFileIO;

public class BaseballDao {
	Scanner sc = new Scanner(System.in);

	// 학생 데이터 관리 배열
	BbFileIO fio = new BbFileIO("BaseballTeam");
	private List<HumanDto> hlist; 
	private int findIndex = -1;

	// TODO 기본설정
	public BaseballDao() {
		hlist = new ArrayList<HumanDto>();
	}
	
	// TODO 선수추가
	public void insert() {
		while(true) {
			System.out.println("선수 정보 입력입니다");	
			
			System.out.print("선수번호 >> ");
			int number = sc.nextInt();
			
			System.out.print("이름 >> ");
			String name = sc.next();
			
			System.out.print("나이 >> ");
			int age = sc.nextInt();
			
			System.out.print("신장 >> ");
			double height = sc.nextDouble();
			
			System.out.print("투수/타자 >> ");
			String position = sc.next();
			
			if(position.equals("투수")) {
				System.out.print("승수 >> ");
				int win = sc.nextInt();
				
				System.out.print("패수 >> ");
				int lose = sc.nextInt();
				
				System.out.print("방어율 >> ");
				double defence = sc.nextDouble();
			
				hlist.add(new PitcherDto(number, name, age, height, position, win, lose, defence));
				 
			}
			else {
				System.out.print("Batcount >> ");
				int batcount = sc.nextInt();
				
				System.out.print("Hit >> ");
				int hit = sc.nextInt();
				
				System.out.print("타율 >> ");
				double hivAvg = sc.nextDouble();
				
				hlist.add(new BatterDto(number, name, age, height, position, batcount, hit, hivAvg));
				
			}
						
			System.out.print("그만입력하시겠습니까? (네/아니요) >> ");
			String finish = sc.next();
			if(finish.equals("네")) break;
			
		}
	}

	// TODO 검색함수
	int search(String name) {
		for (int i = 0; i < hlist.size(); i++) {
			HumanDto h = hlist.get(i);
			if (h.getName().equals(name)) {
				findIndex = i;
				break;
			}
		  }
		return findIndex;
	}
	
	
	// TODO 선수삭제
	public void delete() {
		System.out.print("삭제하고 싶은 선수의 이름 >> ");
		String name = sc.next();
		
		findIndex = search(name);
		
		if(findIndex != -1) {	// 찾았음
			hlist.remove(findIndex);
			System.out.println(name + "학생의 데이터를 삭제하였습니다");
		}else {
			System.out.println("학생명단에 없습니다");
		}	
	}
	
	// TODO 선수조회
	public void select() {
		System.out.print("검색하고 싶은 선수의 이름 >> ");
		String name = sc.next();
		
		List<HumanDto> findlist = new ArrayList<HumanDto>();
		boolean b = true;
		for (int i = 0; i < hlist.size(); i++) {
			HumanDto h = hlist.get(i);
			if (h.getName().equals(name)) {
				findlist.add(h);
			}
			else b = false;
		}
		if (b = true) {
			for (HumanDto s : findlist) {
				  System.out.println(s.print());
			}
		}
		else System.out.println("선수명단에 없습니다");	
	}
	
	// TODO 선수수정
	public void update() {
		System.out.print("수정하고 싶은 선수의 이름 >> ");
		String name = sc.next();
		
		findIndex = search(name);
		 
		if(findIndex == -1) {
			System.out.println("선수명단에 없습니다");
			return;
		}		
		System.out.println("수정할 데이터를 찾았습니다");
		
		if(hlist.get(findIndex) instanceof PitcherDto) {
			PitcherDto pd = (PitcherDto)hlist.get(findIndex);
			System.out.print("승수 >> ");
			String win = sc.next();
			
			System.out.print("패수 >> ");
			String lose = sc.next();
			
			System.out.print("방어율 >> ");
			String defence = sc.next();

			pd.setWin(Integer.parseInt(win));
			pd.setLose(Integer.parseInt(lose));
			pd.setDefence(Double.parseDouble(defence));
		}
		else if(hlist.get(findIndex) instanceof BatterDto) {
			BatterDto bd = (BatterDto)hlist.get(findIndex);
			System.out.print("batcount >> ");
			String batcount = sc.next();
			
			System.out.print("hit >> ");
			String hit = sc.next();
			
			System.out.print("타율 >> ");
			String hivAvg = sc.next();

			bd.setBatcount(Integer.parseInt(batcount));
			bd.setHit(Integer.parseInt(hit));
			bd.setHivAvg(Double.parseDouble(hivAvg));			
		}
		System.out.println("수정을 완료했습니다");		
	}
	// TODO 타율순위 조회 (내림차순)
	public void batranking() {
	
		List<BatterDto> ba = new ArrayList<BatterDto>();
		for (int i = 0; i < hlist.size(); i++) {
			HumanDto temp = hlist.get(i);
//			if (hlist.get(i) instanceof BatterDto) 이거도 가능하고
//			if (temp instanceof BatterDto) 이거도 아래와 동일하다	
			if (temp.getPosition().equals("타자")) {
				ba.add((BatterDto) temp);
			}
		}
		if(ba.size() < 2) {
			System.out.println("선수가 1명이거나 순위를 정할 수 없습니다");
			return;
		}
		Collections.sort(ba, Collections.reverseOrder());
		int count = 1;
		for (BatterDto s : ba) {
			System.out.println("타율" + count + "등 " + s.getName() + "선수 타율" + s.getHivAvg() + "입니다");
			count++;
		}	
	}

	// TODO 방어율 순위 조회 (오름차순)
	public void pitranking() {
	
		List<PitcherDto> pi = new ArrayList<PitcherDto>();
		for (int i = 0; i < hlist.size(); i++) {
			HumanDto hu = hlist.get(i);
			if (hu.getPosition().equals("투수")) {
				pi.add((PitcherDto) hlist.get(i));
			}
		}
		
		String Rank[][] = new String[pi.size()][2];	
		String temp[][] = new String[pi.size()][2];
		
		// 방어율 및 이름 불러오기
		for (int i = 0; i < pi.size(); i++) {
				PitcherDto pd = pi.get(i);
				Rank[i][0] = Double.toString(pd.getDefence());
				Rank[i][1] = pd.getName();
			}
		
		// 방어율 낮은순서로 정렬
		for (int i = 0; i < Rank.length - 1; i++) {
			for (int j = i+1; j < Rank.length; j++) {
					if (Double.parseDouble(Rank[i][0]) > Double.parseDouble(Rank[j][0])) {
						temp[i][0] = Rank[i][0];
						Rank[i][0] = Rank[j][0];
						Rank[j][0] = temp[i][0];
						temp[i][1] = Rank[i][1];
						Rank[i][1] = Rank[j][1];
						Rank[j][1] = temp[i][1];
					}
				}
			}			
		// 출력
		int count = 1;
		for (int i = 0; i < Rank.length; i++) {
			System.out.println("방어율" + count + "등 " + Rank[i][1] + "선수 방어율" + Rank[i][0] + "입니다");
			count++;	
		}	
	}			

	// TODO 야구팀조회
	public void allData() {
		for (HumanDto h : hlist) {
			  System.out.println(h.print());
		  }
	}
	
	// TODO 야구팀 데이터저장
	public void save() {
		// 실제로 삭제된 데이터를 제외한 (정상적인)데이터가 몇개?
		fio.Create("BaseballTeam");
		fio.Datasave(hlist);		
	}
	
	// TODO 데이터 불러오기
	public void load() {
		hlist = fio.dataLoad();
	}
		
}
