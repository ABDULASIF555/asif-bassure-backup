
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.HijrahDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bas200190
 */
public class LocalDateDemo {
    public static void main(String[] args) throws Exception {
        LocalDate t = LocalDate.now();
        System.out.println(t);
        LocalDate tplus10 = t.plusDays(10);
        System.out.println(tplus10);
        LocalDateTime ldt1 = t.atStartOfDay();
        System.out.println(ldt1);
        ZonedDateTime zdt1  = t.atStartOfDay(ZoneId.systemDefault());
        System.out.println(zdt1);
        
        HijrahDate hd1 = HijrahDate.now();
        System.out.println(hd1);

         
    }
    public static void main1(String[] args) {
        LocalDate ld1 = LocalDate.now();
        ld1.atTime(12, 55);
    }
}
