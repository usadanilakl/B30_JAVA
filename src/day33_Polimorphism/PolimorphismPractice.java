package day33_Polimorphism;

import day29_Enheritance.Child1;
import day29_Enheritance.Child2;
import day29_Enheritance.ParentClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class PolimorphismPractice {
    public static void main(String[] args) {
        //Use polimorphism to store different object types in one array
        ParentClass parentClass = new ParentClass("Parent Variable");
        Child1 child1 = new Child1("Child Variable", 17);
        Child2 child2 = new Child2("Child2 Variable", LocalDate.of(1991,1,17));

        ArrayList<ParentClass> list = new ArrayList<>(Arrays.asList(parentClass, child1, child2));
        System.out.println(list);
    }
}
