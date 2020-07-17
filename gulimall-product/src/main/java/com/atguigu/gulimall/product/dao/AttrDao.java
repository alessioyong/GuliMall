package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author alessio
 * @email alessio@gmail.com
 * @date 2020-06-26 14:42:46
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
