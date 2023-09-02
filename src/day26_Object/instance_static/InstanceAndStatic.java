package day26_Object.instance_static;

public class InstanceAndStatic {
    public String instanceVariable; // Created when object is created
    {
        instanceVariable = "Hello, I am instance variable"; // this bloc runs first every time an object is created
    }
    public static String staticVariable; // static is created once class is called (for creating object or to just call a static member of the class)
    static {
        staticVariable = "Hello, I am static variable"; // static block to initialize static variables
    }

    public InstanceAndStatic(){}
    public InstanceAndStatic(String i){ // constructor runs after initiating block and overwrites it.
        instanceVariable = i;
    }

    public void instanceMethod(){
        System.out.println("Hello, I am instance method");
        System.out.println("I have acess to static members: \n" + staticVariable + "\n"+staticMethod());
    }
    public static String staticMethod(){
        System.out.println("Hello, I am static method");
        System.out.println("I have no access to instance members");
        String s = "Static method used in instance method";
        return s;
    }
}
