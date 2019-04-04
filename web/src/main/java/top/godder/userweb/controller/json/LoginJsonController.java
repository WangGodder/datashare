package top.godder.userweb.controller.json;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.godder.common.result.JsonResult;
import top.godder.userapi.entry.UserInfo;
import top.godder.userapi.entry.UserTk;
import top.godder.userapi.service.Errors;
import top.godder.userapi.service.UserInfoApi;
import top.godder.userapi.service.UserTkApi;

import javax.servlet.http.HttpSession;

/**
 * @author: godder
 * @date: 2019/4/3
 */
@RestController
@RequestMapping(value = "/user")
public class LoginJsonController {
    @Autowired
    private UserTkApi userTkApi;
    @Autowired
    private UserInfoApi userInfoApi;

    @RequestMapping(value = "/verify")
    public JsonResult verify(@RequestBody UserTk userTk, HttpSession session) {
        Long userId = userTkApi.login(userTk);
        if (userId  == -1) {
            return JsonResult.fail(Errors.userLogin);
        }
        UserInfo userInfo = userInfoApi.getUserInfo(userId);
        session.setAttribute("userInfo", userInfo);
        return JsonResult.success(userInfo);
    }

    @RequestMapping(value = "/register")
    public JsonResult register(@RequestBody UserTk userTk) {
        boolean success = userTkApi.register(userTk);
        if (!success) {
            return JsonResult.fail(Errors.userRegister);
        }
        return JsonResult.success();
    }

    @RequestMapping(value = "/addUserInfo")
    public JsonResult addUserInfo(@RequestBody UserInfo userInfo) {
        boolean success = userInfoApi.addUserInfo(userInfo);
        if (!success) {
            return JsonResult.fail(Errors.userInfoAdd);
        }
        return JsonResult.success();
    }
}
