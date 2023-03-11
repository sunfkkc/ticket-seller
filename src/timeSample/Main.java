package timeSample;

import java.time.*;
import java.time.temporal.*;

class After2WeaksMonday implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {

        //2주 후 월요일을 계산
        Temporal temporal1 = temporal.plus(7, ChronoUnit.DAYS);
        return temporal1.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
    }
}

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

    private static void sample7(){

        LocalDate date = LocalDate.of(2023, 3, 10);
        LocalDate date1 = LocalDate.of(2023, 4, 10);

        System.out.println(date.isAfter(date1));
        System.out.println(date.isBefore(date1));
        System.out.println(date.isEqual(date1));
    }

    private static void sample8(){

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate date1 = date.with(ChronoField.YEAR, 2024);
        System.out.println(date1);

        LocalDate date2 = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(date2);

        LocalDate date3 = date.with(new After2WeaksMonday());
        System.out.println(date3);

    }

    private static void sample9(){

        LocalTime time = LocalTime.of(0, 0, 30);
        LocalTime time1 = LocalTime.of(23, 30, 25);

        Duration duration = Duration.between(time,time1);
        System.out.println(duration);

        LocalTime time2 = LocalTime.of(0, 0).plusSeconds(duration.getSeconds());
        System.out.println(time2.getMinute());
    }



    public static void main(String[] args) {

        //Main.sample1();
        //Main.sample2();
        //Main.sample3();
        //Main.sample4();
        //Main.sample5();
        //Main.sample6();
        //Main.sample7();
        //Main.sample8();
        Main.sample9();
    }
}
