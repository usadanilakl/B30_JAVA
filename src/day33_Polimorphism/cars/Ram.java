package day33_Polimorphism.cars;

public class Ram extends Vehicle implements Truck{
    public Ram(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void drive() {
        System.out.println("Ram drives smooth");
    }

    @Override
    public void slowDown() {
        System.out.println("Ram is unstopable");
    }

    @Override
    public void startEngine() {
        System.out.println("to stop Ram you have to push button");
    }

    @Override
    public void howl() {
        System.out.println("Ram howls cool");
    }

    @Override
    public void bedLoad() {
        System.out.println("Ram bed is awesome");
    }

    @Override
    public void fwd() {
        System.out.println("four wheel drive Rams are very cool");
    }

    public void ramPower(){
        System.out.println("Ram is powered by HEMI engine");
    }
}
