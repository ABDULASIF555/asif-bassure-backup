/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.abdulasif_b8_db.khatabook.KBK;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author bas200190
 */
@Entity
@Table(name = "KBK_customer_address", catalog = "abdulasif_b8_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "KBKcustomeraddress.findAll", query = "SELECT k FROM KBKcustomeraddress k"),
    @NamedQuery(name = "KBKcustomeraddress.findByAddressId", query = "SELECT k FROM KBKcustomeraddress k WHERE k.addressId = :addressId"),
    @NamedQuery(name = "KBKcustomeraddress.findByDoorNo", query = "SELECT k FROM KBKcustomeraddress k WHERE k.doorNo = :doorNo"),
    @NamedQuery(name = "KBKcustomeraddress.findByStreetName", query = "SELECT k FROM KBKcustomeraddress k WHERE k.streetName = :streetName"),
    @NamedQuery(name = "KBKcustomeraddress.findByCity", query = "SELECT k FROM KBKcustomeraddress k WHERE k.city = :city"),
    @NamedQuery(name = "KBKcustomeraddress.findByPincode", query = "SELECT k FROM KBKcustomeraddress k WHERE k.pincode = :pincode")})
public class KBKcustomeraddress implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "address_id")
    private Integer addressId;
    @Basic(optional = false)
    @Column(name = "door_no")
    private String doorNo;
    @Basic(optional = false)
    @Column(name = "street_name")
    private String streetName;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @Column(name = "pincode")
    private int pincode;
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(optional = false)
    private KBKcustomer customerId;

    public KBKcustomeraddress() {
    }

    public KBKcustomeraddress(Integer addressId) {
        this.addressId = addressId;
    }

    public KBKcustomeraddress(Integer addressId, String doorNo, String streetName, String city, int pincode) {
        this.addressId = addressId;
        this.doorNo = doorNo;
        this.streetName = streetName;
        this.city = city;
        this.pincode = pincode;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
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

    public KBKcustomer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(KBKcustomer customerId) {
        this.customerId = customerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addressId != null ? addressId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KBKcustomeraddress)) {
            return false;
        }
        KBKcustomeraddress other = (KBKcustomeraddress) object;
        if ((this.addressId == null && other.addressId != null) || (this.addressId != null && !this.addressId.equals(other.addressId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.abdulasif_b8_db.khatabook.KBK.KBKcustomeraddress[ addressId=" + addressId + " ]";
    }
    
}
