/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.khatabook.microservicelearningcustomer.model;

import java.time.LocalDateTime;



/**
 *
 * @author bas200190
 */
public class Product {

    private int id;
    private LocalDateTime productAddedDateAndTime;
    private String name;
    private Category category;
    private String weight;
    private double buyingPrice;
    private double sellingPrice;
    private String brand;
    private Dealer dealer;
    private int quantity;

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getProductAddedDateAndTime() {
        return productAddedDateAndTime;
    }

    public void setProductAddedDateAndTime(LocalDateTime productAddedDateAndTime) {
        this.productAddedDateAndTime = productAddedDateAndTime;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String product_name) {
        this.name = product_name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    

    public String getWeight() {
        return weight;
    }

    public void setWeight(String product_weight) {
        this.weight = product_weight;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public Product(int product_id,LocalDateTime productAddedDateAndTime,String product_name,Category category,String product_weight,double product_buying_price,double product_selling_price,String product_brand,Dealer dealer , int product_quantity){
       
      this.id = product_id;
      this.productAddedDateAndTime = productAddedDateAndTime;
      this.name = product_name;
      this.category = category;
      this.weight = product_weight;
      this.buyingPrice = product_buying_price;
      this.sellingPrice = product_selling_price;
      this.brand = product_brand;
      this.dealer = dealer;
      this.quantity = product_quantity;
    }
    
    

}
