package com.javashitang.part1.mapper;

import com.javashitang.part1.pojo.Role;
import com.javashitang.part1.pojo.RoleParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {

    public Role getRole(long id);
    public Role getRole2(RoleParam roleParam);
    public List<Role> getRole3(String roleName);
    public int deleteRole(long id);
    public int insertRole(Role role);
    public List<Role> findRoles(@Param("roleName") String roleName);
    public List<Role> findRoles2(Role role);
    public List<Role> findRoles3(List<Integer> idList);
    public List<Role> findRoles4(@Param("type") String str);
    public int updateRole(Role role);
}
