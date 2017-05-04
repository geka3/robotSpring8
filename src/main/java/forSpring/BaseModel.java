package forSpring;

import net.robots.Robot;
import net.robots.interfaces.*;

public abstract class BaseModel implements Robot {
	private Head head;
	private Hand hand;
	private Leg leg;
	
	public BaseModel(){
		System.out.println(System.currentTimeMillis() + " myConstructor BaseModel");
		
	}
	
	

	public BaseModel(Head head, Hand hand, Leg leg) {
		super();
		this.head = head;
		this.hand = hand;
		this.leg = leg;
	}



	/**
	 * @return the head
	 */
	public Head getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(Head head) {
		this.head = head;
	}

	/**
	 * @return the hand
	 */
	public Hand getHand() {
		return hand;
	}

	/**
	 * @param hand the hand to set
	 */
	public void setHand(Hand hand) {
		this.hand = hand;
	}

	/**
	 * @return the leg
	 */
	public Leg getLeg() {
		return leg;
	}

	/**
	 * @param leg the leg to set
	 */
	public void setLeg(Leg leg) {
		this.leg = leg;
	}
	
	
}
