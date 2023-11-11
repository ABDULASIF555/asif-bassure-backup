/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author bas200190
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs1 = new HashSet();
        System.out.println("hs1 add element 10 : "+hs1.add(10));
        hs1.add(20);
        hs1.add(30);
        hs1.add(40);
        hs1.add(50);
        hs1.add(60);
        System.out.println("hs1 add element 60 again : "+hs1.add(60));
        System.out.println("hs1 : "+hs1);
        hs1.clear();
        System.out.println("hs1 : "+hs1);
        
        
        HashSet hs2 = new HashSet();
        hs2.add(100);
        hs2.add(200);
        hs2.add(300);
        hs2.add(400);
        System.out.println("hs2 clone : "+hs2.clone());   //wherever we can use this object
        
        System.out.println("in hs2 300 contains or not : "+hs2.contains(2000));
        
        System.out.println("hs2 is empty or not : "+hs2.isEmpty());
        
        System.out.println("in hs2 remove element 300 : "+hs2.remove(300));
        
        System.out.println("size of hs2 : "+hs2.size());
        
        System.out.println("hs2 :"+hs2);
        
        Iterator it = hs2.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        it.remove();
        System.out.println("hs2 : "+hs2);
        
        
        
        HashSet hs3 = new HashSet();
        hs3.add(1000);
        hs3.add(2000);
        hs3.add(3000);
        hs3.add(4000);
        hs3.add(5000);
        hs3.add(5000);
        System.out.println("hs3 : "+hs3);
        
        LinkedHashSet lhs1 = new LinkedHashSet();
        lhs1.add(1000);
        lhs1.add(2000);
        lhs1.add(3000);
        lhs1.add(4000);
        lhs1.add(5000);
        lhs1.add(5000);
        System.out.println("lhs1 : "+lhs1);
        
        
    }
}
