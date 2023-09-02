package day29_Enheritance;

import java.util.Scanner;

public class ParentClass {
    private String parentVariable;

    public void setPrivateVariable(String privateVariable) {
        this.parentVariable = privateVariable;
    }

    public static String str;

    static{
        System.out.println("Static block is executed once when this class is accessed for the first time since we used Scanner provide some input. This input will be assigned to str variable");
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
    }

    public String getPrivateVariable(){
        return parentVariable;

    }
    public ParentClass(String parentVariable){
        setPrivateVariable(parentVariable);
    }

    public String toString(){
        return getClass().getSimpleName() + ": " + parentVariable + "\n";
    }
}
