package timeSample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    private static void sample1(){

        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);
    }

    private static void sample2(){

        LocalTime localTime = LocalTime.of(14,30);
        LocalDate localDate = LocalDate.of(2023,11,30);
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);

        System.out.println(localDate);
        System.out.println(localDateTime);
    }

    public static void main(String[] args) {

        //Main.sample1();
        Main.sample2();
    }
}
