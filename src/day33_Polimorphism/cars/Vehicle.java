package day33_Polimorphism.cars;

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Vehicle(String make, String model, int year) {
        setMake(make);
        setModel(model);
        setYear(year);
    }

    public abstract void startEngine();
    public abstract void drive();
    public abstract void slowDown();
    public  void stop(){
        System.out.println("push break");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                "}\n";
    }
}
