package day33_Polimorphism.cars;

public class Accent extends Hyundai{
    public Accent(String make, String model, int year) {
        super(make, model, year);
    }
    public void accentFeature(){
        System.out.println("this is accent feature");
    }
}
