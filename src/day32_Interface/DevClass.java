package day32_Interface;

import day32_Abstraction.AbstractParent;

import java.time.LocalDate;

public class DevClass extends AbstractParent implements Dev {
    public DevClass(LocalDate dob) {
        super(dob);
    }

    @Override
    public void work() {
        System.out.println("Code, meeting, relax");
    }

    @Override
    public void rest() {
        System.out.println("Play games");
    }

    @Override
    public void enjoy() {
        System.out.println("Go surf");
    }

    @Override
    public void devType() {
        System.out.println("I am full stack developer");
    }


}
