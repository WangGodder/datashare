package top.godder.userservice.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: godder
 * @date: 2019/3/18
 */
@RestController
@RequestMapping(value = "/test")
public class Test {
    @RequestMapping(value = "/test")
    public String test() {
        return "test";
    }
}
