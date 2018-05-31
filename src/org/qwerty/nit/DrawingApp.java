/**
 * Created by sanchitgupta001 on 27/05/18.
 */
package org.qwerty.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
        //Triangle triangle = new Triangle();
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml")); deprecated
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
        context.registerShutdownHook(); // Here, shut down hook is registerd and once application ends, spring context will destroy all beans itself
        Triangle3 triangle = (Triangle3) context.getBean("triangle");
        triangle.draw();
    }
}
