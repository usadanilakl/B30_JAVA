package day26_Object.instance_static;

public class StaticInstanceTest {
    public static void main(String[] args) {
        InstanceAndStatic.staticMethod();
        System.out.println(InstanceAndStatic.staticVariable);
        System.out.println();
        InstanceAndStatic.staticVariable = "I am still static";
        System.out.println(InstanceAndStatic.staticVariable);

        System.out.println("--------------------------------------------");

        InstanceAndStatic one = new InstanceAndStatic();
        System.out.println(one.instanceVariable);
        System.out.println();
        one.instanceMethod();


    }
}
