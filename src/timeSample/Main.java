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

    private static void sample3(){

        LocalDate lastDate = LocalDate.ofYearDay(2023,100);
        System.out.println(lastDate); //2023년 1월 1일로부터 100일 후

        LocalTime lastTime = LocalTime.ofSecondOfDay(80000);
        System.out.println(lastTime); // 00:00 로부터 8만초가 지난 시간

    }

    public static void main(String[] args) {

        //Main.sample1();
        //Main.sample2();
        Main.sample3();
    }
}
