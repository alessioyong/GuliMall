package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author alessio
 * @email alessio@gmail.com
 * @date 2020-06-26 15:34:57
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
