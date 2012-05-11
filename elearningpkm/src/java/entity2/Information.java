/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity2;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author meccanic
 */
@Entity
@Table(name = "information")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Information.findAll", query = "SELECT i FROM Information i"),
    @NamedQuery(name = "Information.findByInformationId", query = "SELECT i FROM Information i WHERE i.informationId = :informationId"),
    @NamedQuery(name = "Information.findByInformationDate", query = "SELECT i FROM Information i WHERE i.informationDate = :informationDate")})
public class Information implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "INFORMATION_ID")
    private Integer informationId;
    @Basic(optional = false)
    @Lob
    @Column(name = "INFORMATION_BODY")
    private String informationBody;
    @Column(name = "INFORMATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date informationDate;
    @JoinColumn(name = "COURSE_ID", referencedColumnName = "COURSE_ID")
    @ManyToOne(optional = false)
    private Course courseId;

    public Information() {
    }

    public Information(Integer informationId) {
        this.informationId = informationId;
    }

    public Information(Integer informationId, String informationBody) {
        this.informationId = informationId;
        this.informationBody = informationBody;
    }

    public Integer getInformationId() {
        return informationId;
    }

    public void setInformationId(Integer informationId) {
        this.informationId = informationId;
    }

    public String getInformationBody() {
        return informationBody;
    }

    public void setInformationBody(String informationBody) {
        this.informationBody = informationBody;
    }

    public Date getInformationDate() {
        return informationDate;
    }

    public void setInformationDate(Date informationDate) {
        this.informationDate = informationDate;
    }

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (informationId != null ? informationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Information)) {
            return false;
        }
        Information other = (Information) object;
        if ((this.informationId == null && other.informationId != null) || (this.informationId != null && !this.informationId.equals(other.informationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Information[ informationId=" + informationId + " ]";
    }
    
}
