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
public class Payment {
    private LocalDateTime paymentDate;
    private int id;
    private int customerId;
    private double amount;
    
    

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double paid_amount) {
        this.amount = paid_amount;
    }
    
    public Payment(LocalDateTime paymentDate , int payment_id, int customer_id, double paid_amount) {
        this.paymentDate = paymentDate;
        this.id = payment_id;
        this.customerId = customer_id;
        this.amount = paid_amount;
    }
    
    public Payment() {
    }

    @Override
    public String toString() {
        return "Payment{" + "paymentDate=" + paymentDate + ", id=" + id + ", customerId=" + customerId + ", amount=" + amount + '}';
    }
    
    
    
}
