package com.tensquare.tensquare_base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 城市
 * </p>
 *
 * @author liushuo
 * @since 2019-06-08
 */
@Data
@TableName("tb_city")
public class TbCity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private String id;
    /**
     * 城市名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 是否热门
     */
    @TableField(value = "ishot")
    private String ishot;


}
