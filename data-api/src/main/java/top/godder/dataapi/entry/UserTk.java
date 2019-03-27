package top.godder.dataapi.entry;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user_tk")
public class UserTk {
    @Id
    private Long id;

    private String userName;

    private String userPs;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return userPs
     */
    public String getUserPs() {
        return userPs;
    }

    /**
     * @param userPs
     */
    public void setUserPs(String userPs) {
        this.userPs = userPs == null ? null : userPs.trim();
    }
}