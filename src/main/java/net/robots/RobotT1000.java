package net.robots;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import forSpring.BaseModel;
import net.robots.interfaces.Hand;
import net.robots.interfaces.Head;
import net.robots.interfaces.Leg;

public class RobotT1000 extends BaseModel implements Robot,InitializingBean,DisposableBean {
	private Head head;
	private Hand hand;
	private Leg leg;

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isSoundEnabled() {
		return soundEnabled;
	}

	public void setSoundEnabled(boolean soundEnabled) {
		this.soundEnabled = soundEnabled;
	}

	private int year;
	private boolean soundEnabled;

	public RobotT1000() {

	}

	public RobotT1000(Head head, Hand hand, Leg leg) {
		super();
		this.head = head;
		this.hand = hand;
		this.leg = leg;
	}

	public RobotT1000(Head head, Hand hand, Leg leg, String color, int year, boolean soundEnabled) {
		super();
		this.head = head;
		this.hand = hand;
		this.leg = leg;
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	public RobotT1000(String color, int year, boolean soundEnabled) {
		super();
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public void action() {
		System.out.println("color is " + color);
		System.out.println("year is " + year);
		System.out.println("sound is enabled " + soundEnabled);
	}

	public void get() {
		head.think();
		leg.go();
		head.think();
		hand.get();
	}

	public void dance() {

		leg.go();
		hand.get();
		leg.go();
		hand.get();
		System.out.println("dancing......");
	}

	@Override
	public void about() {
		// TODO Auto-generated method stub
		System.out.println("color is " + color);
		System.out.println("year is " + year);
		System.out.println("sound is enabled " + soundEnabled);
		head.think();
		hand.get();
		leg.go();
	}
	
	public void init(){
		System.out.println("Robot is initializing");
		
	}
	
	

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println(this +  " afterPropertiesSet() 2 ");
//		
//	}

//	@Override
//	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
//		// TODO Auto-generated method stub
//		System.out.println(this +  " postProcessAfterInitialization");
//		return null;
//	}

//	@Override
//	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
//		// TODO Auto-generated method stub
//		System.out.println(this +  " postProcessBeforeInitialization1");
//		return null;
//	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println(this +  " destroy");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this + " afterPropertiesSet");
	}

}
