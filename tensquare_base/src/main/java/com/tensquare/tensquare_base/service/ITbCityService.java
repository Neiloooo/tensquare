package com.tensquare.tensquare_base.service;

import com.tensquare.tensquare_base.entity.TbCity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 城市 服务类
 * </p>
 *
 * @author liushuo
 * @since 2019-06-08
 */
public interface ITbCityService  {

    TbCity getTbCityById(String uuid);

}
