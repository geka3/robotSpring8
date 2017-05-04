package net.robots.sony;

import org.springframework.beans.factory.InitializingBean;

import net.robots.interfaces.Head;

public class SonyHead implements Head,InitializingBean {
	public void think() {
		System.out.println("Sony is thinking...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SonyHead is inited");
		
	}
}
