package day33_Polimorphism.cars;

public class Silverado extends Chevy implements Electric{
    public Silverado(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void charge() {
        System.out.println("Silverado electric is easy to charge at home");
    }

    public void silveradoFeature(){
        System.out.println("This is Silverado Feature");
    }
}
