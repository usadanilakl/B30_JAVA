package day33_Polimorphism.methodAccess;

public class SubClassOne extends SuperCalss {
    public void two(){
        System.out.println("This is child method");
    }

    @Override
    public void one() {
        super.one();
        System.out.println("But this method was overriden by child");
    }
}
