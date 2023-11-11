/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.abdulasif_b8_db.khatabook.KBK;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author bas200190
 */
@Entity
@Table(name = "KBK_payment", catalog = "abdulasif_b8_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "KBKpayment.findAll", query = "SELECT k FROM KBKpayment k"),
    @NamedQuery(name = "KBKpayment.findByPaymentDate", query = "SELECT k FROM KBKpayment k WHERE k.paymentDate = :paymentDate"),
    @NamedQuery(name = "KBKpayment.findByPaymentId", query = "SELECT k FROM KBKpayment k WHERE k.paymentId = :paymentId"),
    @NamedQuery(name = "KBKpayment.findByPaidAmount", query = "SELECT k FROM KBKpayment k WHERE k.paidAmount = :paidAmount")})
public class KBKpayment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "payment_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentDate;
    @Id
    @Basic(optional = false)
    @Column(name = "payment_id")
    private Integer paymentId;
    @Basic(optional = false)
    @Column(name = "paid_amount")
    private double paidAmount;
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(optional = false)
    private KBKcustomer customerId;

    public KBKpayment() {
    }

    public KBKpayment(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public KBKpayment(Integer paymentId, Date paymentDate, double paidAmount) {
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
        this.paidAmount = paidAmount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
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
        hash += (paymentId != null ? paymentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KBKpayment)) {
            return false;
        }
        KBKpayment other = (KBKpayment) object;
        if ((this.paymentId == null && other.paymentId != null) || (this.paymentId != null && !this.paymentId.equals(other.paymentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.abdulasif_b8_db.khatabook.KBK.KBKpayment[ paymentId=" + paymentId + " ]";
    }
    
}
