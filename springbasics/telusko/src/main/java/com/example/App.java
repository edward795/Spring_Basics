package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {    
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien)factory.getBean("alien");
        obj.code();
        // obj.age=15;
        System.out.println(obj.getAge());

        // Alien obj1=(Alien)factory.getBean("alien");
        // obj1.code();
        // System.out.println(obj1.age);
    }
}
