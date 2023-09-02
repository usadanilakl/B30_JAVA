package day29_Enheritance;

import java.time.LocalDate;

public class TestInheritance {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass("ParentVariable");
        Child1 child1 = new Child1("Inherited Variable", 3);
        Child2 child2 = new Child2("Inherited Variable", LocalDate.of(1991,01,17));

        System.out.println(parent);
        System.out.println(child1);
        System.out.println(child2);

        System.out.println("-----------------------------------------------------");

        FieldHiding three = new FieldHiding("Something");
        three.printChild();
        three.printParent();
        ParentClass.str = "This will override the input provided in the static block";
        three.printParent();
    }
}
