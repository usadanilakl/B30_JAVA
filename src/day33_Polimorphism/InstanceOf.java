package day33_Polimorphism;

import day33_Polimorphism.cars.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class InstanceOf {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>(Arrays.asList(
                new BigHorn("Ram", "Big Horn", 2022),
                new Limited("Ram", "Limited", 2022),
                new Colorado("Chevy", "Colorado", 2020),
                new Silverado("Chevy", "Colorado", 2020),
                new Accent("Hyundai", "Accent", 2019),
                new Ionic("Hyundai", "Accent", 2019),
                new CRV("Honda", "CRV", 2021),
                new Civic("Honda", "Civic", 2021)
        ));

        countCars(vehicles, p->p instanceof Ram);
        String str = vehicles.get(0).getClass().getSimpleName();
        System.out.println("str = " + str);


    }

    public static void countCars(ArrayList<Vehicle> v, Predicate<Vehicle> p){
        int n = 0;
        for(Vehicle e : v){
            if(p.test(e)){
                n++;
            }
        }
        System.out.println(n);
    }
}
