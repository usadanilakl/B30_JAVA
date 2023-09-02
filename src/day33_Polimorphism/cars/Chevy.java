package day33_Polimorphism.cars;

public class Chevy extends Vehicle implements Truck{
    public Chevy(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void howl() {
        System.out.println("Chevy truck can howl a lot");
    }

    @Override
    public void bedLoad() {
        System.out.println("Chevy trucks have spacious bed");
    }

    @Override
    public void fwd() {
        System.out.println("Four wheel drive is very handy");
    }

    @Override
    public void startEngine() {
        System.out.println("Chevy rumbles");
    }

    @Override
    public void drive() {
        System.out.println("Chevy drives");
    }

    @Override
    public void slowDown() {
        System.out.println("Chevy are heavy");
    }
}
