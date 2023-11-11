/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;
import java.util.Date;
/**
 *
 * @author bas200190
 */
public class DateClassDemo {
    public static void main(String[] args) {
        Date d1 = new Date();
        
        long epo1 = Date.UTC(2000-1900, 10, 25, 18, 29, 58);
        System.out.println("epo1 : "+epo1);
    }
}
