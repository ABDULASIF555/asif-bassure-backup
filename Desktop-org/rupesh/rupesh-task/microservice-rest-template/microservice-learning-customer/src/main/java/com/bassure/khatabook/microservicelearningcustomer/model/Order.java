/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.khatabook.microservicelearningcustomer.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author bas200190
 */
public class Order {

    private LocalDateTime orderedDate;
    private int id;
    private int customerId;
    private double totalPrice;
    private List<ItemList> itemLists;
    private String orderStatus;

    public LocalDateTime getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(LocalDateTime orderedDate) {
        this.orderedDate = orderedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<ItemList> getItemLists() {
        return itemLists;
    }

    public void setItemLists(List<ItemList> itemLists) {
        this.itemLists = itemLists;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    
    
    

    

    public Order(LocalDateTime orderedDate, int id, int customerId, double totalPrice, List<ItemList> itemLists, String orderStatus) {
        this.orderedDate = orderedDate;
        this.id = id;
        this.customerId = customerId;
        this.totalPrice = totalPrice;
        this.itemLists = itemLists;
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Orders{" + "orderedDate=" + orderedDate + ", id=" + id + ", customerId=" + customerId + ", totalPrice=" + totalPrice + ", itemLists=" + itemLists + ", orderStatus=" + orderStatus + '}';
    }

    

    
}
