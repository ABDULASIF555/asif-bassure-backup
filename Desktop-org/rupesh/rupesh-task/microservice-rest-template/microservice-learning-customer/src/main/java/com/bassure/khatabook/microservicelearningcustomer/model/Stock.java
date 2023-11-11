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
public class Stock {
    private int stockId;
    private LocalDateTime stockAddedDate;
    private int productId;
    private double productPrice;
    private int quantity;
    private StockAction stockAction;

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public LocalDateTime getStockAddedDate() {
        return stockAddedDate;
    }

    public void setStockAddedDate(LocalDateTime stockAddedDate) {
        this.stockAddedDate = stockAddedDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public StockAction getStockAction() {
        return stockAction;
    }

    public void setStockAction(StockAction stockAction) {
        this.stockAction = stockAction;
    }

    public Stock(int stockId, LocalDateTime stockAddedDate, int productId, double productPrice, int quantity, StockAction stockAction) {
        this.stockId = stockId;
        this.stockAddedDate = stockAddedDate;
        this.productId = productId;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.stockAction = stockAction;
    }

    public Stock() {
    }

    @Override
    public String toString() {
        return "Stock{" + "stockId=" + stockId + ", stockAddedDate=" + stockAddedDate + ", productId=" + productId + ", productPrice=" + productPrice + ", quantity=" + quantity + ", stockAction=" + stockAction + '}';
    }
    
    
}
