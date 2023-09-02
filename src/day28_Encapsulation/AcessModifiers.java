package day28_Encapsulation;

public class AcessModifiers {
    private int inClassOnly;
    int inPackageOnly; // default
    protected int inPacageAndinherited;
    public int everywhereInProject;

    public void setInClassOnly(int inClassOnly) { // to provide access from outside the class
        this.inClassOnly = inClassOnly;
    }

    public int getInClassOnly() { // to provide access from outside the class
        return inClassOnly;
    }


}
