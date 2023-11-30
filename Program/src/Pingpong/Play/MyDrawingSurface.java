package Pingpong.Play;

import java.awt.Graphics;

import javax.swing.JComponent;

public class MyDrawingSurface extends JComponent{
	
	public Ball basket[] = new Ball[1];
	public Racket1 racket1[] = new Racket1[1];
	public Racket2 racket2[] = new Racket2[1];
	 
	public MyDrawingSurface() {
		basket[0] = new Ball(15);
		racket1[0] = new Racket1(13,60);
		racket2[0] = new Racket2(13,60);
	}
	 
	public void paint(Graphics g) {
		for (Ball b : basket)	
		b.paint(g);	
		for (Racket1 r1 : racket1)	
		r1.paint(g);	
		for (Racket2 r2 : racket2)	
		r2.paint(g);
	}
}
