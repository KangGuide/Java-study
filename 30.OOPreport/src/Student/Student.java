package Student;

public class Student {
	public String name;
	public int ban,no,kor,eng,math;
	
	public int getTotal(int kor, int eng, int math) {
		int total = kor + eng + math;
		return total;
	}
	
	public double getAverage() {
		double avg = (double)(kor + eng + math) / 3;
		return avg;
	}
	
	
	
	
}
