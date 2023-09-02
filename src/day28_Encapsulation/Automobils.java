package day28_Encapsulation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Automobils {



    public static void main(String[] args) {
        Auto one = new Auto("Ram", "Limited", LocalDate.now());
        System.out.println(one);

        System.out.println("-----------------------------------------");

        one.setYear(LocalDate.of(2015, 1 , 14));
        System.out.println(one);

        System.out.println("----------------------------------------------------");

        ArrayList<Auto> AutoPark = new ArrayList<>(Arrays.asList(
                new Auto("Ram", "Big Horn", LocalDate.of(2018, 3, 25)),
                new Auto("Ram", "Laramy", LocalDate.of(2019, 3, 25)),
                new Auto("Ram", "Limited", LocalDate.of(2021, 3, 25))
        ));

        System.out.println(AutoPark);

    }



}
