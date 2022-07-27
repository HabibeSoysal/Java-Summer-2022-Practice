package day31_timeFormatterVarags;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
       System.out.println(" ilk oluşturulan tarihSaat = " + tarihSaat);

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/M/yy hh:mm");
        System.out.println(dtf.format(tarihSaat));//25/7/22 09:48

        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm a");
        System.out.println(dtf2.format(tarihSaat));//25/Tem/2022 21:48


    }

}
