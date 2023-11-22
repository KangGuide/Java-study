package main;

import Mytv.MyTv2;

public class MainClass2 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());

	}



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