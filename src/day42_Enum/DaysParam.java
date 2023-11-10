package day42_Enum;

public enum DaysParam {


    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday",3 ),
    THURSDAY("Thursday", 4),
    FRIDAY ("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);
    private final String nameOfDay;
    private final int numOfDay;
    DaysParam(String nameOfDay, int numOfDay){
       this.nameOfDay = nameOfDay;
       this.numOfDay = numOfDay;
   }
   public String day(){
        return nameOfDay;
   }
   public int d(){
        return numOfDay;
   }
}
