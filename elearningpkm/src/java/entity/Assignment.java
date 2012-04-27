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
import javax.persistence.Lob;
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
@Table(name = "assignment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Assignment.findAll", query = "SELECT a FROM Assignment a"),
    @NamedQuery(name = "Assignment.findByAssignmentId", query = "SELECT a FROM Assignment a WHERE a.assignmentId = :assignmentId"),
    @NamedQuery(name = "Assignment.findByAssignmentName", query = "SELECT a FROM Assignment a WHERE a.assignmentName = :assignmentName"),
    @NamedQuery(name = "Assignment.findByAssignmentStart", query = "SELECT a FROM Assignment a WHERE a.assignmentStart = :assignmentStart"),
    @NamedQuery(name = "Assignment.findByAssignmentEnd", query = "SELECT a FROM Assignment a WHERE a.assignmentEnd = :assignmentEnd")})
public class Assignment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "ASSIGNMENT_ID")
    private Integer assignmentId;
    @Column(name = "ASSIGNMENT_NAME")
    private String assignmentName;
    @Lob
    @Column(name = "ASSIGNMENT_FILE")
    private byte[] assignmentFile;
    @Lob
    @Column(name = "ASSIGNMENT_NOTES")
    private String assignmentNotes;
    @Column(name = "ASSIGNMENT_START")
    @Temporal(TemporalType.TIMESTAMP)
    private Date assignmentStart;
    @Column(name = "ASSIGNMENT_END")
    @Temporal(TemporalType.TIMESTAMP)
    private Date assignmentEnd;
    @JoinColumn(name = "COURSE_ID", referencedColumnName = "COURSE_ID")
    @ManyToOne
    private Course courseId;
    @OneToMany(mappedBy = "assignmentId")
    private Collection<UploadAssignment> uploadAssignmentCollection;

    public Assignment() {
    }

    public Assignment(Integer assignmentId) {
        this.assignmentId = assignmentId;
    }

    public Integer getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Integer assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public byte[] getAssignmentFile() {
        return assignmentFile;
    }

    public void setAssignmentFile(byte[] assignmentFile) {
        this.assignmentFile = assignmentFile;
    }

    public String getAssignmentNotes() {
        return assignmentNotes;
    }

    public void setAssignmentNotes(String assignmentNotes) {
        this.assignmentNotes = assignmentNotes;
    }

    public Date getAssignmentStart() {
        return assignmentStart;
    }

    public void setAssignmentStart(Date assignmentStart) {
        this.assignmentStart = assignmentStart;
    }

    public Date getAssignmentEnd() {
        return assignmentEnd;
    }

    public void setAssignmentEnd(Date assignmentEnd) {
        this.assignmentEnd = assignmentEnd;
    }

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }

    @XmlTransient
    public Collection<UploadAssignment> getUploadAssignmentCollection() {
        return uploadAssignmentCollection;
    }

    public void setUploadAssignmentCollection(Collection<UploadAssignment> uploadAssignmentCollection) {
        this.uploadAssignmentCollection = uploadAssignmentCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (assignmentId != null ? assignmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Assignment)) {
            return false;
        }
        Assignment other = (Assignment) object;
        if ((this.assignmentId == null && other.assignmentId != null) || (this.assignmentId != null && !this.assignmentId.equals(other.assignmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Assignment[ assignmentId=" + assignmentId + " ]";
    }
    
}
