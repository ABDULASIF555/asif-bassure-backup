package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo extends ArrayList{
    public static void main2(String[] args){  //instance array to list and list to instance array , we cannot use with primitive type array
        
        Integer[] arr={3,5,2,6,12};
        
        List<Integer> ls=Arrays.asList(arr);
        System.out.println(ls);
        
        Integer[] arr1=ls.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr1));
        
        
        
    }
    
    
    public static void main1(String[] args) {
        ArrayListDemo ld=new ArrayListDemo();
        ld.add(12);
        ld.add(20);
        ld.add(400);
        ld.add(35);
        ld.add(67);
        ld.add(62);
        ld.add(27);
        System.out.println(ld);
        ld.removeRange(2, 4);
        System.out.println(ld);
        
    }
    
        
    
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();      //constructor 1
        al1.add(10);
        al1.add(20);
        al1.add("thirty");
        al1.add('f');
        al1.add(true);
        al1.add(2, 30);
        System.out.println("al1 size : " + al1.size());
        System.out.println(al1);

        ArrayList al2 = new ArrayList(al1);    //constructor 2
        System.out.println("al2 size : " + al2.size());
        System.out.println(al2);

        ArrayList al3 = new ArrayList(30);
        al3.addAll(al2);
        System.out.println("al3 size : " + al3.size());
        System.out.println(al3);

        ArrayList al4 = new ArrayList();
        al4.add(100);
        al4.add(200);
        al4.add(300);
        al4.addAll(1, al3);
        System.out.println("al4 : " + al4);
        al4.clear();
        System.out.println("al4 : " + al4);
        System.out.println("al4 is empty : " + al4.isEmpty());

        ArrayList al5 = new ArrayList((Collection) al1.clone());
        System.out.println("al5 : " + al5);

        ArrayList al6 = new ArrayList(al5);
        al6.add("asif");
        System.out.println("if al6 contains object 20 : " + al6.contains(20));
        System.out.println("if al6 contains object 40 : " + al6.contains(40));
        System.out.println("get 4th index element int al6 : " + al6.get(4));
        System.out.println("indexof element 30 in al6: " + al6.indexOf(30));
        System.out.println("al6 is empty : " + al6.isEmpty());
        System.out.println("al6 : " + al6);

        ArrayList<Integer> al7 = new ArrayList();
        al7.add(1000);
        al7.add(2000);
        al7.add(3000);
        al7.add(4000);
        al7.add(5000);
        al7.add(2000);
        al7.add(7000);
        
        al7.forEach(System.out::println);
        
        System.out.println("al7 : " + al7);
        Iterator it = al7.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("last index of element 2000 : " + al7.lastIndexOf(2000));

        ArrayList al8 = new ArrayList(al7);     //after object creation that added object will not reflect here
        al7.add(8000);
        System.out.println("al7 : " + al7);
        System.out.println("al8 : " + al8);

        System.out.println(al8.remove(2));
        System.out.println("al8 : "+al8);
        
        System.out.println(al8.remove(Integer.valueOf(4000)));
        System.out.println("al8 : "+al8);
        
        al8.add(21000);
        System.out.println(al8.removeAll(al7));
        System.out.println("al8 : "+al8);
        
        ArrayList al9 = new ArrayList(al2);
        al9.add(21);
        al9.add(22);
        al9.add(23);
        System.out.println("al9 retain all with al1 : "+al9.retainAll(al1));
        System.out.println("al9 : "+al9);
        
        al9.set(0,40);
        al9.set(2,50);
        al9.set(4,60);
        System.out.println("al9 : "+al9);
        System.out.println("al9 size : "+al9.size());
        
     
        ArrayList<Integer> al10  =new ArrayList();
        al10.add(60);
        al10.add(20);
        al10.add(30);
        al10.add(10);
        al10.add(50);
        al10.add(40);
        System.out.println("al10 "+al10);
        al10.sort((o1,o2)-> o1-o2);
        System.out.println(al10);
        
        Collections.sort(al10, (o1,o2)-> o2-o1);
        System.out.println(al10);
        
        ArrayList a11 = new ArrayList(al10.subList(0, 3));
        System.out.println("a11 : "+a11 );
        System.out.println("a11 : "+a11.size());
        a11.trimToSize();
        System.out.println("a11 : "+a11.size());
    }
}
