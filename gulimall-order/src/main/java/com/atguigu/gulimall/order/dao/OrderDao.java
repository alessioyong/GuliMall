package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author alessio
 * @email alessio@gmail.com
 * @date 2020-06-26 15:51:14
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
