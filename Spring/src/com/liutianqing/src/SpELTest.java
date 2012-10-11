package com.liutianqing.src;



import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.liutianqing.services.Author;
import com.liutianqing.services.Human;

public class SpELTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpressionParser parser=new SpelExpressionParser();
		Expression exp=parser.parseExpression("'Hello World'");
		System.out.println("the result of  Hello World : "+exp.getValue());
		exp=parser.parseExpression("'Hello World'.concat(' !')");
		System.out.println("the result of Hello World concat ! :"+exp.getValue());
		exp=parser.parseExpression("'HelloWorld'.bytes");
		System.out.println("the result of HelloWorld.bytes :"+exp.getValue());
		exp=parser.parseExpression("'HelloWorld'.bytes.length");
		System.out.println("the result of HelloWorld.bytes.length :"+exp.getValue());	
		exp=parser.parseExpression("new String('HelloWorld')"+".toUpperCase()");	
		System.out.println("the result of HelloWorld.toUpperCase :"+exp.getValue(String.class));
		Human h=new Human(1,"toto",new Date());
		exp=parser.parseExpression("name");
		System.out.println("person is root , the value of name :"+exp.getValue(h,String.class));
		
		exp=parser.parseExpression("name=='toto'");
		
		StandardEvaluationContext ctx=new StandardEvaluationContext();
		
		ctx.setRootObject(h);
		System.out.println(exp.getValue(ctx,Boolean.class));
		
		List<Boolean> list=new ArrayList<Boolean>();
		list.add(true);
		EvaluationContext ctx2=new StandardEvaluationContext();
		ctx2.setVariable("list", list);
		parser.parseExpression("#list[0]").setValue(ctx2, "false");
		System.out.println("1st element : "+list.get(0));
		
		AbstractApplicationContext cx=new ClassPathXmlApplicationContext("bean.xml");
		Author a=(Author) cx.getBean("author",Author.class);
		System.out.println("Author is here :"+a.getName()+a.getBooks());
		
		
		exp=parser.parseExpression("new String[] {'java','Struts','Spring'}");
		System.out.println(exp.getValue());
		exp=parser.parseExpression("new int[8][8]");
		System.out.println(exp.getValue());
		
		exp=parser.parseExpression("{'java','Struts','Spring'}");
		System.out.println(exp.getValue());
		exp=parser.parseExpression("{{'java','c'},{'html','javascript'}}");
		System.out.println(exp.getValue());
		List<String> list1=new ArrayList<String>();
		list1.add("item1");
		list1.add("item2");
		list1.add("item3");
		Map<String,Double> map=new HashMap<String,Double>();
		map.put("java", 80.0);
		map.put("Spring", 89.0);
		ctx2.setVariable("mylist", list1);
		ctx2.setVariable("mymap", map);
		System.out.println(parser.parseExpression("#mylist[1]").getValue(ctx2));
		System.out.println(parser.parseExpression("#mymap['java']").getValue(ctx2));
		
		System.out.println(parser.parseExpression("#mylist.subList(0,2)").getValue(ctx2));
	
		
		
		parser.parseExpression("#mylist[0]='first'").getValue(ctx2);
		System.out.println(list1.get(0));
		
		System.out.println(parser.parseExpression("#mylist.size()>2?"+"'its longer':'its not long'").getValue(ctx2));
		
		
		System.out.println(parser.parseExpression("T(java.lang.Math).random()").getValue());
		
		
		System.out.println(parser.parseExpression("T(System).getProperty('os.name')").getValue());

	}

}
