package day33_Polimorphism;

import day33_Polimorphism.methodAccess.SubClassOne;
import day33_Polimorphism.methodAccess.SubSubClass;
import day33_Polimorphism.methodAccess.SuperCalss;

public class MethodAccess {
    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass();
        obj.one(); obj.two(); obj.three(); // obj with SubSubClass reference type has access to all inherited and unique methods.
        System.out.println();

        SubClassOne obj2 = new SubSubClass();
        obj2.one(); obj2.two(); //obj 2 does not have access to method that is unique to grand child class
        System.out.println();

        SuperCalss obj3 = new SubSubClass();
        obj3.one(); //obj3 has access to only mehtod that SuperClass contains (but implementation will come from grand child class)
        System.out.println();

        //to gain access to unique methods of grand child class for obj3 downcasting must be used
        ((SubSubClass)obj3).three();
    }
}
