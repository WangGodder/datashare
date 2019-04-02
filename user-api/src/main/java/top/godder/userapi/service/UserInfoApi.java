package top.godder.userapi.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import top.godder.userapi.entry.UserInfo;
import top.godder.userapi.request.UserInfoReq;
import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.List;

/**
 * @author: godder
 * @date: 2019/3/31
 */
@FeignClient(value = "service-user", url = "${service.service-user}")
public interface UserInfoApi {
    @RequestMapping(value = Urls.UserInfoApiUrl.GET_USER_INFO, method = GET)
    UserInfo getUserInfo(@RequestBody Long id);

    @RequestMapping(value = Urls.UserInfoApiUrl.REQ_USER_INFO, method = GET)
    List<UserInfo> requestUserInfo(@RequestBody UserInfoReq req);

    @RequestMapping(value = Urls.UserInfoApiUrl.ADD_USER_INFO, method = POST)
    boolean addUserInfo(@RequestBody UserInfo userInfo);

    @RequestMapping(value = Urls.UserInfoApiUrl.UPDATE_USER_INFO, method = POST)
    boolean updateUserInfo(@RequestBody UserInfo userInfo);

    @RequestMapping(value = Urls.UserInfoApiUrl.DELETE_USER_INFO, method = DELETE)
    boolean deleteUserInfo(@RequestBody Long id);
}
