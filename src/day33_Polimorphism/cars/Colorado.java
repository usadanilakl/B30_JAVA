package day33_Polimorphism.cars;

public class Colorado extends Chevy {
    public Colorado(String make, String model, int year) {
        super(make, model, year);
    }
    public void coloradoFeature(){
        System.out.println("This Feature is only available in Colorados");
    }
}
