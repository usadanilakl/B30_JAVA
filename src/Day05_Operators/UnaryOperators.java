package Day05_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int n = +5; // n is positive 5 but it is default value, no need to put +;
        n = -5; //n is negative 5 now. One of the functions of unary operators is to define if number positive or negative;
        n = 0;

        int num = 0;

        System.out.println(n++); // post incriment prints old value and then adds 1 to n;
        System.out.println(++num); // pre incriment add 1 to num and then prints it;

        System.out.println("_________________________________");

        System.out.println(n); // post increment will show here, after the line where it was implemented
        System.out.println(num); // pre increment was alredy displayed in the line where it is implemented;

        System.out.println("--------------------------------------------------");

        System.out.println(n--); // old value is printed
        System.out.println(--num); // new value is printed

        System.out.println("-----------------------------------------------------------");

        System.out.println(n);
        System.out.println(num);

        int e = 5;
        int f = e++*2; // multiplication first then increment

        int b = 5;
        int c = ++b*2; // increment firs then multiplication
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        System.out.println("b = " + b);
        System.out.println("c = " + c);


    }
}
