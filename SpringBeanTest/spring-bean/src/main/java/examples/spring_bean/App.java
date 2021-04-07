package examples.spring_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
				"customerreview-spring.xml");

//		Hello obj1 = (Hello) context.getBean("helloBean1");
//		System.out.println(obj1.getWords());
//
//		Hello obj2 = (Hello) context.getBean("helloBean1");
//		System.out.println(obj1.getWords());

    }
}
