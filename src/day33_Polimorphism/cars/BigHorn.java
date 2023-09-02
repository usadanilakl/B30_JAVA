package day33_Polimorphism.cars;

public class BigHorn extends Ram{
    public BigHorn(String make, String model, int year) {
        super(make, model, year);
    }

    public void bigHornFeature(){
        System.out.println("Big Horn feature here");
    }
}
