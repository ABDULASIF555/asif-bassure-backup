/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.abdulasif_b8_db.khatabook.KBK;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author bas200190
 */
@Entity
@Table(name = "KBK_dealer", catalog = "abdulasif_b8_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "KBKdealer.findAll", query = "SELECT k FROM KBKdealer k"),
    @NamedQuery(name = "KBKdealer.findByDealerId", query = "SELECT k FROM KBKdealer k WHERE k.dealerId = :dealerId"),
    @NamedQuery(name = "KBKdealer.findByDealerName", query = "SELECT k FROM KBKdealer k WHERE k.dealerName = :dealerName"),
    @NamedQuery(name = "KBKdealer.findByDealerAddress", query = "SELECT k FROM KBKdealer k WHERE k.dealerAddress = :dealerAddress"),
    @NamedQuery(name = "KBKdealer.findByDealerPhoneNo", query = "SELECT k FROM KBKdealer k WHERE k.dealerPhoneNo = :dealerPhoneNo"),
    @NamedQuery(name = "KBKdealer.findByStatus", query = "SELECT k FROM KBKdealer k WHERE k.status = :status")})
public class KBKdealer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "dealer_id")
    private Integer dealerId;
    @Basic(optional = false)
    @Column(name = "dealer_name")
    private String dealerName;
    @Basic(optional = false)
    @Column(name = "dealer_address")
    private String dealerAddress;
    @Basic(optional = false)
    @Column(name = "dealer_phone_no")
    private String dealerPhoneNo;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dealerId")
    private Collection<KBKproduct> kBKproductCollection;

    public KBKdealer() {
    }

    public KBKdealer(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public KBKdealer(Integer dealerId, String dealerName, String dealerAddress, String dealerPhoneNo, String status) {
        this.dealerId = dealerId;
        this.dealerName = dealerName;
        this.dealerAddress = dealerAddress;
        this.dealerPhoneNo = dealerPhoneNo;
        this.status = status;
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDealerAddress() {
        return dealerAddress;
    }

    public void setDealerAddress(String dealerAddress) {
        this.dealerAddress = dealerAddress;
    }

    public String getDealerPhoneNo() {
        return dealerPhoneNo;
    }

    public void setDealerPhoneNo(String dealerPhoneNo) {
        this.dealerPhoneNo = dealerPhoneNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Collection<KBKproduct> getKBKproductCollection() {
        return kBKproductCollection;
    }

    public void setKBKproductCollection(Collection<KBKproduct> kBKproductCollection) {
        this.kBKproductCollection = kBKproductCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dealerId != null ? dealerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KBKdealer)) {
            return false;
        }
        KBKdealer other = (KBKdealer) object;
        if ((this.dealerId == null && other.dealerId != null) || (this.dealerId != null && !this.dealerId.equals(other.dealerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.abdulasif_b8_db.khatabook.KBK.KBKdealer[ dealerId=" + dealerId + " ]";
    }
    
}
