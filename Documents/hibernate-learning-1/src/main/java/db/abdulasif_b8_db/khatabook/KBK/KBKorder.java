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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "KBK_order", catalog = "abdulasif_b8_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "KBKorder.findAll", query = "SELECT k FROM KBKorder k"),
    @NamedQuery(name = "KBKorder.findByOrderedDate", query = "SELECT k FROM KBKorder k WHERE k.orderedDate = :orderedDate"),
    @NamedQuery(name = "KBKorder.findByOrderId", query = "SELECT k FROM KBKorder k WHERE k.orderId = :orderId"),
    @NamedQuery(name = "KBKorder.findByTotalPrice", query = "SELECT k FROM KBKorder k WHERE k.totalPrice = :totalPrice"),
    @NamedQuery(name = "KBKorder.findByOrderStatus", query = "SELECT k FROM KBKorder k WHERE k.orderStatus = :orderStatus")})
public class KBKorder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ordered_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderedDate;
    @Id
    @Basic(optional = false)
    @Column(name = "order_id")
    private Integer orderId;
    @Basic(optional = false)
    @Column(name = "total_price")
    private double totalPrice;
    @Basic(optional = false)
    @Column(name = "order_status")
    private String orderStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderId")
    private Collection<KBKitemlist> kBKitemlistCollection;
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(optional = false)
    private KBKcustomer customerId;

    public KBKorder() {
    }

    public KBKorder(Integer orderId) {
        this.orderId = orderId;
    }

    public KBKorder(Integer orderId, Date orderedDate, double totalPrice, String orderStatus) {
        this.orderId = orderId;
        this.orderedDate = orderedDate;
        this.totalPrice = totalPrice;
        this.orderStatus = orderStatus;
    }

    public Date getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(Date orderedDate) {
        this.orderedDate = orderedDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Collection<KBKitemlist> getKBKitemlistCollection() {
        return kBKitemlistCollection;
    }

    public void setKBKitemlistCollection(Collection<KBKitemlist> kBKitemlistCollection) {
        this.kBKitemlistCollection = kBKitemlistCollection;
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
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KBKorder)) {
            return false;
        }
        KBKorder other = (KBKorder) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.abdulasif_b8_db.khatabook.KBK.KBKorder[ orderId=" + orderId + " ]";
    }
    
}
