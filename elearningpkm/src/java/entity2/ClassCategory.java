/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity2;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author meccanic
 */
@Entity
@Table(name = "class_category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClassCategory.findAll", query = "SELECT c FROM ClassCategory c"),
    @NamedQuery(name = "ClassCategory.findByClassCategoryId", query = "SELECT c FROM ClassCategory c WHERE c.classCategoryId = :classCategoryId"),
    @NamedQuery(name = "ClassCategory.findByClassCategoryName", query = "SELECT c FROM ClassCategory c WHERE c.classCategoryName = :classCategoryName")})
public class ClassCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CLASS_CATEGORY_ID")
    private Integer classCategoryId;
    @Column(name = "CLASS_CATEGORY_NAME")
    private String classCategoryName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "classCategoryId")
    private Collection<Class> classCollection;

    public ClassCategory() {
    }

    public ClassCategory(Integer classCategoryId) {
        this.classCategoryId = classCategoryId;
    }

    public Integer getClassCategoryId() {
        return classCategoryId;
    }

    public void setClassCategoryId(Integer classCategoryId) {
        this.classCategoryId = classCategoryId;
    }

    public String getClassCategoryName() {
        return classCategoryName;
    }

    public void setClassCategoryName(String classCategoryName) {
        this.classCategoryName = classCategoryName;
    }

    @XmlTransient
    public Collection<Class> getClassCollection() {
        return classCollection;
    }

    public void setClassCollection(Collection<Class> classCollection) {
        this.classCollection = classCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (classCategoryId != null ? classCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClassCategory)) {
            return false;
        }
        ClassCategory other = (ClassCategory) object;
        if ((this.classCategoryId == null && other.classCategoryId != null) || (this.classCategoryId != null && !this.classCategoryId.equals(other.classCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ClassCategory[ classCategoryId=" + classCategoryId + " ]";
    }
    
}
