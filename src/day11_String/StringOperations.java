package day11_String;

import org.w3c.dom.ls.LSOutput;

public class StringOperations {
    public static void main(String[] args) {
        String one = "My name is Danil. I want to learn Java";
        // returns String:
        System.out.println(one.substring(one.indexOf("Danil")));
        System.out.println(one.replace("Java","it all"));
        String myName = one.substring(one.indexOf("Danil"), one.indexOf("Danil")+"Danil".length());
        System.out.println(myName);

        System.out.println(one.toLowerCase().substring(0, one.indexOf("Danil")) + myName + one.toLowerCase().substring(one.indexOf("Danil") + "Danil".length()));

        String space = "   a   b   ";
        System.out.println(space.trim());

        //returns int:
        System.out.println(one.indexOf("Danil") );
        System.out.println(one.lastIndexOf("Java"));

        //returns boolean
        System.out.println(one.contains("Danil"));
        System.out.println(one.isEmpty());
        System.out.println(one.isBlank());
        System.out.println(myName.equals("Danil"));
        System.out.println(myName.startsWith("D"));

    }



}
