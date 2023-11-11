/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author bas200190
 */
@Entity
@Table(name="contacts")
public class Contact implements Serializable{
    @Id
    @Column(name="contact_id")
    private long contactId;
    
    @Column(name="member_id")
    private long memberId;
    
    @Column(name="name")
    private String name;
    
    @Column(name="mobile")
    private String mobile;
    
    @Column(name="email")
    private String email;

    public long getContactId() {
        return contactId;
    }

    public void setContactId(long contactId) {
        this.contactId = contactId;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(long contactId, long memberId, String name, String mobile, String email) {
        this.contactId = contactId;
        this.memberId = memberId;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

    public Contact() {
        super();
    }

    @Override
    public String toString() {
        return "Contact{" + "contactId=" + contactId + ", memberId=" + memberId + ", name=" + name + ", mobile=" + mobile + ", email=" + email + '}';
    }
    
    
    
}
