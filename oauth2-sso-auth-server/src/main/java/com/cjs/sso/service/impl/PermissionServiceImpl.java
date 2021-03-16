package com.cjs.sso.service.impl;

import com.cjs.sso.entity.SysPermission;
import com.cjs.sso.entity.SysRolePermission;
import com.cjs.sso.entity.SysUserRole;
import com.cjs.sso.mapper.SysPermissionMapper;
import com.cjs.sso.mapper.SysRolePermissionMapper;
import com.cjs.sso.mapper.SysUserRoleMapper;
import com.cjs.sso.repository.SysPermissionRepository;
import com.cjs.sso.repository.SysRolePermissionRepository;
import com.cjs.sso.repository.SysUserRoleRepository;
import com.cjs.sso.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ChengJianSheng
 * @date 2019-02-12
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    /**
     * 偷懒少写两个Service
     */
//    @Autowired
//    private SysUserRoleRepository sysUserRoleRepository;
//    @Autowired
//    private SysRolePermissionRepository sysRolePermissionRepository;
//    @Autowired
//    private SysPermissionRepository sysPermissionRepository;


    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;
    @Autowired
    private SysRolePermissionMapper sysRolePermissionMapper;
    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public List<SysPermission> findByUserId(Integer userId) {
        List<SysUserRole> sysUserRoleList = sysUserRoleMapper.findByUserId(userId);
        System.out.println(sysUserRoleList);
        if (CollectionUtils.isEmpty(sysUserRoleList)) {
            return null;
        }
        List<Integer> roleIdList = sysUserRoleList.stream().map(SysUserRole::getRoleId).collect(Collectors.toList());
        List<SysRolePermission> rolePermissionList = sysRolePermissionMapper.findByRoleIds(roleIdList);
        if (CollectionUtils.isEmpty(rolePermissionList)) {
            return null;
        }
        List<Integer> permissionIdList = rolePermissionList.stream().map(SysRolePermission::getPermissionId).distinct().collect(Collectors.toList());
        List<SysPermission> sysPermissionList = sysPermissionMapper.findByIds(permissionIdList);
        if (CollectionUtils.isEmpty(sysPermissionList)) {
            return null;
        }
        return sysPermissionList;
    }
}
