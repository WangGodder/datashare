package top.godder.userservice.biz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.godder.userapi.entry.UserTk;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author: godder
 * @date: 2019/4/4
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@Import(UserTkBiz.class)
public class UserTkBizTest {
    @Autowired
    private UserTkBiz biz;

    @Test
    public void getUserId() {
        UserTk userTk = new UserTk();
        userTk.setUserName("Godder");
        userTk.setUserPs("godder");
        Long userId = biz.getUserId(userTk);
        Assert.assertEquals(4L, (long)userId);
    }

    @Test
    public void register() {
        UserTk userTk = new UserTk();
        userTk.setUserName("Admin");
        userTk.setUserPs("admin");
        assertTrue(biz.register(userTk));
    }

    @Test
    public void changeUserPs() {
        UserTk userTk = new UserTk();
        Map<String, Object> map = new HashMap<>();
        map.put("userName", "Admin");
        map.put("userPs", "admin");
        map.put("newPs", "123456");
        assertTrue(biz.changeUserPs(map));
    }

    @Test
    public void logout() {
        UserTk userTk = new UserTk();
        userTk.setUserName("godder");
        userTk.setUserPs("godder");
        userTk.setId(1l);
        biz.logout(userTk);
    }
}