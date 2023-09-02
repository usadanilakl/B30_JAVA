package day32_Abstraction;

import java.time.LocalDate;

public class IT extends AbstractParent{
    public IT(LocalDate dob) {
        super(dob);
    }

    @Override
    public void work() {
        System.out.println("Do everything");
    }

    @Override
    public void rest() {
        System.out.println("Do more of everything");
    }

    @Override
    public void enjoy() {
        System.out.println("No time on anything else");
    }
}
