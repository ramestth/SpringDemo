package com.Demo;
import org.springframework.stereotype.Component;

@Component
public class Nurse implements  Staff {
    @Override
    public String tostring() {
        return null;
    }

    public void assist()
    {
        System.out.println("nurse is assisting");
    }
}
