package top.godder.dataapi.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import top.godder.dataapi.entry.UserInfo;
import top.godder.dataapi.request.UserInfoReq;
import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.List;

/**
 * @author: godder
 * @date: 2019/3/31
 */
@FeignClient(value = "service-user", url = "${service.service-user}")
public interface UserInfoApi {
    @RequestMapping(value = UserUrls.UserInfoApiUrl.GET_USER_INFO, method = GET)
    UserInfo getUserInfo(@RequestBody Long id);

    @RequestMapping(value = UserUrls.UserInfoApiUrl.REQ_USER_INFO, method = GET)
    List<UserInfo> requestUserInfo(@RequestBody UserInfoReq req);

    @RequestMapping(value = UserUrls.UserInfoApiUrl.ADD_USER_INFO, method = POST)
    boolean addUserInfo(@RequestBody UserInfo userInfo);

    @RequestMapping(value = UserUrls.UserInfoApiUrl.UPDATE_USER_INFO, method = POST)
    boolean updateUserInfo(@RequestBody UserInfo userInfo);

    @RequestMapping(value = UserUrls.UserInfoApiUrl.DELETE_USER_INFO, method = DELETE)
    boolean deleteUserInfo(@RequestBody UserInfo userInfo);
}
