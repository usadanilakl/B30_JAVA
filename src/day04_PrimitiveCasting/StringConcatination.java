package day04_PrimitiveCasting;

public class StringConcatination {

    public static void main(String[] args) {
        // String must be involved for concatenation

        String name = "Dail";
        int age = 32;
        int salary = 200_000;
        System.out.println("Hello " + name + "!");
        System.out.println("You are "+age+" years old.");
        System.out.println("salary = " + salary);

        System.out.println(age+salary); // will return addition, not concatenation: 200032
        System.out.println(age + " " +salary); // will return concatenation: 32 200000


    }
}
