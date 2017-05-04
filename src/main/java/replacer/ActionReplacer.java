package replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

import net.robots.interfaces.Replacer;

public class ActionReplacer implements  MethodReplacer {

	

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("replaced method");
		return null;
	}
	
}
