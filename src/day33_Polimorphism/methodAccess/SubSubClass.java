package day33_Polimorphism.methodAccess;

public class SubSubClass extends SubClassOne{
    public void three(){
        System.out.println("This is grand child method");
    }

    @Override
    public void two() {
        super.two();
        System.out.println("But this method was overridn by grand child");
    }

    @Override
    public void one() {
        super.one();
        System.out.println("But this method was overridn by grand child");
    }
}
