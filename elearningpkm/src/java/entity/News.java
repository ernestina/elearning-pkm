/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Accio
 */
@Entity
@Table(name = "news")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "News.findAll", query = "SELECT n FROM News n"),
    @NamedQuery(name = "News.findByNewsId", query = "SELECT n FROM News n WHERE n.newsId = :newsId"),
    @NamedQuery(name = "News.findByNewsTitle", query = "SELECT n FROM News n WHERE n.newsTitle = :newsTitle"),
    @NamedQuery(name = "News.findByNewsCreated", query = "SELECT n FROM News n WHERE n.newsCreated = :newsCreated"),
    @NamedQuery(name = "News.findByNewsUpdated", query = "SELECT n FROM News n WHERE n.newsUpdated = :newsUpdated")})
public class News implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "NEWS_ID")
    private Integer newsId;
    @Column(name = "NEWS_TITLE")
    private String newsTitle;
    @Lob
    @Column(name = "NEWS_BODY")
    private String newsBody;
    @Basic(optional = false)
    @Column(name = "NEWS_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date newsCreated;
    @Column(name = "NEWS_UPDATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date newsUpdated;
    @JoinColumn(name = "ADMIN_ID", referencedColumnName = "ADMIN_ID")
    @ManyToOne
    private Admin adminId;

    public News() {
    }

    public News(Integer newsId) {
        this.newsId = newsId;
    }

    public News(Integer newsId, Date newsCreated) {
        this.newsId = newsId;
        this.newsCreated = newsCreated;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsBody() {
        return newsBody;
    }

    public void setNewsBody(String newsBody) {
        this.newsBody = newsBody;
    }

    public Date getNewsCreated() {
        return newsCreated;
    }

    public void setNewsCreated(Date newsCreated) {
        this.newsCreated = newsCreated;
    }

    public Date getNewsUpdated() {
        return newsUpdated;
    }

    public void setNewsUpdated(Date newsUpdated) {
        this.newsUpdated = newsUpdated;
    }

    public Admin getAdminId() {
        return adminId;
    }

    public void setAdminId(Admin adminId) {
        this.adminId = adminId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (newsId != null ? newsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof News)) {
            return false;
        }
        News other = (News) object;
        if ((this.newsId == null && other.newsId != null) || (this.newsId != null && !this.newsId.equals(other.newsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.News[ newsId=" + newsId + " ]";
    }
    
}
