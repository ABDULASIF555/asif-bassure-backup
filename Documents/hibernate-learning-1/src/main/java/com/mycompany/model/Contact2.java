///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.model;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//import java.io.Serializable;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//
//
///**
// *
// * @author bas200190
// */
//@Entity
//@Table(name="contacts")
//@NamedQueries(value = {
//                        @NamedQuery(name="" , value=""),
//                        @NamedQuery(name="" , value="")
//                        })
//public class Contact2 implements Serializable{
//    @Id
//    @Column(name="contact_id")
//    private long contactId;
//    
//    
//    @Column(name="name")
//    private String name;
//    
//    @Column(name="mobile")
//    private String mobile;
//    
//    @Column(name="email")
//    private String email;
//    
//    @ManyToOne
//    @JoinColumn(name="member_id")
//    private Member member;
//
//    public long getContactId() {
//        return contactId;
//    }
//
//    public void setContactId(long contactId) {
//        this.contactId = contactId;
//    }
//
//    
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(String mobile) {
//        this.mobile = mobile;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Member getMember() {
//        return member;
//    }
//
//    public void setMember(Member member) {
//        this.member = member;
//    }
//
//    public Contact2(long contactId, String name, String mobile, String email, Member member) {
//        this.contactId = contactId;
//        this.name = name;
//        this.mobile = mobile;
//        this.email = email;
//        this.member = member;
//    }
//
//    public Contact2() {
//        super();
//    }
//
//    @Override
//    public String toString() {
//        return "Contact2{" + "contactId=" + contactId + ", name=" + name + ", mobile=" + mobile + ", email=" + email + '}';
//    }
//
//    
//    
//    
//    
//}
