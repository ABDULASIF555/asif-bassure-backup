/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

import java.util.Comparator;

/**
 *
 * @author bas200190
 */
public class LaptopComparatorDemo implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Laptop l1 = (Laptop)o1;
        Laptop l2 = (Laptop)o2;
        if (l1.price>l2.price) {
            return +1;
        }
        else if(l2.price>l1.price){
            return -1;
        }
        else
            return 0;
    }
    
}
