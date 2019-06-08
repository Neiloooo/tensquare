package entity;

import lombok.Data;

/**
 * 创建最终返回对象
 */
@Data
public class Result {

        private boolean flag;
        private Integer code;
        private String message;
        private Object data;

}
