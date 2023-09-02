package day33_Polimorphism.cars;

public class Limited extends Ram implements Electric{
    public Limited(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void charge() {
        System.out.println("Use unique Ram Charger");
    }
    public void limitedRamFeature(){
        System.out.println("this is only available in Limited Rams");
    }
}
