package top.godder.dataapi.entry;

import javax.persistence.Column;
import javax.persistence.Id;

public class Province {
    @Id
    @Column(name = "province_id")
    private Integer provinceId;

    /**
     * 省份名称
     */
    private String name;

    /**
     * 省份信息
     */
    private String comment;

    /**
     * @return province_id
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * @param provinceId
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 获取省份名称
     *
     * @return name - 省份名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置省份名称
     *
     * @param name 省份名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取省份信息
     *
     * @return comment - 省份信息
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置省份信息
     *
     * @param comment 省份信息
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}