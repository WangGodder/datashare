package top.godder.common.util;

import org.junit.Test;
import top.godder.common.result.ErrorResult;
import top.godder.common.result.JsonResult;
import top.godder.common.result.ResultBase;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author: godder
 * @date: 2019/4/5
 */
public class DIUtilTest {

    @Test
    public void createByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 2);
//        map.put("newPs", "123");
        map.put("message", "this is message");
        try {
            ErrorResult resultBase = DIUtil.createByMap(map, ErrorResult.class);
            System.out.println(resultBase.getCode());
            System.out.println(resultBase.getMessage());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}