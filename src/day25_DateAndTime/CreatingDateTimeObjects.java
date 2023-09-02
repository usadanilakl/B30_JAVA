package day25_DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class CreatingDateTimeObjects {
    public static void main(String[] args) {
        LocalDate current = LocalDate.now();
        System.out.println(current);

        LocalDate past = LocalDate.of(1991,1,17);
        System.out.println(past );

        int age = current.getYear() - past.getYear();
        System.out.println(age);
        Period age2 = Period.between(past,current);
        System.out.println(age2);
        int age3 = age2.getYears();
        System.out.println(age3);


        System.out.println(current.getMonth());

        LocalDate mix = LocalDate.of(past.getYear(),current.getMonth(),current.getDayOfMonth());
        System.out.println(mix);
        System.out.println(mix.getDayOfWeek());
        System.out.println(mix.lengthOfMonth());

        LocalDateTime currentDT = LocalDateTime.now();
        System.out.println(currentDT);


    }
}
