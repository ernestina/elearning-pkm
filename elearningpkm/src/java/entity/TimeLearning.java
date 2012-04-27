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
@Table(name = "time_learning")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TimeLearning.findAll", query = "SELECT t FROM TimeLearning t"),
    @NamedQuery(name = "TimeLearning.findByTimeLearningId", query = "SELECT t FROM TimeLearning t WHERE t.timeLearningId = :timeLearningId"),
    @NamedQuery(name = "TimeLearning.findByTimeLearningName", query = "SELECT t FROM TimeLearning t WHERE t.timeLearningName = :timeLearningName"),
    @NamedQuery(name = "TimeLearning.findByTimeLearningStart", query = "SELECT t FROM TimeLearning t WHERE t.timeLearningStart = :timeLearningStart"),
    @NamedQuery(name = "TimeLearning.findByTimeLearningEnd", query = "SELECT t FROM TimeLearning t WHERE t.timeLearningEnd = :timeLearningEnd")})
public class TimeLearning implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "TIME_LEARNING_ID")
    private Integer timeLearningId;
    @Column(name = "TIME_LEARNING_NAME")
    private String timeLearningName;
    @Column(name = "TIME_LEARNING_START")
    @Temporal(TemporalType.DATE)
    private Date timeLearningStart;
    @Column(name = "TIME_LEARNING_END")
    @Temporal(TemporalType.DATE)
    private Date timeLearningEnd;
    @JoinColumn(name = "COURSE_ID", referencedColumnName = "COURSE_ID")
    @ManyToOne
    private Course courseId;
    @OneToMany(mappedBy = "timeLearningId")
    private Collection<Material> materialCollection;

    public TimeLearning() {
    }

    public TimeLearning(Integer timeLearningId) {
        this.timeLearningId = timeLearningId;
    }

    public Integer getTimeLearningId() {
        return timeLearningId;
    }

    public void setTimeLearningId(Integer timeLearningId) {
        this.timeLearningId = timeLearningId;
    }

    public String getTimeLearningName() {
        return timeLearningName;
    }

    public void setTimeLearningName(String timeLearningName) {
        this.timeLearningName = timeLearningName;
    }

    public Date getTimeLearningStart() {
        return timeLearningStart;
    }

    public void setTimeLearningStart(Date timeLearningStart) {
        this.timeLearningStart = timeLearningStart;
    }

    public Date getTimeLearningEnd() {
        return timeLearningEnd;
    }

    public void setTimeLearningEnd(Date timeLearningEnd) {
        this.timeLearningEnd = timeLearningEnd;
    }

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }

    @XmlTransient
    public Collection<Material> getMaterialCollection() {
        return materialCollection;
    }

    public void setMaterialCollection(Collection<Material> materialCollection) {
        this.materialCollection = materialCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (timeLearningId != null ? timeLearningId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TimeLearning)) {
            return false;
        }
        TimeLearning other = (TimeLearning) object;
        if ((this.timeLearningId == null && other.timeLearningId != null) || (this.timeLearningId != null && !this.timeLearningId.equals(other.timeLearningId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TimeLearning[ timeLearningId=" + timeLearningId + " ]";
    }
    
}
