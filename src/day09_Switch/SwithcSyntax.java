package day09_Switch;

public class SwithcSyntax {
    public static void main(String[] args) {
        int x = 5, y = 15;

        switch(x){
            case 1:
                y = 20;
                break;
            case 3:
                y = 25;
                break;
            case 5:
                y = 30;
                break;
            default:
                y = 0;
        }
        System.out.println(y);
        System.out.println("-------------------");

        switch(++x){
            case 1:
                y = 20;
                x++;
                break;
            case 3:
                y = 25;
                break;
            case 5:
                x++;
                y = 30;
                break;
            default:
                y = 0;
        }
        System.out.println(y);
        System.out.println("-------------------");

    }
}
