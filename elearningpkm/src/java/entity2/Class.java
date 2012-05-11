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
@Table(name = "class")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Class.findAll", query = "SELECT c FROM Class c"),
    @NamedQuery(name = "Class.findByClassId", query = "SELECT c FROM Class c WHERE c.classId = :classId"),
    @NamedQuery(name = "Class.findByClassName", query = "SELECT c FROM Class c WHERE c.className = :className")})
public class Class implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CLASS_ID")
    private Integer classId;
    @Basic(optional = false)
    @Column(name = "CLASS_NAME")
    private String className;
    @JoinColumn(name = "SCHOOL_ID", referencedColumnName = "SCHOOL_ID")
    @ManyToOne(optional = false)
    private School schoolId;
    @JoinColumn(name = "CLASS_CATEGORY_ID", referencedColumnName = "CLASS_CATEGORY_ID")
    @ManyToOne(optional = false)
    private ClassCategory classCategoryId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "classId")
    private Collection<Course> courseCollection;

    public Class() {
    }

    public Class(Integer classId) {
        this.classId = classId;
    }

    public Class(Integer classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public School getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(School schoolId) {
        this.schoolId = schoolId;
    }

    public ClassCategory getClassCategoryId() {
        return classCategoryId;
    }

    public void setClassCategoryId(ClassCategory classCategoryId) {
        this.classCategoryId = classCategoryId;
    }

    @XmlTransient
    public Collection<Course> getCourseCollection() {
        return courseCollection;
    }

    public void setCourseCollection(Collection<Course> courseCollection) {
        this.courseCollection = courseCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (classId != null ? classId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Class)) {
            return false;
        }
        Class other = (Class) object;
        if ((this.classId == null && other.classId != null) || (this.classId != null && !this.classId.equals(other.classId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Class[ classId=" + classId + " ]";
    }
    
}
