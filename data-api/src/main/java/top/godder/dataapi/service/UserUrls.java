package top.godder.dataapi.service;

/**
 * @author: godder
 * @date: 2019/3/17
 */

/**
 * 用于存放User Api的url地址
 */
public class UserUrls {
    public static class UserTkApiUrl {
        public static final String LOGIN = "/login";
        public static final String REGISTER = "/register";
        public static final String UPDATE_USER_TK = "/changeps";
        public static final String DELETE_USER_TK = "/logout";
    }

    public static class UserInfoApiUrl {
        public static final String GET_USER_INFO = "/user/userInfo";
        public static final String REQ_USER_INFO = "/user/userInfoReq";
        public static final String UPDATE_USER_INFO = "/user/updateUserInfo";
        public static final String ADD_USER_INFO = "/user/addUserInfo";
        public static final String DELETE_USER_INFO = "/user/deleteUserInfo";
    }
}
