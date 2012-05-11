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
@Table(name = "course_reg")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CourseReg.findAll", query = "SELECT c FROM CourseReg c"),
    @NamedQuery(name = "CourseReg.findByCourseRegId", query = "SELECT c FROM CourseReg c WHERE c.courseRegId = :courseRegId"),
    @NamedQuery(name = "CourseReg.findByCourseRegCreated", query = "SELECT c FROM CourseReg c WHERE c.courseRegCreated = :courseRegCreated"),
    @NamedQuery(name = "CourseReg.findByCourseRegEnrolled", query = "SELECT c FROM CourseReg c WHERE c.courseRegEnrolled = :courseRegEnrolled"),
    @NamedQuery(name = "CourseReg.findByCourseRegConfirmed", query = "SELECT c FROM CourseReg c WHERE c.courseRegConfirmed = :courseRegConfirmed")})
public class CourseReg implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COURSE_REG_ID")
    private Integer courseRegId;
    @Basic(optional = false)
    @Column(name = "COURSE_REG_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date courseRegCreated;
    @Basic(optional = false)
    @Column(name = "COURSE_REG_ENROLLED")
    private boolean courseRegEnrolled;
    @Basic(optional = false)
    @Column(name = "COURSE_REG_CONFIRMED")
    private boolean courseRegConfirmed;
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private User id;
    @JoinColumn(name = "COURSE_ID", referencedColumnName = "COURSE_ID")
    @ManyToOne(optional = false)
    private Course courseId;

    public CourseReg() {
    }

    public CourseReg(Integer courseRegId) {
        this.courseRegId = courseRegId;
    }

    public CourseReg(Integer courseRegId, Date courseRegCreated, boolean courseRegEnrolled, boolean courseRegConfirmed) {
        this.courseRegId = courseRegId;
        this.courseRegCreated = courseRegCreated;
        this.courseRegEnrolled = courseRegEnrolled;
        this.courseRegConfirmed = courseRegConfirmed;
    }

    public Integer getCourseRegId() {
        return courseRegId;
    }

    public void setCourseRegId(Integer courseRegId) {
        this.courseRegId = courseRegId;
    }

    public Date getCourseRegCreated() {
        return courseRegCreated;
    }

    public void setCourseRegCreated(Date courseRegCreated) {
        this.courseRegCreated = courseRegCreated;
    }

    public boolean getCourseRegEnrolled() {
        return courseRegEnrolled;
    }

    public void setCourseRegEnrolled(boolean courseRegEnrolled) {
        this.courseRegEnrolled = courseRegEnrolled;
    }

    public boolean getCourseRegConfirmed() {
        return courseRegConfirmed;
    }

    public void setCourseRegConfirmed(boolean courseRegConfirmed) {
        this.courseRegConfirmed = courseRegConfirmed;
    }

    public User getId() {
        return id;
    }

    public void setId(User id) {
        this.id = id;
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
        hash += (courseRegId != null ? courseRegId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CourseReg)) {
            return false;
        }
        CourseReg other = (CourseReg) object;
        if ((this.courseRegId == null && other.courseRegId != null) || (this.courseRegId != null && !this.courseRegId.equals(other.courseRegId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.CourseReg[ courseRegId=" + courseRegId + " ]";
    }
    
}
