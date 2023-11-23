package Point3D;

public class Point3D1 extends Point3D{

	@Override
	public boolean equals(Object obj) {
		Point3D pos = (Point3D)obj;
		if(super.x==pos.x && super.y == pos.y && super.z == pos.z) return true;
		else return false;
	}

	@Override
	public String toString() {
		String str = "[" + super.x + "," + super.y + "," + super.z + "]";
		return str;
	}
	
	
	

}
