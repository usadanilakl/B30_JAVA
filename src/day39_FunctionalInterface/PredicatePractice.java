package day39_FunctionalInterface;

import java.util.function.Predicate;

public class PredicatePractice {
    public static String removeWords(String object, Predicate<String> p){
        String[] arr = object.split(" ");
        for(int i = 0; i < arr.length; i++){
            if(p.test(arr[i])){
                arr[i]="";
            }
        }
        String res = "";
        for(String e : arr){
            res += e + " ";
        }
        return res;
    }

    public static String removeWords(String object, Predicate<String> p, Predicate<String> pr){
        String[] arr = object.split(" ");
        for(int i = 0; i < arr.length; i++){
            if(p.test(arr[i]) && pr.test(arr[i])){
                arr[i]="";
            }
        }
        String res = "";
        for(String e : arr){
            res += e + " ";
        }
        return res;
    }

    public static void main(String[] args) {
        Predicate<String> myPred = p -> p.contains("e");
        Predicate<String> myPred2 = pr -> pr.contains("o");
        String sentence = "Hello, I am learning java and I love it. Java is awesome.";

        System.out.println(removeWords(sentence, p -> p.toLowerCase().equals("java")));

        System.out.println(removeWords(sentence, myPred));

        System.out.println(removeWords(sentence, p->p.startsWith("a"), pr->pr.endsWith("m")));

        System.out.println(removeWords(sentence, myPred.and(myPred2)));


    }
}
