package day25_DateAndTime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingDateTime {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalTime nowT = LocalTime.now();
        LocalDateTime nowDT = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM,dd,y  eeee");
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("hh:mm a");
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("MM,dd,y  eeee | HH:mm");
        System.out.println(df.format(now));
        System.out.println(df2.format(nowT));
        System.out.println(df3.format(nowDT));
    }
}
