package day03_variables;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        //Integer variables:
        byte smallestNum = 127; //byte can not be greater than 127
        short secondSmallest = 32767; //short can not be greater than 32767
        int preferredNum = 2_147_483_647; //it is a prefered integer variable
        long biggestNum = 9_223_372_036_854_775_807L;//do not forget to put l at the end of long integer

        //decimal point variables:
        float smallestDecimall = 2.123415F;//do not forget to put F at the end of float
        double preferredDecimall = 2.1234153;

        char letter = 'a';//returns one symbol only
        int letterIndex = 'a'; //returns letters index in the ASCII table
        int sum = 'a'+'C'; //returns sum of indexes

        System.out.println("sum = " + sum);

        //boolean variables return true or false
        boolean one = true; //returns true
        boolean two = false; //returns false
        boolean num = 5 > 3; //returns true
        boolean num2 = 5 < 3; // returns false

    }
}
