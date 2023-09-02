package day33_Polimorphism.cars;

public class Hyundai extends Vehicle implements Car{
    public Hyundai(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void saveGas() {
        System.out.println(getClass().getSimpleName() + " is very fuel efficient");
    }

    @Override
    public void easyPark() {
        System.out.println("cars are very easy to park in tight spots");
    }

    @Override
    public void startEngine() {
        System.out.println("Hyundai are started with a key or push button");
    }

    @Override
    public void drive() {
        System.out.println("Hyundai are very nice cars to drive");
    }

    @Override
    public void slowDown() {
        System.out.println("Hyundai are light so it is easy to slow down");
    }

    public void hyundaiStyle(){
        System.out.println("This feature is only available with Hyundai");
    }
}
