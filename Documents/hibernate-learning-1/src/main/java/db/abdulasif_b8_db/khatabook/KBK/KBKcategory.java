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
@Table(name = "KBK_category", catalog = "abdulasif_b8_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "KBKcategory.findAll", query = "SELECT k FROM KBKcategory k"),
    @NamedQuery(name = "KBKcategory.findByCategoryId", query = "SELECT k FROM KBKcategory k WHERE k.categoryId = :categoryId"),
    @NamedQuery(name = "KBKcategory.findByCategoryName", query = "SELECT k FROM KBKcategory k WHERE k.categoryName = :categoryName")})
public class KBKcategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "category_id")
    private Integer categoryId;
    @Basic(optional = false)
    @Column(name = "category_name")
    private String categoryName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategoryId")
    private Collection<KBKproduct> kBKproductCollection;

    public KBKcategory() {
    }

    public KBKcategory(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public KBKcategory(Integer categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
        hash += (categoryId != null ? categoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KBKcategory)) {
            return false;
        }
        KBKcategory other = (KBKcategory) object;
        if ((this.categoryId == null && other.categoryId != null) || (this.categoryId != null && !this.categoryId.equals(other.categoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.abdulasif_b8_db.khatabook.KBK.KBKcategory[ categoryId=" + categoryId + " ]";
    }
    
}
