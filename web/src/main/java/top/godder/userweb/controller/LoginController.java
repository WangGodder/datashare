package top.godder.userweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.godder.dataapi.entry.UserTk;

import javax.servlet.http.HttpSession;

/**
 * @author: godder
 * @date: 2019/3/21
 */
@Controller
public class LoginController {
    @RequestMapping(value = "/")
    public String login(HttpSession session) {
        UserTk user = new UserTk();
        user.setId(11L);
        session.setAttribute("user", user);
        return "login";
    }
}
