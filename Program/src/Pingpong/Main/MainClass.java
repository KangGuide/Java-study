package Pingpong.Main;

import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import Pingpong.Play.MyDrawingSurface;

public class MainClass extends JFrame implements Runnable, MouseMotionListener{

	// 화면창 기본설정
	public static final int WIDTH =400;
	public static final int HEIGHT =220;
	private static int myMouse =0;
	private MyDrawingSurface screen;
	
	public MainClass() { //기본설정
		setTitle("PingPong");
		setVisible(true);
		setSize(WIDTH + 20, HEIGHT + 40);
		screen = new MyDrawingSurface();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
