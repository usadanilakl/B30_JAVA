package day99_Extras;

import java.util.LinkedHashMap;
import java.util.Map;

public class Recursion {
    public static int factorial(int n){
        if(n==0)return 1;
        else return n*factorial(n-1);
    }

    public static String reverse(String str){
        if(str.length()==1) return str;
        else return reverse(str.substring(1)) + str.charAt(0);
    }

    public static Map<String,Integer> countLetters(String word, Map<String,Integer> res){
        if(word.length()==1){
            if(res.containsKey(word)) res.put(word,res.get(word)+1);
            else res.put(word, 1);
            return res;
        }else{
            if(res.containsKey(word.substring(0,1))) res.put(word.substring(0,1),res.get(word.substring(0,1))+1);
            else res.put(word.substring(0,1), 1);
            return countLetters(word.substring(1), res);
        }

    }

    public static void main(String[] args) {
        System.out.println("factorial(3) = " + factorial(3));
        System.out.println("reverse(\"Hello\") = " + reverse("Hello"));

        // reverse(Hello) -> reverse(ello)+H -> reverse(llo)+e -> reverse(lo)+l - reverse(o)+l -> o

        //factorial(3)->3*factorial(2)->2*factorial(1)->1*2*3=6;

        System.out.println(countLetters("Hello", new LinkedHashMap<>()));
    }


}
