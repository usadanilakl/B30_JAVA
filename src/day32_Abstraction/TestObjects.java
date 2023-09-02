package day32_Abstraction;

import java.time.LocalDate;

public class TestObjects {
    public static void main(String[] args) {
//        AbstractParent parent = new AbstractParent(LocalDate.of(1991, 1, 17)) {
//        System.out.println(parent.getName());

        Developer dev = new Developer(LocalDate.of(1997,4,11));
        SDET tester = new SDET(LocalDate.of(1975, 2, 28));
        IT it = new IT(LocalDate.of(2001,5,23));

        System.out.println(dev);
        dev.enjoy();
        dev.rest();
        dev.work();

        System.out.println(tester);
        tester.enjoy();
        tester.rest();
        tester.work();

        System.out.println(it);
        it.enjoy(); it.rest(); it.work();
    }
}
