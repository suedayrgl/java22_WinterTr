package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat); //2022-03-31T22:35:32.317150

        System.out.println( tarihSaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5));


    }
}
