package com.tensquare.tensquare_base.controller;


import com.tensquare.tensquare_base.entity.TbCity;
import com.tensquare.tensquare_base.service.ITbCityService;
import entity.ResponseVO;
import entity.Result;
import entity.StatusCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 城市 前端控制器
 * </p>
 *
 * @author liushuo
 * @since 2019-06-08
 */
@RestController
@RequestMapping("/label")
@CrossOrigin
public class TbCityController {
    @Autowired
    private ITbCityService iTbCityService;

    @GetMapping("/{labelId}")
    public ResponseVO findById(@PathVariable("labelId") String id){
        TbCity tbCityById = iTbCityService.getTbCityById(id);
       return  ResponseVO.success(tbCityById);
    }
}
