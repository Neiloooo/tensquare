package entity;

import lombok.Data;

import java.util.List;

/**
 * 创建最终分页对象返回值
 * @param <T>
 */
@Data
public class PageResult<T> {

    private long total; //z总页数
    private List<T> rows; //分页后的数据
}
