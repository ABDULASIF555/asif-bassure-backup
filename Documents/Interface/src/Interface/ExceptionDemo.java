/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author bas200190
 */
public class ExceptionDemo {

    
    
    public static void main(String[] args) {
        System.out.println("main() START");
        a();
        System.out.println("main() END");
    }

    public static void a() {
        System.out.println("a() START");
        b();
        System.out.println("a() END");
    }

    public static void b() {
        System.out.println("b() START");
        c();
        System.out.println("b() END");
    }

    public static void c() {
        System.out.println("c() START");
        try{
        int i = Integer.parseInt("23e");
        }catch (NumberFormatException nfe){
            System.out.println("Exception Raised");
        }
        //System.out.println(i + 10);
        System.out.println("c() END");
    }
}
