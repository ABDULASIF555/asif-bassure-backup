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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author bas200190
 */
@Entity
@Table(name = "KBK_users", catalog = "abdulasif_b8_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "KBKusers.findAll", query = "SELECT k FROM KBKusers k"),
    @NamedQuery(name = "KBKusers.findByUserId", query = "SELECT k FROM KBKusers k WHERE k.userId = :userId"),
    @NamedQuery(name = "KBKusers.findByUserPwd", query = "SELECT k FROM KBKusers k WHERE k.userPwd = :userPwd")})
public class KBKusers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Basic(optional = false)
    @Column(name = "user_pwd")
    private String userPwd;

    public KBKusers() {
    }

    public KBKusers(Integer userId) {
        this.userId = userId;
    }

    public KBKusers(Integer userId, String userPwd) {
        this.userId = userId;
        this.userPwd = userPwd;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KBKusers)) {
            return false;
        }
        KBKusers other = (KBKusers) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.abdulasif_b8_db.khatabook.KBK.KBKusers[ userId=" + userId + " ]";
    }
    
}
