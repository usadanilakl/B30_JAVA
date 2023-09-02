package day32_Interface;

public interface Dev {
    String dev = "Developers are smart and you can't change it"; // interface makes all variables static and final
    static void dev(){ //interface can have static methods
        System.out.println(dev);
    }

    default void printSomething(){
        System.out.println("Developers develop");
    }

    public void devType();



}
