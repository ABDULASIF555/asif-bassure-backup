/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.khatabook.microservicelearningcustomer.model;

/**
 *
 * @author bas200190
 */
public class Address {
    private int id;
    private int customer_id;
    private String doorNo;
    private String streetName;
    private String city;
    private int pincode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public Address(int id, int customer_id, String doorNo, String streetName, String city, int pincode) {
        this.id = id;
        this.customer_id = customer_id;
        this.doorNo = doorNo;
        this.streetName = streetName;
        this.city = city;
        this.pincode = pincode;
    }

    public Address() {
    }
    
    
    
}
