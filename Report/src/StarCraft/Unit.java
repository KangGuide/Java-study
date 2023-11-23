package StarCraft;

public class Unit {
	
	//현재위치
	protected int x,y;
	
	//move
	public void move(int x, int y) {
		System.out.println("좌표 x:" + x + ", y:" + y + "위치로 이동");
	}
	//stop
	public void stop() {
		System.out.println("현재 위치에 정지");
	}
	//action
	public void action() {
		System.out.println("유닛이 각자 특수기능을 실행합니다");
	}
}
