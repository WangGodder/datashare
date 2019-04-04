package top.godder.userservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.godder.userapi.entry.UserTk;
import top.godder.userapi.service.Urls;
import top.godder.userapi.service.UserTkApi;
import top.godder.userservice.biz.UserTkBiz;
import top.godder.userservice.dao.UserTkDao;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author: godder
 * @date: 2019/4/3
 */
@RestController
public class UserTkRest implements UserTkApi {
    @Autowired
    private UserTkBiz userTkBiz;

    @Override
    @RequestMapping(value = Urls.UserTkApiUrl.LOGIN, method = POST)
    public Long login(@RequestBody UserTk userTk) {
        return userTkBiz.getUserId(userTk);
    }

    @Override
    @RequestMapping(value = Urls.UserTkApiUrl.REGISTER, method = POST)
    public boolean register(@RequestBody UserTk userTk) {
        return userTkBiz.register(userTk);
    }

    @Override
    @RequestMapping(value = Urls.UserTkApiUrl.UPDATE_USER_TK, method = POST)
    public boolean updatePs(@RequestBody Map<String, Object> userTkMap) {
        return userTkBiz.changeUserPs(userTkMap);
    }

    @Override
    @RequestMapping(value = Urls.UserTkApiUrl.DELETE_USER_TK, method = POST)
    public boolean deleteUserTk(@RequestBody UserTk userTk) {
        return userTkBiz.logout(userTk);
    }
}
