package top.godder.userservice.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;
import top.godder.common.util.DIUtil;
import top.godder.userapi.entry.UserTk;
import top.godder.userservice.dao.UserTkDao;

import top.godder.common.util.MD5;
import top.godder.userservice.mapper.UserTkMapper;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author: godder
 * @date: 2019/4/3
 */
@Service
public class UserTkBiz {
    @Autowired
    private UserTkDao userTkDao;

    public Long getUserId(UserTk userTk) {
        UserTk findUserTk = userTkDao.findUserTkByUserName(userTk.getUserName());
        if (MD5.md5Verify(userTk.getUserPs(), findUserTk.getUserPs())) {
            return findUserTk.getId();
        }
        return -1l;
    }

    public boolean register(UserTk userTk) {
        userTk.setUserPs(MD5.md5(userTk.getUserPs()));
        return userTkDao.addUserTk(userTk);
    }

    public boolean changeUserPs(Map<String, Object> userTkMap) {
        if (!userTkMap.containsKey("userName") || !userTkMap.containsKey("userPs") || !userTkMap.containsKey("newPs") ) {
            return false;
        }
        UserTk userTk = null;
        try {
            userTk = DIUtil.createByMap(userTkMap, UserTk.class);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        String newPs = (String)userTkMap.get("newPs");
        Long userId = getUserId(userTk);
        if (userId == -1l) {
            return false;
        }
        userTk.setUserPs(MD5.md5(newPs));
        userTk.setId(userId);
        return userTkDao.updateUserTk(userTk) == 1;
    }

    public boolean logout(UserTk userTk) {
        userTk.setUserPs(MD5.md5(userTk.getUserPs()));
        return userTkDao.deleteUserTk(userTk) == 1;
    }
}
