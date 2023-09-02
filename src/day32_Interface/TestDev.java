package day32_Interface;

import java.time.LocalDate;

public class TestDev {
    public static void main(String[] args) {
        DevClass dev = new DevClass(LocalDate.of(1991,1,17));
        CildDev dev2 = new CildDev(LocalDate.of(2004,11,12));

        dev.devType(); // this is abstract method from the interface;
        dev.printSomething(); // this is instance method inherited from interface
        dev.enjoy(); // this is from parent class
        dev.rest();
        dev.work();

        System.out.println("This is variable: "+Dev.dev);
        System.out.println("This is static method:");
       Dev.dev();
        System.out.println(dev);
        System.out.println("---------------------------------------------------");

        // child object inherits everything from parent including features added by interface
        dev2.devType();
        dev2.printSomething();
        dev2.enjoy();
        dev2.rest();
        dev2.work();
        System.out.println(Dev.dev);
        Dev.dev();
        System.out.println(dev2);

    }
}
