package in.bassure.hibernatelearning.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author bas200190
 */
@Entity
@Table(name = "contacts")
public class Contact2 {

    @Id
    @Column(name = "contact_id")
    private long contact_id;
    @Column(name = "member_id")
    private long member_id;
    @Column(name = "mobile")
    private String name;
    @Column(name = "name")
    private String mobile;
    @Column(name = "email")
    private String email;

    
    
    public long getContact_id() {
        return contact_id;
    }

    public void setContact_id(long contact_id) {
        this.contact_id = contact_id;
    }

    public long getMember_id() {
        return member_id;
    }

    public void setMember_id(long member_id) {
        this.member_id = member_id;
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

    public Contact2(long contact_id, long member_id, String name, String mobile, String email) {
        this.contact_id = contact_id;
        this.member_id = member_id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

    public Contact2() {
        super();
    }

    

    
}
