package top.godder.userservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.godder.userapi.entry.UserInfo;
import top.godder.userapi.request.UserInfoReq;
import top.godder.userapi.service.Urls;
import top.godder.userapi.service.UserInfoApi;
import top.godder.userservice.biz.UserInfoBiz;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author: godder
 * @date: 2019/4/5
 */
@RestController
public class UserInfoRest implements UserInfoApi {
    @Autowired
    private UserInfoBiz biz;

    @Override
    @RequestMapping(value = Urls.UserInfoApiUrl.GET_USER_INFO, method = GET)
    public UserInfo getUserInfo(@RequestBody  Long id) {
        return biz.getUserInfoById(id);
    }

    @Override
    @RequestMapping(value = Urls.UserInfoApiUrl.GET_ALL_USER_INFO, method = GET)
    public List<UserInfo> getAllUserInfo() {
        return biz.getAllUserInfo();
    }

    @Override
    @RequestMapping(value = Urls.UserInfoApiUrl.REQ_USER_INFO, method = GET)
    public List<UserInfo> requestUserInfo(@RequestBody UserInfoReq req) {
        return biz.requestUserInfo(req);
    }

    @Override
    @RequestMapping(value = Urls.UserInfoApiUrl.ADD_USER_INFO, method = POST)
    public boolean addUserInfo(@RequestBody UserInfo userInfo) {
        return biz.addUserInfo(userInfo);
    }

    @Override
    @RequestMapping(value = Urls.UserInfoApiUrl.UPDATE_USER_INFO, method = POST)
    public boolean updateUserInfo(@RequestBody UserInfo userInfo) {
        return biz.updateUserInfo(userInfo);
    }

    @Override
    @RequestMapping(value = Urls.UserInfoApiUrl.DELETE_USER_INFO, method = DELETE)
    public boolean deleteUserInfo(@RequestBody Long id) {
        return biz.deleteUserInfo(id);
    }
}
