package Pingpong.Play;

import java.awt.Color;
import java.awt.Graphics;

import Pingpong.Main.MainClass;

public class Racket2 {
	static int width, height;

	public Racket2(int w, int h) {
		width = w;
		height = h;
	}

	 
	public void paint(Graphics g) { // (1)-C, (2)
		g.setColor(Color.RED);
		if(MainClass.myMouse < MainClass.HEIGHT - height){
			g.fillRect(MainClass.WIDTH - width, MainClass.myMouse, width, height);
		}
		else{
			g.fillRect(MainClass.WIDTH - width, MainClass.HEIGHT - height, width, height);
		}
	}
}
