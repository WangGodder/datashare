package top.godder.userapi.entry;

import javax.persistence.Column;
import javax.persistence.Id;

public class City {
    @Id
    @Column(name = "city_id")
    private Integer cityId;

    /**
     * 城市名称
     */
    private String name;

    /**
     * 上级省份id
     */
    @Column(name = "province_id")
    private Integer provinceId;

    /**
     * 城市信息
     */
    private String comment;

    /**
     * @return city_id
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * @param cityId
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取城市名称
     *
     * @return name - 城市名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置城市名称
     *
     * @param name 城市名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取上级省份id
     *
     * @return province_id - 上级省份id
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * 设置上级省份id
     *
     * @param provinceId 上级省份id
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 获取城市信息
     *
     * @return comment - 城市信息
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置城市信息
     *
     * @param comment 城市信息
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}