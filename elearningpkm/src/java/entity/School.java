/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Accio
 */
@Entity
@Table(name = "school")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "School.findAll", query = "SELECT s FROM School s"),
    @NamedQuery(name = "School.findBySchoolId", query = "SELECT s FROM School s WHERE s.schoolId = :schoolId"),
    @NamedQuery(name = "School.findBySchoolName", query = "SELECT s FROM School s WHERE s.schoolName = :schoolName"),
    @NamedQuery(name = "School.findBySchoolEmail", query = "SELECT s FROM School s WHERE s.schoolEmail = :schoolEmail"),
    @NamedQuery(name = "School.findBySchoolAddress", query = "SELECT s FROM School s WHERE s.schoolAddress = :schoolAddress"),
    @NamedQuery(name = "School.findBySchoolCity", query = "SELECT s FROM School s WHERE s.schoolCity = :schoolCity"),
    @NamedQuery(name = "School.findBySchoolProvince", query = "SELECT s FROM School s WHERE s.schoolProvince = :schoolProvince"),
    @NamedQuery(name = "School.findBySchoolZip", query = "SELECT s FROM School s WHERE s.schoolZip = :schoolZip"),
    @NamedQuery(name = "School.findBySchoolPhone", query = "SELECT s FROM School s WHERE s.schoolPhone = :schoolPhone"),
    @NamedQuery(name = "School.findBySchoolCreated", query = "SELECT s FROM School s WHERE s.schoolCreated = :schoolCreated")})
public class School implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "SCHOOL_ID")
    private Integer schoolId;
    @Column(name = "SCHOOL_NAME")
    private String schoolName;
    @Column(name = "SCHOOL_EMAIL")
    private String schoolEmail;
    @Column(name = "SCHOOL_ADDRESS")
    private String schoolAddress;
    @Column(name = "SCHOOL_CITY")
    private String schoolCity;
    @Column(name = "SCHOOL_PROVINCE")
    private String schoolProvince;
    @Column(name = "SCHOOL_ZIP")
    private String schoolZip;
    @Column(name = "SCHOOL_PHONE")
    private String schoolPhone;
    @Basic(optional = false)
    @Column(name = "SCHOOL_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date schoolCreated;
    @OneToMany(mappedBy = "schoolId")
    private Collection<Class> classCollection;
    @OneToMany(mappedBy = "schoolId")
    private Collection<User> userCollection;

    public School() {
    }

    public School(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public School(Integer schoolId, Date schoolCreated) {
        this.schoolId = schoolId;
        this.schoolCreated = schoolCreated;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolEmail() {
        return schoolEmail;
    }

    public void setSchoolEmail(String schoolEmail) {
        this.schoolEmail = schoolEmail;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolCity() {
        return schoolCity;
    }

    public void setSchoolCity(String schoolCity) {
        this.schoolCity = schoolCity;
    }

    public String getSchoolProvince() {
        return schoolProvince;
    }

    public void setSchoolProvince(String schoolProvince) {
        this.schoolProvince = schoolProvince;
    }

    public String getSchoolZip() {
        return schoolZip;
    }

    public void setSchoolZip(String schoolZip) {
        this.schoolZip = schoolZip;
    }

    public String getSchoolPhone() {
        return schoolPhone;
    }

    public void setSchoolPhone(String schoolPhone) {
        this.schoolPhone = schoolPhone;
    }

    public Date getSchoolCreated() {
        return schoolCreated;
    }

    public void setSchoolCreated(Date schoolCreated) {
        this.schoolCreated = schoolCreated;
    }

    @XmlTransient
    public Collection<Class> getClassCollection() {
        return classCollection;
    }

    public void setClassCollection(Collection<Class> classCollection) {
        this.classCollection = classCollection;
    }

    @XmlTransient
    public Collection<User> getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(Collection<User> userCollection) {
        this.userCollection = userCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (schoolId != null ? schoolId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof School)) {
            return false;
        }
        School other = (School) object;
        if ((this.schoolId == null && other.schoolId != null) || (this.schoolId != null && !this.schoolId.equals(other.schoolId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.School[ schoolId=" + schoolId + " ]";
    }
    
}
