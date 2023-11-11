/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.khatabook.microservicelearning.model;

import java.time.LocalDateTime;

/**
 *
 * @author bas200190
 */
public class Customer {

    private LocalDateTime joiningDateAndTime;
    private  int id;
    private String name;
    private String phoneNo;
    private String gender;
    private int age;
    private double debit;
    private String status;
    private Address address;

    
    public Customer(LocalDateTime joiningDateAndTime, int id, String name, String phoneNo,double debit, int age,  String gender, String status , Address address) {
        this.joiningDateAndTime = joiningDateAndTime;
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.gender = gender;
        this.age = age;
        this.debit = debit;
        this.status = status;
        this.address = address;
    }

    public Customer() {
    }
    
    

    public LocalDateTime getJoiningDateAndTime() {
        return joiningDateAndTime;
    }

    public void setJoiningDateAndTime(LocalDateTime joiningDateAndTime) {
        this.joiningDateAndTime = joiningDateAndTime;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + "joiningDateAndTime=" + joiningDateAndTime + ", id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", gender=" + gender + ", age=" + age + ", debit=" + debit + ", status=" + status + ", address=" + address + '}';
    }
    
    

    

    

    

}
