/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.abdulasif_b8_db.khatabook.KBK;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author bas200190
 */
@Entity
@Table(name = "KBK_customer", catalog = "abdulasif_b8_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "KBKcustomer.findAll", query = "SELECT k FROM KBKcustomer k"),
    @NamedQuery(name = "KBKcustomer.findByJoiningDateAndTime", query = "SELECT k FROM KBKcustomer k WHERE k.joiningDateAndTime = :joiningDateAndTime"),
    @NamedQuery(name = "KBKcustomer.findByCustomerId", query = "SELECT k FROM KBKcustomer k WHERE k.customerId = :customerId"),
    @NamedQuery(name = "KBKcustomer.findByCustomerName", query = "SELECT k FROM KBKcustomer k WHERE k.customerName = :customerName"),
    @NamedQuery(name = "KBKcustomer.findByCustomerPhoneNo", query = "SELECT k FROM KBKcustomer k WHERE k.customerPhoneNo = :customerPhoneNo"),
    @NamedQuery(name = "KBKcustomer.findByCustomerDebit", query = "SELECT k FROM KBKcustomer k WHERE k.customerDebit = :customerDebit"),
    @NamedQuery(name = "KBKcustomer.findByAge", query = "SELECT k FROM KBKcustomer k WHERE k.age = :age"),
    @NamedQuery(name = "KBKcustomer.findByGender", query = "SELECT k FROM KBKcustomer k WHERE k.gender = :gender"),
    @NamedQuery(name = "KBKcustomer.findByCustomerStatus", query = "SELECT k FROM KBKcustomer k WHERE k.customerStatus = :customerStatus")})
public class KBKcustomer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "joining_date_and_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date joiningDateAndTime;
    @Id
    @Basic(optional = false)
    @Column(name = "customer_id")
    private Integer customerId;
    @Basic(optional = false)
    @Column(name = "customer_name")
    private String customerName;
    @Basic(optional = false)
    @Column(name = "customer_phone_no")
    private String customerPhoneNo;
    @Basic(optional = false)
    @Column(name = "customer_debit")
    private double customerDebit;
    @Basic(optional = false)
    @Column(name = "age")
    private short age;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "customer_status")
    private String customerStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerId")
    private Collection<KBKcustomeraddress> kBKcustomeraddressCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerId")
    private Collection<KBKorder> kBKorderCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerId")
    private Collection<KBKpayment> kBKpaymentCollection;

    public KBKcustomer() {
    }

    public KBKcustomer(Integer customerId) {
        this.customerId = customerId;
    }

    public KBKcustomer(Integer customerId, Date joiningDateAndTime, String customerName, String customerPhoneNo, double customerDebit, short age, String gender, String customerStatus) {
        this.customerId = customerId;
        this.joiningDateAndTime = joiningDateAndTime;
        this.customerName = customerName;
        this.customerPhoneNo = customerPhoneNo;
        this.customerDebit = customerDebit;
        this.age = age;
        this.gender = gender;
        this.customerStatus = customerStatus;
    }

    public Date getJoiningDateAndTime() {
        return joiningDateAndTime;
    }

    public void setJoiningDateAndTime(Date joiningDateAndTime) {
        this.joiningDateAndTime = joiningDateAndTime;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }

    public double getCustomerDebit() {
        return customerDebit;
    }

    public void setCustomerDebit(double customerDebit) {
        this.customerDebit = customerDebit;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public Collection<KBKcustomeraddress> getKBKcustomeraddressCollection() {
        return kBKcustomeraddressCollection;
    }

    public void setKBKcustomeraddressCollection(Collection<KBKcustomeraddress> kBKcustomeraddressCollection) {
        this.kBKcustomeraddressCollection = kBKcustomeraddressCollection;
    }

    public Collection<KBKorder> getKBKorderCollection() {
        return kBKorderCollection;
    }

    public void setKBKorderCollection(Collection<KBKorder> kBKorderCollection) {
        this.kBKorderCollection = kBKorderCollection;
    }

    public Collection<KBKpayment> getKBKpaymentCollection() {
        return kBKpaymentCollection;
    }

    public void setKBKpaymentCollection(Collection<KBKpayment> kBKpaymentCollection) {
        this.kBKpaymentCollection = kBKpaymentCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KBKcustomer)) {
            return false;
        }
        KBKcustomer other = (KBKcustomer) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.abdulasif_b8_db.khatabook.KBK.KBKcustomer[ customerId=" + customerId + " ]";
    }
    
}
