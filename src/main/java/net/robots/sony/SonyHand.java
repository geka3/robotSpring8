package net.robots.sony;

import org.springframework.beans.factory.InitializingBean;

import net.robots.interfaces.Hand;

public class SonyHand implements Hand, InitializingBean {

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("Sony hand get something....");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SonyHand is inited");
		
	}

}
