package day29_Enheritance;

public class FieldHiding extends ParentClass {
    FieldHiding(String s){
        super(s);
    }
    public static String str = "Child String"; // child has variable with the same name

    public void printParent(){
        System.out.println(super.str); // to access parent variable with the same name use word super
    }

    public void printChild(){
        System.out.println(str); // without "super" the closest variable is going to be used (in the class)
    }
}
