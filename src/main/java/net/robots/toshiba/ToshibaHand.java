package net.robots.toshiba;

import org.springframework.beans.factory.InitializingBean;

import net.robots.interfaces.Hand;

public class ToshibaHand implements Hand,InitializingBean {

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("Toshiba hand get something");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ToshibaHand is inited");
		
	}

}
