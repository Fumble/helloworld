package com.liutianqing.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.liutianqing.services.Axe;
import com.liutianqing.services.Human;
import com.liutianqing.services.Person;
import com.liutianqing.services.SteelAxe;
import com.liutianqing.services.StoneAxe;

@Configuration
public class AppConfig {

	
	
	@Value("toto") String personName;
	@Bean(name="human")
	public Person person(){
		Human h=new Human();
		h.setAxe(stoneAxe());
		h.setName(personName);
		return h;
		
	}
	@Bean(name="stoneAxe")
	public Axe stoneAxe(){
		return new StoneAxe();
	}
	
	@Bean(name="steelAxe")
	public Axe steelAxe(){
		return new SteelAxe();
	}
}
