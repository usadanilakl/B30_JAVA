package day31_Final;

public class ParentWithFinal {
    public final String name;
    public ParentWithFinal(String name){
        if(name.contains("D")){
            this.name = name;
        } else {
            this.name = "No name";
        }
    }

    public final int square(int n){
        return n*n*n;
    }
}
