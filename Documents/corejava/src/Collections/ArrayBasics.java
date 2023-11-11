/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

import java.util.Arrays;

/**
 *
 * @author bas200190
 */
public class ArrayBasics {

    public static void main(String[] args) {
        String[] names = {"ibrahimismath","abdulasif", "abdullathif", "aneesrani"};
        System.out.println("Before Sorting");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("");
        ComparatorDemo cd = new ComparatorDemo();
        Arrays.sort(names, cd);
        System.out.println("After Sorting");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
