package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //1st approach
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();

        //2nd approach
        Nurse nurse = (Nurse) context.getBean("nurse");
        nurse.assist();
    }
}
