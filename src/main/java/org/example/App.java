package org.example;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Student student = (Student) context.getBean("st1");
        Student student1 = (Student) context.getBean("st2");
//        student.show();
//        student1.display();
//        student.setAge(30);
//        System.out.println(student.getAge());
//        System.out.println(student1.getAge());
//        System.out.println(student.getRoln());
//        System.out.println(student1.getRoln());
        student1.writeExam();

    }
}
