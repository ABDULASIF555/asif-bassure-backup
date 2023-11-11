package in.bassure.hibernatelearning.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Contact {

    @Id
    @Column(name = "contact_id")
    private long contactId;
    
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member memberId;
    
    @Column(name = "mobile")
    private String name;
    
    @Column(name = "name")
    private String mobile;
    
    @Column(name = "email")
    private String email;

    public long getContactId() {
        return contactId;
    }

    public void setContactId(long contactId) {
        this.contactId = contactId;
    }

    public Member getMemberId() {
        return memberId;
    }

    public void setMemberId(Member memberId) {
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

    public Contact(long contact_id, Member member_id, String name, String mobile, String email) {
        this.contactId = contact_id;
        this.memberId = member_id;
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
