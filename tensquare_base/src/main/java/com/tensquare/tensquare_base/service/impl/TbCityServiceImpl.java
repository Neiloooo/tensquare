package com.tensquare.tensquare_base.service.impl;

import com.tensquare.tensquare_base.entity.TbCity;
import com.tensquare.tensquare_base.mapper.TbCityMapper;
import com.tensquare.tensquare_base.service.ITbCityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 城市 服务实现类
 * </p>
 *
 * @author liushuo
 * @since 2019-06-08
 */
@Service
public class TbCityServiceImpl implements ITbCityService {
    @Autowired
    private TbCityMapper tbCityMapper;
    @Override
    public TbCity getTbCityById(String uuid) {

        TbCity tbCity = tbCityMapper.selectById(uuid);

        return tbCity;
    }
}
