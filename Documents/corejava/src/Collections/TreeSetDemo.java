/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

import java.util.TreeSet;

/**
 *
 * @author bas200190
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts1 = new TreeSet(new TreeSetComparatorDemo());
        Laptop l1 = new Laptop("lenovo",45000, 8);
        Laptop l2 = new Laptop("hp",100000, 6);
        Laptop l3 = new Laptop("mac book",90000,12);
        ts1.add(l1);
        ts1.add(l2);
        ts1.add(l3);
        System.out.println(ts1);
    }
}
