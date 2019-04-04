package top.godder.userapi.service;

import top.godder.common.result.ErrorResult;

/**
 * @author: godder
 * @date: 2019/4/3
 */
public class Errors {
    public static final ErrorResult userLogin = new ErrorResult(2, "user name or password is wrong");
    public static final ErrorResult userRegister = new ErrorResult(3, "user name has exist");
    public static final ErrorResult userInfoAdd = new ErrorResult(4, "user info add has wrong");
}
