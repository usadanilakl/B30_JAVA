package day09_Switch;

public class OR_logic_inSwitch {
    public static void main(String[] args) {
        int x = 4, y = 15;

        switch(x){
            case 1:
            case 3:
            case 4:
            case 5:
                y = 100;
                break;
            default:
                y = 0;
        }

        System.out.println(y);

    }
}
