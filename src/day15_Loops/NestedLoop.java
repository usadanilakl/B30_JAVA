package day15_Loops;

public class NestedLoop {
    public static void main(String[] args) {
        String s = "Hello my name is Danil";
        String r = "";
        int n = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                n++;
            }
        }
        for (int i = 0; i < n; i++) {

            String temp = s.substring(0, s.indexOf(" "));
            s = s.replace(temp + " ", "");
            String temp2 = "";
            for (int j = temp.length() - 1; j > -1; j--) {
                temp2 += temp.charAt(j);
            }
            r += temp2 + " ";
        }

        for(int i = s.length()-1; i>-1; i--){
            r+=s.charAt(i);
        }
        System.out.println(r);
    }
}
