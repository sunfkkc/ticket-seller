package timeSample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

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

    private static void sample4(){

        LocalDate localDate = LocalDate.parse("1998-07-05");
        System.out.println(localDate);

        LocalTime localTime = LocalTime.parse("13:55");
        System.out.println(localTime);
    }

    private static void sample5(){

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate changedDate = localDate.withMonth(4);
        System.out.println(changedDate);

        LocalDate date = localDate.withDayOfMonth(30);
        System.out.println(date);

        LocalDate date1 = localDate.withDayOfYear(364);
        System.out.println(date1);
    }

    private static void sample6(){

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime time1 = time.truncatedTo(ChronoUnit.MINUTES);
        System.out.println(time1);

        LocalTime time2 = time.truncatedTo(ChronoUnit.HOURS);
        System.out.println(time2);

    }



    public static void main(String[] args) {

        //Main.sample1();
        //Main.sample2();
        //Main.sample3();
        //Main.sample4();
        //Main.sample5();
        Main.sample6();
    }
}
