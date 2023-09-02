package day30_MethodOverriding;

public class TestOverriding {
    public static void main(String[] args) {
        OriginalMethod original = new OriginalMethod("I am the original");
        OverrideParentMethod overriden = new OverrideParentMethod("I am the child");

        original.originalMethod(5);
        System.out.println("-------------------------------");
        overriden.originalMethod(5);

        System.out.println("--------------------------------");

        original.setPrivateVariable("Hello");
        overriden.setPrivateVariable("Hello 2");

        System.out.println(original.getPrivateVariable());
        System.out.println(overriden.getPrivateVariable());
    }
}
