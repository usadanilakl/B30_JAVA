package day26_Object.constructor;

import java.time.LocalDate;

public class ConstructorTest {
    public static void main(String[] args) {
        ConstructorTypes one = new ConstructorTypes();
        System.out.println(one);
        ConstructorTypes two = new ConstructorTypes("Danil");
        System.out.println(two);
        ConstructorTypes three = new ConstructorTypes("Evhen", LocalDate.of(1983, 9, 22));
        System.out.println(three);
        ConstructorTypes four = new ConstructorTypes(LocalDate.of(1991, 5, 06));
        System.out.println(four);

    }
}
