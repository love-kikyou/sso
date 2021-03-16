package com.cjs.sso.mapper;/*
 *@author
 *@data
 *
 */

import com.cjs.sso.entity.SysPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "sysPermissionMapper")
public interface SysPermissionMapper {
   // @Select("SELECT * FROM sys_permission WHERE id IN (#{ids})")
    List<SysPermission> findByIds(List<Integer> ids);
}
