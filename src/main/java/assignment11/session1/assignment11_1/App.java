package assignment11.session1.assignment11_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	 @SuppressWarnings("resource")
	      ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
	      HelloWorld obj =(HelloWorld)ac.getBean("helloWorld");
	      obj.getMessage();
    }
}
