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
public class ComparatorDemo implements Comparator {
    @Override
    public int compare(Object o1 , Object o2){
        String s1 = (String)o1;
        String s2 = (String)o2;
        int result_of_compareto = s1.compareTo(s2);
        if (result_of_compareto>0) {
            return +1;
        }
        else if (result_of_compareto<0) {
            return -1;
        }
        else return 0;

//        if (s1.length()>s2.length()) {
//            return -1;
//        }else if (s2.length()>s1.length()) {
//            return +1;
//        }else   return 0;
    }
}
