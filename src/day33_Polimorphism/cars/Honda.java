package day33_Polimorphism.cars;

public class Honda extends Vehicle implements Car{
    public Honda(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Honda has pus button start");
    }

    @Override
    public void drive() {
        System.out.println("Honda drives");
    }

    @Override
    public void slowDown() {
        System.out.println("Honda is fast");
    }

    public void sportMode(){
        System.out.println("You can't catch Honda");
    }

    @Override
    public void saveGas() {
        System.out.println(getClass().getSimpleName()+" are very efficient");
    }

    @Override
    public void easyPark() {
        System.out.println("Small cars are easy to park");
    }

    public void hondaStyle(){
        System.out.println("This feature is only available with honda");
    }
}
