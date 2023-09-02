package day33_Polimorphism.cars;

public class Civic extends Honda implements Electric{
    public Civic(String make, String model, int year) {
        super(make, model, year);
    }
    public void civicFeature(){
        System.out.println("this feature is only available in Civics");
    }

    @Override
    public void charge() {
        System.out.println("Civics are fast to charge");
    }
}
