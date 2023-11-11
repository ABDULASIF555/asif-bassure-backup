/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

import java.util.ArrayList;
import java.util.Collections;



/**
 *
 * @author bas200190
 */
public class CompareUsage {
    public static void main(String[] args) {
        Laptop dell = new Laptop("insprion",150000,8);
        Laptop hp = new Laptop("elite book",70000,4);
        Laptop lenovo = new Laptop("thinkpad",90000,6);
        Laptop mac_book = new Laptop("mac pro",120000,12);
        ArrayList al = new ArrayList();
        al.add(dell);
        al.add(hp);
        al.add(lenovo);
        al.add(mac_book);
        LaptopComparatorDemo lcd = new LaptopComparatorDemo();
        System.out.println(al);
        Collections.sort(al, lcd);
        System.out.println(al);
    }
}
