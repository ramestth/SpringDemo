package com.Demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.print.Doc;

@Configurable
@ComponentScan(basePackages = "com.Demo")
public class BeansConfig {
//    @Bean
//    public Doctor doctor()
//    {
//        return new Doctor();
//    }
}
