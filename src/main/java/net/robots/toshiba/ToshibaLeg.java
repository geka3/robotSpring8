package net.robots.toshiba;

import org.springframework.beans.factory.InitializingBean;

import net.robots.interfaces.Leg;

public class ToshibaLeg implements Leg,InitializingBean {

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("Toshiba is going....");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ToshibaLeg is inited");
		
	}

}
