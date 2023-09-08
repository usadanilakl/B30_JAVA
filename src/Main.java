import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Integer> getSum (ArrayList<String> digits){

        ArrayList<Integer> r = new ArrayList<>();
        digits.stream().forEach(
                (c)->{
                    Integer res = 0;
                    for(int i = 0; i < c.length(); i++){
                        res += Integer.valueOf(c.charAt(i));
                        System.out.println(Integer.valueOf(c.charAt(i)));
                    }
                    r.add(res);
                }
        );
        return r;




    }
    public static void main(String[] args) {
        System.out.println(getSum(new ArrayList<>(Arrays.asList("123", "321", "456", "654"))));

        System.out.println("Hello world!");

    }
}