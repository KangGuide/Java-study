package dao;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import dto.BatterDto;
import dto.HumanDto;
import dto.PitcherDto;
import dto.StudentDto;
import io.BbFileIO;

public class BaseballDao {
	Scanner sc = new Scanner(System.in);
	/*
	  battingSort(내림차순)
	  pitcherSort(올림차순)
	  save
	  load	  
	 */
	
	// 학생 데이터 관리 배열
	BbFileIO fio = new BbFileIO("BaseballTeam");
	private HumanDto human[];
	private int count;
	
	// TODO 기본설정
	public BaseballDao() {
		count = 0;		
		human = new HumanDto[20];
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
			
				human[count] = new PitcherDto(number, name, age, height, position, win, lose, defence);
				count++; 
			}
			else {
				System.out.print("Batcount >> ");
				int batcount = sc.nextInt();
				
				System.out.print("Hit >> ");
				int hit = sc.nextInt();
				
				System.out.print("타율 >> ");
				double hivAvg = sc.nextDouble();
				
				human[count] = new BatterDto(number, name, age, height, position, batcount, hit, hivAvg);
				count++; 
			}
						
			System.out.print("그만입력하시겠습니까? (네/아니요) >> ");
			String finish = sc.next();
			if(finish.equals("네")) break;
			
		}
	}
	// TODO 검색함수
	int search(String name) {
		int findIndex = -1;
		for (int i = 0; i < human.length; i++) {
			if(name.equals(human[i].getName())) { // 찾았다
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
		
		int findIndex = search(name);
		
		if(findIndex != -1) {	// 찾았음
			human[findIndex] = null;
			System.out.println(name + "선수의 데이터를 삭제하였습니다");
		}else {
			System.out.println("선수명단에 없습니다");
		}	
	}
	
	// TODO 선수조회
	public void select() {
		System.out.print("검색하고 싶은 선수의 이름 >> ");
		String name = sc.next();
		
		// 동명이인 찾는 방법 (하지만 리스트 함수를 배우고 나면 이렇게 코드를 만들진 않는다)
		int count = 0;
		for (int i = 0; i < human.length; i++) {
			HumanDto h = human[i];
			if(h != null && h.getName().equals("")) {
				if (name.equals(h.getName())) {
					count++;
				}
			}
		}
		// 선수이름을 잘못 검색한경우
		if(count == 0) {
			System.out.println("선수 명단에 없습니다");
			return;
		}
		// 1명이상일 경우 배열을 확보
		HumanDto findHuman[] = new HumanDto[count];
		int c = 0;
		for (int i = 0; i < human.length; i++) {
			HumanDto h = human[i];
			if(h != null && h.getName().equals("")) {
				if (name.equals(h.getName())) {
					findHuman[c] = human[i];
					c++;
				}
			}
		}
		System.out.println("검색된 선수 명단입니다");
		for (int i = 0; i < findHuman.length; i++) {
			System.out.println(findHuman[i].print());
		}
		
		/*
		// 동명이인은 찾지못하는 검색방식
		int findIndex = search(name);
		
		if(findIndex != -1) {
			HumanDto dto = human[findIndex];
			if(dto != null && !dto.getName().equals("")) {
				System.out.println(dto.toString());
			}				
		}else {
			System.out.println("선수명단에 없습니다");
		}
		*/	
	}
	
	// TODO 선수수정
	public void update() {
		System.out.print("수정하고 싶은 선수의 이름 >> ");
		String name = sc.next();
		
		int findIndex = search(name);
		 
		if(findIndex == -1) {
			System.out.println("선수명단에 없습니다");
			return;
		}		
		System.out.println("수정할 데이터를 찾았습니다");
		
		if(human[findIndex] instanceof PitcherDto) {
			PitcherDto pd = (PitcherDto)human[findIndex];
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
		else if(human[findIndex] instanceof BatterDto) {
			BatterDto bd = (BatterDto)human[findIndex];
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
	// TODO 타율순위 조회
	public void batranking() {
		String Rank[][] = new String[20][2];	
		String temp[][] = new String[20][2];
		int count = 1;
		// 타율 및 이름 불러오기
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && "타자".equals(human[i].getPosition()) == true) {
				BatterDto bd = (BatterDto)human[i];
				Rank[i][0] = Double.toString(bd.getHivAvg());
				Rank[i][1] = bd.getName();
			}
		}
		// 타율 높은순서로 정렬
		for (int i = 0; i < Rank.length - 1; i++) {
			if(Rank[i][0] != null && Rank[i][0] != "0.0") {
			for (int j = i+1; j < Rank.length; j++) {
				if(Rank[j][0] != null && Rank[j][0] != "0.0") {
					if (Double.parseDouble(Rank[i][0]) < Double.parseDouble(Rank[j][0])) {
						temp[i][0] = Rank[i][0];
						Rank[i][0] = Rank[j][0];
						Rank[j][0] = temp[i][0];
						temp[i][1] = Rank[i][1];
						Rank[i][1] = Rank[j][1];
						Rank[j][1] = temp[i][1];
					}
				}
			}
			}
		}			
		// 출력
		for (int i = 0; i < human.length; i++) {
			if (Rank[i][0] != "0.0" && Rank[i][0] != null) {
				System.out.println("타율" + count + "등 " + Rank[i][1] + "선수 타율" + Rank[i][0] + "입니다");
				count++;
			}
		}	
	}
	
	/*
	public void batSort() {
		
		HumanDto humanB[] = new HumanDto[10];
		
		// 타자만으로 (배열)구성
		int count = 0;
		for (int i = 0; i < human.length; i++) {
			HumanDto h = human[i];
			if(h != null && h.getName().equals("") == false) {
				if(h instanceof BatterDto) {
					humanB[count] = h;
					count++;
				}
			}
		}		
		
//		for (HumanDto h : humanB) {
//			if(h != null) {
//				System.out.println(h.info());
//			}
//		}			
		
		// 순위(내림정렬)처리
		HumanDto temp;
		for (int i = 0; i < humanB.length - 1; i++) {
			for (int j = i + 1; j < humanB.length; j++) {
				
				if(humanB[i] != null && !humanB[i].getName().equals("") 
						&& humanB[j] != null && !humanB[j].getName().equals("")) {
					
					BatterDto b1 = (BatterDto)humanB[i];
					BatterDto b2 = (BatterDto)humanB[j];
					
					if(b1.getHitAvg() < b2.getHitAvg()) {	// 비교는 타율로 한다
						temp = humanB[i];
						humanB[i] = humanB[j];
						humanB[j] = temp;
					}
				}
			}
		}	 	 
	*/

	// TODO 방어율 순위 조회
	public void pitranking() {
		String Rank[][] = new String[20][2];	
		String temp[][] = new String[20][2];
		int count = 1;
		// 타율 및 이름 불러오기
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && "투수".equals(human[i].getPosition()) == true) {
				PitcherDto bd = (PitcherDto)human[i];
				Rank[i][0] = Double.toString(bd.getDefence());
				Rank[i][1] = bd.getName();
			}
		}
		// 방어율 낮은순서로 정렬
		for (int i = 0; i < Rank.length - 1; i++) {
			if(Rank[i][0] != null && Rank[i][0] != "0.0") {
			for (int j = i+1; j < Rank.length; j++) {
				if(Rank[j][0] != null && Rank[j][0] != "0.0") {
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
			}
		}			
		// 출력
		for (int i = 0; i < human.length; i++) {
			if (Rank[i][0] != "0.0" && Rank[i][0] != null) {
				System.out.println("방어율" + count + "등 " + Rank[i][1] + "선수 방어율" + Rank[i][0] + "입니다");
				count++;
			}
		}	
	}			
	
	// TODO 야구팀조회
	public void allData() {
		for (int i = 0; i < human.length; i++) {
			HumanDto dto = human[i];
				if(dto != null && dto.getNumber() != 0) {
					System.out.println(dto.print());
				}			
		}
	}
	
	// TODO 야구팀 데이터저장
	public void save() {
		// 실제로 삭제된 데이터를 제외한 (정상적인)데이터가 몇개?
		int ci = 0;
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && human[i].getName().equals("") == false) {
				ci++;
			}
		}
		
		//배열
		String arr[] = new String[ci];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if(human[i] != null && human[i].getName().equals("") == false) {
				arr[j] = human[i].toString();
				j++;
			}
		}
		fio.Create("BaseballTeam");
		fio.Datasave(arr);
		
	}
	
	// TODO 데이터 불러오기
	public void load() {
		String arr[] = fio.dataLoad();
		
		if(arr == null || arr.length == 0) {
			count = 0;
			return;
		}
		
		// (추가될)다음 데이터의 index
		count = arr.length;
		
		// string[] -> human[]
		for (int i = 0; i < arr.length; i++) {
			// 문자열 자르기
			String split[] = arr[i].split("-");
			
			// 자른 문자열을 dto에 저장하기 위한 처리
			int number = Integer.parseInt(split[0]);
			String name = split[1];	
			int age = Integer.parseInt(split[2]);
			double height = Double.parseDouble(split[3]);
			
			if(split[4].equals("투수")) {
				String position = split[4];
				int win = Integer.parseInt(split[5]);
				int lose = Integer.parseInt(split[6]);
				double defence = Double.parseDouble(split[7]);
			
				human[i] = new PitcherDto(number, name, age, height, position, win, lose, defence);
			}
			else {
					String position = split[4];
					int batcount = Integer.parseInt(split[5]);
					int hit = Integer.parseInt(split[6]);
					double hivAvg = Double.parseDouble(split[7]);
				
					human[i] = new BatterDto(number, name, age, height, position, batcount, hit, hivAvg);
			}
		}		
		System.out.println("데이터로드 성공!");
	}		
	
	
	
	
}
