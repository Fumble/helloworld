package com.liutianqing.factory;

import com.liutianqing.services.Being;
import com.liutianqing.services.Cat;
import com.liutianqing.services.Dog;

public class BeingFactory {

	public static Being getBeing(String arg){
		
		if(arg.equalsIgnoreCase("dog")){
			return new Dog();
		}
		else
			return new Cat();
	}
}
