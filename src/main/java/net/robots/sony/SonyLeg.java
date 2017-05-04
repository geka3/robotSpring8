package net.robots.sony;

import org.springframework.beans.factory.InitializingBean;

import net.robots.interfaces.Leg;

public class SonyLeg implements Leg,InitializingBean {

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("Sony is going....");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SonyLeg is inited");
		
	}

}
