package top.godder.dataapi.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author: godder
 * @date: 2019/3/31
 */
@Setter
@Getter
public class UserLocalInfoReq implements Serializable {
    private String name;
    private Integer beginCredit;
    private Integer endCredit;
}
