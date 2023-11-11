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
public class TreeSetComparatorDemo implements Comparator {

    @Override
    public int compare(Object t, Object t1) {
        Laptop l1 = (Laptop)t;
        Laptop l2 = (Laptop)t1;
        int ans = l1.model.compareTo(l2.model);
        if (ans>0) {
            return -1;
        }
        else if (ans<0) {
            return 1;
        }
        return 0;
    }
    
}
