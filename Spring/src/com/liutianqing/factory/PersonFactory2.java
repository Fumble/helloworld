package com.liutianqing.factory;

import org.springframework.beans.factory.FactoryBean;

import com.liutianqing.ihm.Gente;
import com.liutianqing.services.American;


public class PersonFactory2 implements FactoryBean<Gente> {

	Gente p=null;
	@Override
	public Gente getObject() throws Exception {
		// TODO Auto-generated method stub
		if(p==null)
		{
			p=new American();
		}
		return p;
	}

	@Override
	public Class<? extends Gente> getObjectType() {
		// TODO Auto-generated method stub
		return American.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

	
}
