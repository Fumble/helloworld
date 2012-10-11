package com.liutianqing.src;

import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liutianqing.event.EmailEvent;
import com.liutianqing.ihm.Gente;
import com.liutianqing.services.Author;
import com.liutianqing.services.Being;
import com.liutianqing.services.Chinese;
import com.liutianqing.services.Chinese2;
import com.liutianqing.services.Chinese3;
import com.liutianqing.services.Chinois;
import com.liutianqing.services.ExampleBean;
import com.liutianqing.services.French;
import com.liutianqing.services.Japanese;
import com.liutianqing.services.Person;
import com.liutianqing.services.PersonService;

public class ImSpring {
	
	public static void main(String[] args){
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("here"+ctx);
	//	PersonService p=ctx.getBean("personService", PersonService.class);
	//	p.info();

		Person per=ctx.getBean("chinese",Chinese.class);
		per.useAxe();
		
		
		Being b1=ctx.getBean("dog",Being.class);
		b1.testBeing();
		Being b2=ctx.getBean("cat",Being.class);
		b2.testBeing();
		
		Gente g1=ctx.getBean("francais",Gente.class);
		
		System.out.println(g1.sayHello("toto"));
		
		System.out.println(g1.sayGoodBye("toto"));
		
		Gente g2=ctx.getBean("american2", Gente.class);
	System.out.println(g2.sayHello("toto"));
		
		System.out.println(g2.sayGoodBye("toto"));
		
		System.out.println(ctx.getBean("&american2"));
		
		Chinois chin=ctx.getBean("chinois",Chinois.class);
		
		chin.info();
		
		Person pp=ctx.getBean("japanese",Japanese.class);
		pp.useAxe();
		pp.useAxe();
		ctx.registerShutdownHook();
		
		Author a=ctx.getBean("author",Author.class);
		a.useAxe();
		System.out.println(a.getBooks());
		
	
	/*	
	 * 
		
		Person per2=ctx.getBean("chinese2",Chinese2.class);
		per2.useAxe();
		
		
		String [] a={"reader"};
		String hello=ctx.getMessage("hello", a, Locale.getDefault());
		
		Object[] b={new Date()};
		
		String now=ctx.getMessage("now", b, Locale.getDefault());
		
		System.out.println(hello);
		System.out.println(now);
		
		EmailEvent evt=new EmailEvent("hello","test@csc.com","this is a test");
		ctx.publishEvent(evt);
		
		BeanFactory bf=ctx;
		
		French f=ctx.getBean("french", French.class);
		
		System.out.println(f.getBeanFactory());
		
		System.out.println(bf==f.getBeanFactory());
		
		System.out.println(bf);
		
		
		ExampleBean ex=ctx.getBean("example", ExampleBean.class);
		System.out.println(ex.getDoubleProperty());
		System.out.println(ex.getIntegerProperty());
		
		Chinese3 c3=ctx.getBean("chinese3", Chinese3.class);
		
		c3.test();*/
	}

}
