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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "course")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Course.findAll", query = "SELECT c FROM Course c"),
    @NamedQuery(name = "Course.findByCourseId", query = "SELECT c FROM Course c WHERE c.courseId = :courseId"),
    @NamedQuery(name = "Course.findByCourseName", query = "SELECT c FROM Course c WHERE c.courseName = :courseName"),
    @NamedQuery(name = "Course.findByCourseStart", query = "SELECT c FROM Course c WHERE c.courseStart = :courseStart"),
    @NamedQuery(name = "Course.findByCourseEnd", query = "SELECT c FROM Course c WHERE c.courseEnd = :courseEnd"),
    @NamedQuery(name = "Course.findByCourseCreated", query = "SELECT c FROM Course c WHERE c.courseCreated = :courseCreated")})
public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "COURSE_ID")
    private Integer courseId;
    @Column(name = "COURSE_NAME")
    private String courseName;
    @Column(name = "COURSE_START")
    @Temporal(TemporalType.DATE)
    private Date courseStart;
    @Column(name = "COURSE_END")
    @Temporal(TemporalType.DATE)
    private Date courseEnd;
    @Basic(optional = false)
    @Column(name = "COURSE_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date courseCreated;
    @OneToMany(mappedBy = "courseId")
    private Collection<Information> informationCollection;
    @OneToMany(mappedBy = "courseId")
    private Collection<CourseReg> courseRegCollection;
    @OneToMany(mappedBy = "courseId")
    private Collection<TimeLearning> timeLearningCollection;
    @JoinColumn(name = "CLASS_ID", referencedColumnName = "CLASS_ID")
    @ManyToOne
    private Class classId;
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    @ManyToOne
    private User id;
    @OneToMany(mappedBy = "courseId")
    private Collection<Assignment> assignmentCollection;

    public Course() {
    }

    public Course(Integer courseId) {
        this.courseId = courseId;
    }

    public Course(Integer courseId, Date courseCreated) {
        this.courseId = courseId;
        this.courseCreated = courseCreated;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getCourseStart() {
        return courseStart;
    }

    public void setCourseStart(Date courseStart) {
        this.courseStart = courseStart;
    }

    public Date getCourseEnd() {
        return courseEnd;
    }

    public void setCourseEnd(Date courseEnd) {
        this.courseEnd = courseEnd;
    }

    public Date getCourseCreated() {
        return courseCreated;
    }

    public void setCourseCreated(Date courseCreated) {
        this.courseCreated = courseCreated;
    }

    @XmlTransient
    public Collection<Information> getInformationCollection() {
        return informationCollection;
    }

    public void setInformationCollection(Collection<Information> informationCollection) {
        this.informationCollection = informationCollection;
    }

    @XmlTransient
    public Collection<CourseReg> getCourseRegCollection() {
        return courseRegCollection;
    }

    public void setCourseRegCollection(Collection<CourseReg> courseRegCollection) {
        this.courseRegCollection = courseRegCollection;
    }

    @XmlTransient
    public Collection<TimeLearning> getTimeLearningCollection() {
        return timeLearningCollection;
    }

    public void setTimeLearningCollection(Collection<TimeLearning> timeLearningCollection) {
        this.timeLearningCollection = timeLearningCollection;
    }

    public Class getClassId() {
        return classId;
    }

    public void setClassId(Class classId) {
        this.classId = classId;
    }

    public User getId() {
        return id;
    }

    public void setId(User id) {
        this.id = id;
    }

    @XmlTransient
    public Collection<Assignment> getAssignmentCollection() {
        return assignmentCollection;
    }

    public void setAssignmentCollection(Collection<Assignment> assignmentCollection) {
        this.assignmentCollection = assignmentCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (courseId != null ? courseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Course)) {
            return false;
        }
        Course other = (Course) object;
        if ((this.courseId == null && other.courseId != null) || (this.courseId != null && !this.courseId.equals(other.courseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Course[ courseId=" + courseId + " ]";
    }
    
}
