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
@Table(name = "KBK_product", catalog = "abdulasif_b8_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "KBKproduct.findAll", query = "SELECT k FROM KBKproduct k"),
    @NamedQuery(name = "KBKproduct.findByProductId", query = "SELECT k FROM KBKproduct k WHERE k.productId = :productId"),
    @NamedQuery(name = "KBKproduct.findByProductName", query = "SELECT k FROM KBKproduct k WHERE k.productName = :productName"),
    @NamedQuery(name = "KBKproduct.findByProductWeight", query = "SELECT k FROM KBKproduct k WHERE k.productWeight = :productWeight"),
    @NamedQuery(name = "KBKproduct.findByProductBuyingPrice", query = "SELECT k FROM KBKproduct k WHERE k.productBuyingPrice = :productBuyingPrice"),
    @NamedQuery(name = "KBKproduct.findByProductSellingPrice", query = "SELECT k FROM KBKproduct k WHERE k.productSellingPrice = :productSellingPrice"),
    @NamedQuery(name = "KBKproduct.findByProductBrand", query = "SELECT k FROM KBKproduct k WHERE k.productBrand = :productBrand"),
    @NamedQuery(name = "KBKproduct.findByProductQuantity", query = "SELECT k FROM KBKproduct k WHERE k.productQuantity = :productQuantity"),
    @NamedQuery(name = "KBKproduct.findByProductAddedDate", query = "SELECT k FROM KBKproduct k WHERE k.productAddedDate = :productAddedDate")})
public class KBKproduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "product_id")
    private Integer productId;
    @Basic(optional = false)
    @Column(name = "product_name")
    private String productName;
    @Basic(optional = false)
    @Column(name = "product_weight")
    private String productWeight;
    @Basic(optional = false)
    @Column(name = "product_buying_price")
    private double productBuyingPrice;
    @Basic(optional = false)
    @Column(name = "product_selling_price")
    private double productSellingPrice;
    @Basic(optional = false)
    @Column(name = "product_brand")
    private String productBrand;
    @Basic(optional = false)
    @Column(name = "product_quantity")
    private int productQuantity;
    @Basic(optional = false)
    @Column(name = "product_added_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date productAddedDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId")
    private Collection<KBKnewstock> kBKnewstockCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId")
    private Collection<KBKitemlist> kBKitemlistCollection;
    @JoinColumn(name = "product_category_id", referencedColumnName = "category_id")
    @ManyToOne(optional = false)
    private KBKcategory productCategoryId;
    @JoinColumn(name = "dealer_id", referencedColumnName = "dealer_id")
    @ManyToOne(optional = false)
    private KBKdealer dealerId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId")
    private Collection<KBKstock> kBKstockCollection;

    public KBKproduct() {
    }

    public KBKproduct(Integer productId) {
        this.productId = productId;
    }

    public KBKproduct(Integer productId, String productName, String productWeight, double productBuyingPrice, double productSellingPrice, String productBrand, int productQuantity, Date productAddedDate) {
        this.productId = productId;
        this.productName = productName;
        this.productWeight = productWeight;
        this.productBuyingPrice = productBuyingPrice;
        this.productSellingPrice = productSellingPrice;
        this.productBrand = productBrand;
        this.productQuantity = productQuantity;
        this.productAddedDate = productAddedDate;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        this.productWeight = productWeight;
    }

    public double getProductBuyingPrice() {
        return productBuyingPrice;
    }

    public void setProductBuyingPrice(double productBuyingPrice) {
        this.productBuyingPrice = productBuyingPrice;
    }

    public double getProductSellingPrice() {
        return productSellingPrice;
    }

    public void setProductSellingPrice(double productSellingPrice) {
        this.productSellingPrice = productSellingPrice;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Date getProductAddedDate() {
        return productAddedDate;
    }

    public void setProductAddedDate(Date productAddedDate) {
        this.productAddedDate = productAddedDate;
    }

    public Collection<KBKnewstock> getKBKnewstockCollection() {
        return kBKnewstockCollection;
    }

    public void setKBKnewstockCollection(Collection<KBKnewstock> kBKnewstockCollection) {
        this.kBKnewstockCollection = kBKnewstockCollection;
    }

    public Collection<KBKitemlist> getKBKitemlistCollection() {
        return kBKitemlistCollection;
    }

    public void setKBKitemlistCollection(Collection<KBKitemlist> kBKitemlistCollection) {
        this.kBKitemlistCollection = kBKitemlistCollection;
    }

    public KBKcategory getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(KBKcategory productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public KBKdealer getDealerId() {
        return dealerId;
    }

    public void setDealerId(KBKdealer dealerId) {
        this.dealerId = dealerId;
    }

    public Collection<KBKstock> getKBKstockCollection() {
        return kBKstockCollection;
    }

    public void setKBKstockCollection(Collection<KBKstock> kBKstockCollection) {
        this.kBKstockCollection = kBKstockCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KBKproduct)) {
            return false;
        }
        KBKproduct other = (KBKproduct) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.abdulasif_b8_db.khatabook.KBK.KBKproduct[ productId=" + productId + " ]";
    }
    
}
