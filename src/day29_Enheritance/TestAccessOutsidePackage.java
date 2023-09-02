package day29_Enheritance;

import day28_Encapsulation.AcessModifiers;

public class TestAccessOutsidePackage extends AcessModifiers{
    public static void main(String[] args) {
        AcessModifiers one = new AcessModifiers();
        one.everywhereInProject = 1; // public
       // one.inPackageOnly = 2; //default - not accessible outside package
        // one.inPacageAndInherited = 3; - protected variable is not accessible through AccessModifier object
        TestAccessOutsidePackage two = new TestAccessOutsidePackage();
        two.inPacageAndinherited = 3; // protected variable is accessible through child object.

        two.setInClassOnly(4); // private and default are accessible only through getter and setter
        two.getInClassOnly();
    }


}
