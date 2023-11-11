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
@Table(name = "KBK_stock", catalog = "abdulasif_b8_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "KBKstock.findAll", query = "SELECT k FROM KBKstock k"),
    @NamedQuery(name = "KBKstock.findByStockId", query = "SELECT k FROM KBKstock k WHERE k.stockId = :stockId"),
    @NamedQuery(name = "KBKstock.findByDateAndTime", query = "SELECT k FROM KBKstock k WHERE k.dateAndTime = :dateAndTime"),
    @NamedQuery(name = "KBKstock.findByProductPrice", query = "SELECT k FROM KBKstock k WHERE k.productPrice = :productPrice"),
    @NamedQuery(name = "KBKstock.findByQuantity", query = "SELECT k FROM KBKstock k WHERE k.quantity = :quantity"),
    @NamedQuery(name = "KBKstock.findByStockAction", query = "SELECT k FROM KBKstock k WHERE k.stockAction = :stockAction")})
public class KBKstock implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "stock_id")
    private Integer stockId;
    @Basic(optional = false)
    @Column(name = "date_and_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAndTime;
    @Basic(optional = false)
    @Column(name = "product_price")
    private double productPrice;
    @Basic(optional = false)
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @Column(name = "stock_action")
    private String stockAction;
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    @ManyToOne(optional = false)
    private KBKproduct productId;

    public KBKstock() {
    }

    public KBKstock(Integer stockId) {
        this.stockId = stockId;
    }

    public KBKstock(Integer stockId, Date dateAndTime, double productPrice, int quantity, String stockAction) {
        this.stockId = stockId;
        this.dateAndTime = dateAndTime;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.stockAction = stockAction;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStockAction() {
        return stockAction;
    }

    public void setStockAction(String stockAction) {
        this.stockAction = stockAction;
    }

    public KBKproduct getProductId() {
        return productId;
    }

    public void setProductId(KBKproduct productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stockId != null ? stockId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KBKstock)) {
            return false;
        }
        KBKstock other = (KBKstock) object;
        if ((this.stockId == null && other.stockId != null) || (this.stockId != null && !this.stockId.equals(other.stockId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.abdulasif_b8_db.khatabook.KBK.KBKstock[ stockId=" + stockId + " ]";
    }
    
}
