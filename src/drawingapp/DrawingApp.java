package drawingapp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

    public static void main(String[] args) {
        System.out.println("Hello");
        
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        //Triangle t = (Triangle) factory.getBean("triangle");
        
        //spring.xml needs to be in src folder
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
        Triangle t = (Triangle) context.getBean("triangle");

        //Triangle t = new Triangle();
        t.draw();
        
        Triangle1 t1 = (Triangle1) context.getBean("triangle1");
        t1.draw();
    }
}
