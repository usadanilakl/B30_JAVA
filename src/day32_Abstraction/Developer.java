package day32_Abstraction;

import java.time.LocalDate;

public class Developer extends AbstractParent{
    public Developer(LocalDate dob) {
        super( dob);
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
        System.out.println("Go on a hike");
    }
}
