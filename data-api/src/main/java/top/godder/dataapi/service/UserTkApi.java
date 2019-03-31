package top.godder.dataapi.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import top.godder.dataapi.entry.UserTk;

/**
 * @author: godder
 * @date: 2019/3/30
 */
@FeignClient(value = "service-user", url = "${service.service-user}")
public interface UserTkApi {
    @RequestMapping(value = UserUrls.UserTkApiUrl.LOGIN, method = POST)
    Integer getUserTk(@RequestBody UserTk userTk);

    @RequestMapping(value = UserUrls.UserTkApiUrl.REGISTER, method = POST)
    boolean addUserTk(@RequestBody UserTk userTk);

    @RequestMapping(value = UserUrls.UserTkApiUrl.UPDATE_USER_TK, method = POST)
    boolean updateUserTk(@RequestBody UserTk userTk);

    @RequestMapping(value = UserUrls.UserTkApiUrl.DELETE_USER_TK, method = POST)
    boolean deleteUserTk(@RequestBody UserTk userTk);
}
