package top.godder.userweb.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author: godder
 * @date: 2019/3/21
 */
@Controller
@RequestMapping(value = "/user")
public class LoginPageController {

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/signUp")
    public String register() {
        return "register";
    }
}
