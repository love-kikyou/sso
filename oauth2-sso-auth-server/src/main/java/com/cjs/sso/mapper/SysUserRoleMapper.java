package com.cjs.sso.mapper;/*
 *@author
 *@data
 *
 */

import com.cjs.sso.entity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "sysUserRoleMapper")
public interface SysUserRoleMapper {
    //@Select("select * from sys_user_role where user_id=#{userId}")
    List<SysUserRole> findByUserId(Integer userId);
}
