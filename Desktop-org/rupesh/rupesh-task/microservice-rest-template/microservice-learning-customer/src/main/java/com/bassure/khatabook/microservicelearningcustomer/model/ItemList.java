/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.khatabook.microservicelearningcustomer.model;



/**
 *
 * @author bas200190
 */
public class ItemList {

    
    private int id;
    private int orderId;
    private int productId;
    private int productQuantity;
    private double eachPrice;
    private double price;
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getEachPrice() {
        return eachPrice;
    }

    public void setEachPrice(double eachPrice) {
        this.eachPrice = eachPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    

    public ItemList(int item_list_id, int order_id, int product_id, int product_quantity, double eachprice, double price) {
        this.id = item_list_id;
        this.orderId = order_id;
        this.productId = product_id;
        this.productQuantity = product_quantity;
        this.eachPrice = eachprice;
        this.price = eachprice * product_quantity;
    }
    
    

}
