package com.Demo;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements  Staff, BeanNameAware {

    @Override
    public String tostring()
    {
       return "Doctor {"+qualification+"}";
    }

    private  String qualification;

//    public Doctor(String qualification) {
//        this.qualification = qualification;
//    }

    public void assist()
    {
        System.out.println("doctor is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name called");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("post construct called");
    }
}
