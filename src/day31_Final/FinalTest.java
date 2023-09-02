package day31_Final;

public class FinalTest {
    public static void main(String[] args) {
        ParentWithFinal parent = new ParentWithFinal("Danil");
        FinalChild child = new FinalChild("Vasya");
        FinalClass finalClass = new FinalClass("Dee");

        //child.name = "Dan"; // not allowed
        //parent.name = "Hello"; // not allowed

        System.out.println(parent.square(33));
        System.out.println(child.square(FinalChild.n));

        System.out.println(parent.name);
        System.out.println(child.name);

        System.out.println("---------------------------");

        finalClass.finalString = "This is instance variable from final class but the variable is not necessarily final";
        System.out.println(finalClass.finalString);
        System.out.println("----------------------------------------");
        FinalClass.num = 500;
        System.out.println("This is static variable from the final class that is not final: "+FinalClass.num);


    }
}
