package net.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import forSpring.BaseModel;
import net.robots.Robot;
import net.robots.RobotT1000;
import net.robots.interfaces.RobotConveyor;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("allContext.xml");
		//RobotT1000 t1000Conveyor = (RobotT1000)context.getBean("t1000");
		//t1000.about();
		
		
		RobotConveyor t1000Conveyor = (RobotConveyor) context.getBean("t1000Conveyor");
		Robot t1000_1 = t1000Conveyor.createRobot();
		Robot t1000_2 = t1000Conveyor.createRobot();
		Robot t1000_3 = t1000Conveyor.createRobot();
		
		System.out.println("t1000_1 " + t1000_1);
		System.out.println("t1000_2 " + t1000_2);
		System.out.println("t1000_3 " + t1000_3);
		
		t1000_1.action();
		
		//t1000.about();
//		
//		
//		RobotT1000 t1000_2 = (RobotT1000) context.getBean("t1000");
//		System.out.println(t1000_2 + " head " + t1000_2.getHead());
//		t1000_2 = (RobotT1000) context.getBean("t1000");
//		System.out.println(t1000_2 + " head " + t1000_2.getHead());
//		
//		System.out.println();
//		Robot rob2 =(Robot) context.getBean("t1000p");
//		//rob2.about();
//
//		System.gc();
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
