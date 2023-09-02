package day28_Encapsulation;

public class TestAcessModifiers {
    public static void main(String[] args) {
        AcessModifiers one = new AcessModifiers();
        one.everywhereInProject = 1; //public
        one.inPackageOnly = 2; //default
        one.inPacageAndinherited = 3; //protected
        //one.inClassOnly; // private - not accesable
        one.setInClassOnly(4); // to acess private variables from other packages use setters and getters with public acess modifiers.

    }
}
