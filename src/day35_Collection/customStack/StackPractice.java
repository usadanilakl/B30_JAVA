package day35_Collection.customStack;

public class StackPractice {
    public static void main(String[] args) {
        StackList<String> n = new StackList<>();
        n.push("Danil");
        n.push("Dana");
        n.push("Danil2");
        n.push("Dana2");
        n.push("Danil3");
        n.push("Dana3");
        System.out.println("n = " + n);
        System.out.println("n.getSize() = " + n.getSize());

        int num = n.getSize();
        for(int i = 0; i<num; i++){
            System.out.println(n.pop());
        }


    }
}
