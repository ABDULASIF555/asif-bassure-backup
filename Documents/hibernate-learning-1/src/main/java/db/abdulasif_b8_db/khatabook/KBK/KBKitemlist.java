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
@Table(name = "KBK_item_list", catalog = "abdulasif_b8_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "KBKitemlist.findAll", query = "SELECT k FROM KBKitemlist k"),
    @NamedQuery(name = "KBKitemlist.findByItemListId", query = "SELECT k FROM KBKitemlist k WHERE k.itemListId = :itemListId"),
    @NamedQuery(name = "KBKitemlist.findByProductQuantity", query = "SELECT k FROM KBKitemlist k WHERE k.productQuantity = :productQuantity"),
    @NamedQuery(name = "KBKitemlist.findByEachUnitPrice", query = "SELECT k FROM KBKitemlist k WHERE k.eachUnitPrice = :eachUnitPrice"),
    @NamedQuery(name = "KBKitemlist.findByPrice", query = "SELECT k FROM KBKitemlist k WHERE k.price = :price")})
public class KBKitemlist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "item_list_id")
    private Integer itemListId;
    @Basic(optional = false)
    @Column(name = "product_quantity")
    private int productQuantity;
    @Basic(optional = false)
    @Column(name = "each_unit_price")
    private double eachUnitPrice;
    @Basic(optional = false)
    @Column(name = "price")
    private double price;
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    @ManyToOne(optional = false)
    private KBKorder orderId;
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    @ManyToOne(optional = false)
    private KBKproduct productId;

    public KBKitemlist() {
    }

    public KBKitemlist(Integer itemListId) {
        this.itemListId = itemListId;
    }

    public KBKitemlist(Integer itemListId, int productQuantity, double eachUnitPrice, double price) {
        this.itemListId = itemListId;
        this.productQuantity = productQuantity;
        this.eachUnitPrice = eachUnitPrice;
        this.price = price;
    }

    public Integer getItemListId() {
        return itemListId;
    }

    public void setItemListId(Integer itemListId) {
        this.itemListId = itemListId;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getEachUnitPrice() {
        return eachUnitPrice;
    }

    public void setEachUnitPrice(double eachUnitPrice) {
        this.eachUnitPrice = eachUnitPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public KBKorder getOrderId() {
        return orderId;
    }

    public void setOrderId(KBKorder orderId) {
        this.orderId = orderId;
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
        hash += (itemListId != null ? itemListId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KBKitemlist)) {
            return false;
        }
        KBKitemlist other = (KBKitemlist) object;
        if ((this.itemListId == null && other.itemListId != null) || (this.itemListId != null && !this.itemListId.equals(other.itemListId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.abdulasif_b8_db.khatabook.KBK.KBKitemlist[ itemListId=" + itemListId + " ]";
    }
    
}
