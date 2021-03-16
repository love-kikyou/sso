package com.cjs.sso.mapper;/*
 *@author
 *@data
 *
 */

import com.cjs.sso.entity.SysRolePermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysRolePermissionMapper {
   // @Select("SELECT * FROM sys_role_permission WHERE role_id IN (#{roleIds})")
    List<SysRolePermission> findByRoleIds(List<Integer> roleIds);
}
