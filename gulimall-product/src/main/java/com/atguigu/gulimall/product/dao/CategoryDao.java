package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author alessio
 * @email alessio@gmail.com
 * @date 2020-06-26 14:42:46
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
