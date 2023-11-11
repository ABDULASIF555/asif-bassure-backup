/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functional_programming;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author bas200190
 */
public class Demo {
    public static void main(String[] args) {
        List<Integer> lists = new LinkedList<>();
        lists.add(20);
        lists.add(12);
        lists.add(20);
        lists.add(9);
        lists.add(100);
        lists.add(43);
        
        int sum = 0;
        for(int i = 0;i<lists.size();i++){
            sum = sum + lists.get(i);
        }
        System.out.println(sum);
    }
}
