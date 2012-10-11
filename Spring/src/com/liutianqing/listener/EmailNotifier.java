package com.liutianqing.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import com.liutianqing.event.EmailEvent;

public class EmailNotifier implements ApplicationListener {

	
	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		if(arg0 instanceof EmailEvent){
			EmailEvent emailEvent=(EmailEvent) arg0;
			System.out.println("address email for sending : "+emailEvent.getAddress());
			System.out.println("the content of mail : "+emailEvent.getText());
			
		}
		else{
			System.out.println("myself : "+arg0);
		}
		
	}

}
