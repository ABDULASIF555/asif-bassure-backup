/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="memberss")
public class Member2 implements Serializable{
    @Id
    @Column(name="member_id")
    private long memberId;
    
    @Column(name="name")
    private String name;
    
    @Column(name="mobile")
    private String mobile;
    
    @OneToMany(mappedBy = "member")
    private List<Contact2> conatctList;

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

    public List<Contact2> getConatctList() {
        return conatctList;
    }

    public void setConatctList(List<Contact2> conatctList) {
        this.conatctList = conatctList;
    }

    public Member2(long memberId, String name, String mobile) {
        this.memberId = memberId;
        this.name = name;
        this.mobile = mobile;
    }

    public Member2() {
        super();
    }

    @Override
    public String toString() {
        return "Member2{" + "memberId=" + memberId + ", name=" + name + ", mobile=" + mobile + '}';
    }

    
    
    
    
}
