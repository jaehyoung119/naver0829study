package day1109.text6.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainAnnoEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appcontext2.xml");
		
		//AnnoCar car1=(AnnoCar)ctx.getBean("annoCar");
		AnnoCar car2=(AnnoCar)ctx.getBean("mycar");
		car2.myCarInfo();
	}

}