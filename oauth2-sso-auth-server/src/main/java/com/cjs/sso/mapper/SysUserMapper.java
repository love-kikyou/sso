package com.cjs.sso.mapper;/*
 *@author
 *@data
 *
 */

import com.cjs.sso.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "sysUserMapper")
public interface SysUserMapper {
   // @Select("select * from sys_user where  username=#{username}")
    SysUser findByUsername(String username);
}
