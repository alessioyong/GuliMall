package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author alessio
 * @email alessio@gmail.com
 * @date 2020-06-26 15:12:04
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
