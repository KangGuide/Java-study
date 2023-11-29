package Pingpong.Play;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Racket1 extends JComponent{
	
	//라켓 크기 변수
	int width, height;
	
	public Racket1(int w, int h) {
		width = w;
		height = h;
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		
		if (Ball.y < PingPong.HEIGHT - height) {

			g.fillRect(0, Ball.y, width, height);

			} else {

			g.fillRect(0, PingPong.HEIGHT - height, width, height);

			}

	}

	
}
