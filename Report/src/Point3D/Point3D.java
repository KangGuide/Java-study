package Point3D;

public class Point3D {

	int x,y,z;
	
	public Point3D(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	Point3D() {
		this(0,0,0);
	}
	
	// 여기 과제에서 원한 오버라이드는 최상위 객체인 Object에 있는 메소드를 오버라이드 하는것
	public boolean equals(Object obj) {
		Point3D pos = (Point3D)obj;
		if(this.x==pos.x && this.y == pos.y && this.z == pos.z) return true;
		else return false;
		
		/*
		Point3D1 p3 = new Point3D1();
		return p3.equals(obj);
		*/		
	}
	
	public String toString() {
		String str = "[" + x + "," + y + "," + z + "]";
		return str;
		/*
		Point3D1 p3 = new Point3D1();
		return p3.toString();
		*/
	}
	 
}
