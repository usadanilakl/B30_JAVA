package day42_Enum;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("No param: "+Days.WEDNESDAY);
        System.out.println("DaysParam.MONDAY = " + DaysParam.MONDAY);
        System.out.println("DaysParam.MONDAY.day() = " + DaysParam.MONDAY.day());
        System.out.println("DaysParam.MONDAY.d() = " + DaysParam.MONDAY.d());
    }
}
