package day29_Enheritance;

public class Child1 extends ParentClass{
    private int childVariable;
    public Child1(String parentVariable, int childVariable){
        super(parentVariable);
        this.childVariable = childVariable;

    }

    public String toString(){
        return super.toString() + " New Variable exclusive to Child 1 - " + childVariable + "\n";
    }
}

