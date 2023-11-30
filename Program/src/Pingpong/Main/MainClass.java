package Pingpong.Main;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import Pingpong.Play.MyDrawingSurface;

public class MainClass extends JFrame implements Runnable, MouseMotionListener{

	// 화면창 기본설정
	public static final int WIDTH =400;
	public static final int HEIGHT =220;
	public static int myMouse =0;
	private MyDrawingSurface screen;
	
	public MainClass() { //기본설정
		setTitle("PingPong");
		setVisible(true);
		setSize(WIDTH + 20, HEIGHT + 40);
		screen = new MyDrawingSurface();
		add(screen, BorderLayout.CENTER);
		addMouseMotionListener(this);
	}
	public void run() {
		while (true) {
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
		repaint(); // 새로운 프레임을 그린다.
		}
	}
		 
	public static void main(String[] args) {
		Thread aThread;
		aThread = new Thread(new MainClass());
		aThread.start();
	}
	 
	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		myMouse = e.getY() - 60;
	}

}
