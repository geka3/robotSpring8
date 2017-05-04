package net.robots.toshiba;

import org.springframework.beans.factory.InitializingBean;

import net.robots.interfaces.Head;

public class ToshibaHead implements Head,InitializingBean {

	@Override
	public void think() {
		// TODO Auto-generated method stub
		System.out.println("Toshka is thinking..");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ToshibaHead is inited");
		
	}

}
