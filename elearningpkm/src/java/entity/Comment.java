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
import javax.persistence.Id;
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
@Table(name = "comment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comment.findAll", query = "SELECT c FROM Comment c"),
    @NamedQuery(name = "Comment.findByCommentId", query = "SELECT c FROM Comment c WHERE c.commentId = :commentId"),
    @NamedQuery(name = "Comment.findByCommentBody", query = "SELECT c FROM Comment c WHERE c.commentBody = :commentBody"),
    @NamedQuery(name = "Comment.findByCommentCreated", query = "SELECT c FROM Comment c WHERE c.commentCreated = :commentCreated"),
    @NamedQuery(name = "Comment.findByCommentSender", query = "SELECT c FROM Comment c WHERE c.commentSender = :commentSender")})
public class Comment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COMMENT_ID")
    private Integer commentId;
    @Column(name = "COMMENT_BODY")
    private String commentBody;
    @Basic(optional = false)
    @Column(name = "COMMENT_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date commentCreated;
    @Column(name = "COMMENT_SENDER")
    private String commentSender;

    public Comment() {
    }

    public Comment(Integer commentId) {
        this.commentId = commentId;
    }

    public Comment(Integer commentId, Date commentCreated) {
        this.commentId = commentId;
        this.commentCreated = commentCreated;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }

    public Date getCommentCreated() {
        return commentCreated;
    }

    public void setCommentCreated(Date commentCreated) {
        this.commentCreated = commentCreated;
    }

    public String getCommentSender() {
        return commentSender;
    }

    public void setCommentSender(String commentSender) {
        this.commentSender = commentSender;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (commentId != null ? commentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comment)) {
            return false;
        }
        Comment other = (Comment) object;
        if ((this.commentId == null && other.commentId != null) || (this.commentId != null && !this.commentId.equals(other.commentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Comment[ commentId=" + commentId + " ]";
    }
    
}
