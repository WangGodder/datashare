package top.godder.dataapi.entry;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "user_info")
public class UserInfo {
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户公司
     */
    private String company;

    /**
     * 所在省份
     */
    private Integer provinceId;

    /**
     * 所在城市
     */
    private Integer cityId;

    /**
     * 性别
     */
    private String gender;

    private Integer age;

    /**
     * 专业
     */
    private String major;

    /**
     * 自我介绍
     */
    private String introduce;

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
     * 获取用户公司
     *
     * @return company - 用户公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置用户公司
     *
     * @param company 用户公司
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * 获取所在省份
     *
     * @return provinceId - 所在省份
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * 设置所在省份
     *
     * @param provinceId 所在省份
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 获取所在城市
     *
     * @return cityId - 所在城市
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 设置所在城市
     *
     * @param cityId 所在城市
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取专业
     *
     * @return major - 专业
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置专业
     *
     * @param major 专业
     */
    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    /**
     * 获取自我介绍
     *
     * @return introduce - 自我介绍
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * 设置自我介绍
     *
     * @param introduce 自我介绍
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }
}