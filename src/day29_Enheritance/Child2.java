package day29_Enheritance;

import java.time.LocalDate;
import java.time.Period;

public class Child2 extends ParentClass{

    private LocalDate dob;
    private String age;
    public Child2(String parentVariable, LocalDate dob){
        super(parentVariable);
        this.dob = dob;
        age = Period.between(dob, LocalDate.now()).getYears() + " years "
                + Period.between(dob, LocalDate.now()).getMonths() + " months " +
                Period.between(dob, LocalDate.now()).getDays() + " days ";
    }

    public String toString(){
        return super.toString() + "My Date of birth is:  " + dob + "\nMy age is: " + age;
    }
}
