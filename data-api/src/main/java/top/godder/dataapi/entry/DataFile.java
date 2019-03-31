package top.godder.dataapi.entry;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "file")
public class DataFile {
    /**
     * 上传文件ID
     */
    @Id
    @Column(name = "file_id")
    private Long fileId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "file_name")
    private String fileName;

    /**
     * 文件上传时间
     */
    @Column(name = "upload_time")
    private Date uploadTime;

    /**
     * 文件所属领域
     */
    @Column(name = "field_id")
    private Long fieldId;

    /**
     * 文件相关介绍
     */
    private String introduction;

    /**
     * 获取上传文件ID
     *
     * @return file_id - 上传文件ID
     */
    public Long getFileId() {
        return fileId;
    }

    /**
     * 设置上传文件ID
     *
     * @param fileId 上传文件ID
     */
    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return file_name
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * 获取文件上传时间
     *
     * @return upload_time - 文件上传时间
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * 设置文件上传时间
     *
     * @param uploadTime 文件上传时间
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * 获取文件所属领域
     *
     * @return field_id - 文件所属领域
     */
    public Long getFieldId() {
        return fieldId;
    }

    /**
     * 设置文件所属领域
     *
     * @param fieldId 文件所属领域
     */
    public void setFieldId(Long fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * 获取文件相关介绍
     *
     * @return introduction - 文件相关介绍
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置文件相关介绍
     *
     * @param introduction 文件相关介绍
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}