package day32_Interface;

import java.time.LocalDate;

public class CildDev extends DevClass{
    public CildDev(LocalDate dob) {
        super(dob);
    }

    @Override
    public void devType() {
        System.out.println("I am UI developer");
    }
}
