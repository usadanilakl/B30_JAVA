package day33_Polimorphism.cars;

public class CRV extends Honda{
    public CRV(String make, String model, int year) {
        super(make, model, year);
    }
    public void crvFeature(){
        System.out.println("This feature is only available in CRV");
    }
}
