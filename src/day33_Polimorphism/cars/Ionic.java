package day33_Polimorphism.cars;

public class Ionic extends Hyundai implements Electric{
    public Ionic(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void charge() {
        System.out.println("Ionic cna be charged everywhere");
    }
    public void ionicFeature(){
        System.out.println("This is Ionic Feature");
    }
}
