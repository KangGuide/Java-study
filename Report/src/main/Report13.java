package main;

import Point3D.Point3D;
import Robot.DanceRobot;
import Robot.DrawRobot;
import Robot.Robot;
import Robot.SingRobot;
import StarCraft.Dropship;
import StarCraft.Marine;
import StarCraft.Tank;
import StarCraft.Unit;

public class Report13 {

	public static void main(String[] args) {
		// TODO 과제1
		
				
		Point3D p1 = new Point3D(1,2,3);
		Point3D p2 = new Point3D(1,2,3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println("p1.equals(p2)?"+(p1.equals(p2)));		
		
		// TODO 과제2
		Unit u[] = new Unit[3];
//		Unit u1, u2, u3;
		
		u[0] = new Marine();
		u[1] = new Tank();
		u[2] = new Dropship();
		
		u[0].move(100, 200);
		u[1].move(300, 500);
		
		for (int i = 0; i < u.length; i++) {
			if(u[i] instanceof Marine) {
				Marine m = (Marine)u[i];
				m.stimPack();
			}
			else if(u[i] instanceof Tank) {
				((Tank)u[i]).changeMode();
			}
			else if(u[i] instanceof Dropship) {
				((Dropship)u[i]).load();
				((Dropship)u[i]).unload();
			}
		}

		// TODO 과제3
		
		Robot[] arr = { new DanceRobot(), new SingRobot(), 
				new DrawRobot()};
				for(int i=0; i< arr.length;i++)
				action(arr[i]);
		

	}

	private static void action(Robot robot) {
		if(robot instanceof DanceRobot){
			DanceRobot d = (DanceRobot)robot;
			d.dance();
		}
		else if(robot instanceof SingRobot){
			SingRobot s = (SingRobot)robot;
			s.sing();
		}
		else if(robot instanceof DrawRobot){
			DrawRobot dr = (DrawRobot)robot;
			dr.draw();
		}
	}
		
}