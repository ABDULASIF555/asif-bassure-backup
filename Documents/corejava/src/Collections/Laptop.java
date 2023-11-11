/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

/**
 *
 * @author bas200190
 */
public class Laptop {
    String model;
    int price;
    int ram;
    Laptop(String model,int price,int ram){
        this.model = model;
        this.price = price;
        this.ram = ram;
    }
    @Override
    public String toString() {
        return  '{' + "model=" + model + ", price=" + price + ", ram=" + ram + '}';
    }
}
