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
@Table(name = "upload_assignment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UploadAssignment.findAll", query = "SELECT u FROM UploadAssignment u"),
    @NamedQuery(name = "UploadAssignment.findByUploadId", query = "SELECT u FROM UploadAssignment u WHERE u.uploadId = :uploadId"),
    @NamedQuery(name = "UploadAssignment.findByUploadDate", query = "SELECT u FROM UploadAssignment u WHERE u.uploadDate = :uploadDate"),
    @NamedQuery(name = "UploadAssignment.findByScore", query = "SELECT u FROM UploadAssignment u WHERE u.score = :score")})
public class UploadAssignment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UPLOAD_ID")
    private Integer uploadId;
    @Lob
    @Column(name = "UPLOAD_FILE")
    private byte[] uploadFile;
    @Basic(optional = false)
    @Column(name = "UPLOAD_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uploadDate;
    @Column(name = "SCORE")
    private Integer score;
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    @ManyToOne
    private User id;
    @JoinColumn(name = "ASSIGNMENT_ID", referencedColumnName = "ASSIGNMENT_ID")
    @ManyToOne
    private Assignment assignmentId;

    public UploadAssignment() {
    }

    public UploadAssignment(Integer uploadId) {
        this.uploadId = uploadId;
    }

    public UploadAssignment(Integer uploadId, Date uploadDate) {
        this.uploadId = uploadId;
        this.uploadDate = uploadDate;
    }

    public Integer getUploadId() {
        return uploadId;
    }

    public void setUploadId(Integer uploadId) {
        this.uploadId = uploadId;
    }

    public byte[] getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(byte[] uploadFile) {
        this.uploadFile = uploadFile;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public User getId() {
        return id;
    }

    public void setId(User id) {
        this.id = id;
    }

    public Assignment getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Assignment assignmentId) {
        this.assignmentId = assignmentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uploadId != null ? uploadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UploadAssignment)) {
            return false;
        }
        UploadAssignment other = (UploadAssignment) object;
        if ((this.uploadId == null && other.uploadId != null) || (this.uploadId != null && !this.uploadId.equals(other.uploadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.UploadAssignment[ uploadId=" + uploadId + " ]";
    }
    
}
