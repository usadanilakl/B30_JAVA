package day39_FunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicatePractice {
    public static String cutString(String inp, BiPredicate<String,Integer> p){
       String arr[] = inp.split(" ");
       String res = "";
        for(int i = 0; i<arr.length; i++){
            if(p.test(arr[i], arr[0].length())){
                res += arr[i].substring(0,arr[0].length()) + " ";
            }else{
                res += arr[i] + " ";
            }
        }
        return res.trim();
    }

    public static void main(String[] args) {
        String str = "My name is Danil. I want to learn Java, JavaScript and much more to become an awesome developer!";
        System.out.println(cutString(str, (s, n) -> s.length() > n));
    }
}
