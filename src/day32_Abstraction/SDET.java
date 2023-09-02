package day32_Abstraction;

import java.time.LocalDate;

public class SDET extends AbstractParent{
    public SDET(LocalDate dob) {
        super(dob);
    }

    @Override
    public void work() {
        System.out.println("Test, coffee, test, play, test, relax");
    }

    @Override
    public void rest() {
        System.out.println("Learn how to become developer");
    }

    @Override
    public void enjoy() {
        System.out.println("Code");
    }
}
