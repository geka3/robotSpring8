package net.robots;

import net.robots.interfaces.Hand;
import net.robots.interfaces.Head;
import net.robots.interfaces.Leg;
import net.robots.sony.SonyHead;
import net.robots.toshiba.ToshibaHand;
import net.robots.toshiba.ToshibaLeg;

public class ConstructRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Head head = new SonyHead();
		Hand hand = new ToshibaHand();
		Leg leg = new ToshibaLeg();

		RobotT1000 robotOne = new RobotT1000(head, hand, leg);
		robotOne.get();
	}

}
