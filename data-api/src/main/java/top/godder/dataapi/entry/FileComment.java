package top.godder.dataapi.entry;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "file_comment")
public class FileComment {
    @Id
    @Column(name = "file_comment_id")
    private Long fileCommentId;

    /**
     * 评论文件
     */
    @Column(name = "file_id")
    private Long fileId;

    /**
     * 评论人
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 评论时间
     */
    @Column(name = "comment_date")
    private Date commentDate;

    /**
     * 评论内容
     */
    private String comment;

    /**
     * 评论分数（5-1分）
     */
    @Column(name = "comment_level")
    private Integer commentLevel;

    /**
     * @return file_comment_id
     */
    public Long getFileCommentId() {
        return fileCommentId;
    }

    /**
     * @param fileCommentId
     */
    public void setFileCommentId(Long fileCommentId) {
        this.fileCommentId = fileCommentId;
    }

    /**
     * 获取评论文件
     *
     * @return file_id - 评论文件
     */
    public Long getFileId() {
        return fileId;
    }

    /**
     * 设置评论文件
     *
     * @param fileId 评论文件
     */
    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    /**
     * 获取评论人
     *
     * @return user_id - 评论人
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置评论人
     *
     * @param userId 评论人
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取评论时间
     *
     * @return comment_date - 评论时间
     */
    public Date getCommentDate() {
        return commentDate;
    }

    /**
     * 设置评论时间
     *
     * @param commentDate 评论时间
     */
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    /**
     * 获取评论内容
     *
     * @return comment - 评论内容
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置评论内容
     *
     * @param comment 评论内容
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * 获取评论分数（5-1分）
     *
     * @return comment_level - 评论分数（5-1分）
     */
    public Integer getCommentLevel() {
        return commentLevel;
    }

    /**
     * 设置评论分数（5-1分）
     *
     * @param commentLevel 评论分数（5-1分）
     */
    public void setCommentLevel(Integer commentLevel) {
        this.commentLevel = commentLevel;
    }
}