package day31_Final;

public final class FinalClass extends ParentWithFinal{ // this class can not be extended because it is final
    public FinalClass(String name){
        super(name);
    }
    public String finalString;
    public static int num = 100;
}
