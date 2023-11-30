package Pingpong.Play;

import java.awt.Color;
import java.awt.Graphics;

import Pingpong.Main.MainClass;

public class Ball {
	static int x,y;
	private int xInc = 1, yInc = 1;
	private int diameter;
	
	public Ball(int d) {
		this.diameter = d;
		x = (int)(Math.random() * (MainClass.WIDTH - d) + 3);
		y = (int)(Math.random() * (MainClass.HEIGHT - d) + 3);
		xInc = (int)(Math.random() * 3 + 1);
		yInc = (int)(Math.random() * 3 + 1);
	}

	public void paint(Graphics g) {
		if ((x + 20 > MainClass.WIDTH-Racket2.width) && ((y < MainClass.myMouse)
				&& (y + 20 < MainClass.myMouse))) {
			System.out.println("공이 위로 날아갔습니다.");
			System.out.println("PC에게 패했습니다.");
			System.exit(-1);
		} 
		else if ((x + 20 > MainClass.WIDTH - Racket2.width) && (y > MainClass.myMouse + 60)) {
			System.out.println("공이 아래로 날아갔습니다.");
			System.out.println("PC에게 패했습니다.");
			System.exit(-1);
		}
		else {
			if (x < Racket2.width || x > (MainClass.WIDTH - diameter - Racket2.width))
				xInc = -xInc;
			if (y < 0 || y > (MainClass.HEIGHT - diameter))
			yInc = -yInc;
			x += xInc;
			y += yInc;
			g.setColor(Color.BLUE);
			g.fillOval(x, y, diameter, diameter);
		}

	}
}

