package Pingpong.Play;

public class Racket2 {
	static int width, height;

	public Racket2(int w, int h) {

	width = w;

	height = h;

	}

	 
	public void paint(Graphics g) { // (1)-C, (2)

	g.setColor(Color.RED);

	 

	if(PingPong.myMouse < PingPong.HEIGHT - height){

	g.fillRect(PingPong.WIDTH - width, PingPong.myMouse, width, height);

	}else{

	g.fillRect(PingPong.WIDTH - width, PingPong.HEIGHT - height, width, height);

	}

	}
}
