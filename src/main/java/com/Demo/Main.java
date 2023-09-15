package com.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//         ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context =  new AnnotationConfigApplicationContext(BeansConfig.class);
//        Staff doc = context.getBean(Nurse.class);
//        doc.assist();
        Doctor doc = context.getBean(Doctor.class);
        doc.assist();
        doc.setQualification("mbbs");
        System.out.println(doc.tostring());

        Doctor doc1 = context.getBean(Doctor.class);
        doc1.assist();
        System.out.println(doc1.tostring());
//        doc.assist();
//         System.out.println(doc.getQualification());
    }
}