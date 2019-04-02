package top.godder.dataapi.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author: godder
 * @date: 2019/4/1
 */
@Setter
@Getter
public class QuestionReq implements Serializable {
    private String questionName;
    private Long userId;
    private Long fieldId;
    private String fileId;
}
