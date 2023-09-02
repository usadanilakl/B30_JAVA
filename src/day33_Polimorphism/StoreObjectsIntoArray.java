package day33_Polimorphism;

import day33_Polimorphism.cars.*;

import java.util.ArrayList;
import java.util.Arrays;

public class StoreObjectsIntoArray {
    public static void main(String[] args) {
        //Upcasting allows to store objects of different types to be stored in one data structure
        BigHorn ram1 = new BigHorn("Ram","Big Horn", 2022);
        Limited ram2 = new Limited("Ram","Limited", 2022);
        Ram[] rams = {ram1, ram2};
        System.out.println("Rams: " + Arrays.toString(rams));

        Colorado chevy1 = new Colorado("Chevy", "Colorado", 2020);
        Silverado chevy2 = new Silverado("Chevy", "Colorado", 2020);
        ArrayList<Chevy> chevies = new ArrayList<>(Arrays.asList(chevy2,chevy1));
        System.out.println("Chevies: "+chevies);

        Accent hyundai1 = new Accent("Hyundai", "Accent", 2019);
        Ionic hyundai2 = new Ionic("Hyundai", "Accent", 2019);
        ArrayList<Hyundai> hyndais = new ArrayList<>(Arrays.asList(hyundai1,hyundai2));
        System.out.println("Hyundais: " + hyndais);

        CRV honda1 = new CRV("Honda", "CRV", 2021);
        Civic honda2 = new Civic("Honda", "Civic", 2021);
        Honda[] hondas = {honda1, honda2};
        System.out.println("hondas: "+Arrays.toString(hondas));

        Truck[] trucks = {ram1, ram2, chevy1, chevy2};
        System.out.println("Trucks: " + Arrays.toString(trucks));
        Car[] cars = {honda1,honda2,hyundai1,hyundai2};
        System.out.println("cars: " + Arrays.toString(cars));
        Electric[] electrics = {ram2, chevy2, honda2, hyundai2};
        System.out.println("Electric Vehicles: " + Arrays.toString(electrics));
        Vehicle[] vehicles = {ram1, ram2, chevy1, chevy2, honda1, honda2, hyundai1, hyundai2};
        System.out.println("All Vehicles: " + Arrays.toString(vehicles));

    }
}
