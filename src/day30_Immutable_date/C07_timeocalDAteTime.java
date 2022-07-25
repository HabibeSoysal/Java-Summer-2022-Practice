package day30_Immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_timeocalDAteTime {
    public static void main(String[] args) {
        // iki tarih arasindaki sureyi bulma
        LocalDate tarih1=LocalDate.of(1972,1,18);
        LocalDate bugun=LocalDate.now();
        Period period=Period.between(tarih1,bugun);
        System.out.println(period); // P-50Y-6M-5D
        System.out.println(period.getYears());
    }
}
