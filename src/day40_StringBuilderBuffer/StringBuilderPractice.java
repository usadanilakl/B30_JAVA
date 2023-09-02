package day40_StringBuilderBuffer;

public class StringBuilderPractice {
    public static void main(String[] args) {

        String str = "Hello"; // Strings are immutable objects
        str.concat(" World"); // new string is created
        System.out.println("str = " + str);

        StringBuilder strBuild = new StringBuilder("Hello"); // string builder are mutable objects
        strBuild.append(" World"); // original string is modified here
        System.out.println("strBuild = " + strBuild);

        StringBuilder strBuild2 = new StringBuilder(strBuild);

        StringBuffer strBuff = new StringBuffer("Hello"); // same as string builder but synchronized
        strBuff.append(" World");
        System.out.println("strBuff = " + strBuff);

        //String builder/buffer methods:

        strBuild.appendCodePoint(67); // adds letter from ASCII table
        System.out.println("strBuild = " + strBuild);
        System.out.println("strBuild.compareTo(strBuild2) = " + strBuild.compareTo(strBuild2));
        strBuild.delete(strBuild.length()-1, strBuild.length());
        System.out.println("strBuild = " + strBuild);
        strBuild.insert(0, " ");
        System.out.println("strBuild = " + strBuild);
        strBuild.replace(strBuild.indexOf("World"), strBuild.length(), "Cydeo");
        System.out.println("strBuild = " + strBuild);
        strBuild.replace(0,strBuild.length(),strBuild.toString().trim());
        System.out.println("strBuild = " + strBuild);
        System.out.println(strBuild.reverse());
        System.out.println(strBuild.reverse());

        System.out.println(new StringBuilder(str).reverse());
    }
}
