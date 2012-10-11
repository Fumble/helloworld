package com.liutianqing.factory;

import com.liutianqing.ihm.Gente;
import com.liutianqing.services.American;
import com.liutianqing.services.Francais;

public class PersonFactory {
	
	public Gente getPerson(String iso2){
		if(iso2.equalsIgnoreCase("fr"))
			return new Francais();
		else
			return new American();
	}


}
