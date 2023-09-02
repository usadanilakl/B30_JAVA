package day26_Object.person;

import java.time.LocalDate;

public class PersonObject {
    public static void main(String[] args) {
        PersonClass dan = new PersonClass("Dan", LocalDate.of(1991,1,17));
        System.out.println(dan);
        dan.conversation();
        dan.dob = LocalDate.of(2000, 1, 17);
        dan.age = dan.dob.getYear() - LocalDate.now().getYear();
        System.out.println(dan);
    }
}
