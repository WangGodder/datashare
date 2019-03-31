package top.godder.dataapi.entry;

import javax.persistence.Column;
import javax.persistence.Id;

public class Field {
    @Id
    @Column(name = "field_id")
    private Long fieldId;

    /**
     * 领域名称
     */
    @Column(name = "field_name")
    private String fieldName;

    /**
     * 领域级别，数字越小级别越高
     */
    @Column(name = "field_level")
    private Integer fieldLevel;

    /**
     * 包含下级领域id，用,隔开
     */
    @Column(name = "sub_fields")
    private String subFields;

    /**
     * 领域介绍
     */
    private String introduction;

    /**
     * @return field_id
     */
    public Long getFieldId() {
        return fieldId;
    }

    /**
     * @param fieldId
     */
    public void setFieldId(Long fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * 获取领域名称
     *
     * @return field_name - 领域名称
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * 设置领域名称
     *
     * @param fieldName 领域名称
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    /**
     * 获取领域级别，数字越小级别越高
     *
     * @return field_level - 领域级别，数字越小级别越高
     */
    public Integer getFieldLevel() {
        return fieldLevel;
    }

    /**
     * 设置领域级别，数字越小级别越高
     *
     * @param fieldLevel 领域级别，数字越小级别越高
     */
    public void setFieldLevel(Integer fieldLevel) {
        this.fieldLevel = fieldLevel;
    }

    /**
     * 获取包含下级领域id，用,隔开
     *
     * @return sub_fields - 包含下级领域id，用,隔开
     */
    public String getSubFields() {
        return subFields;
    }

    /**
     * 设置包含下级领域id，用,隔开
     *
     * @param subFields 包含下级领域id，用,隔开
     */
    public void setSubFields(String subFields) {
        this.subFields = subFields == null ? null : subFields.trim();
    }

    /**
     * 获取领域介绍
     *
     * @return introduction - 领域介绍
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置领域介绍
     *
     * @param introduction 领域介绍
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}