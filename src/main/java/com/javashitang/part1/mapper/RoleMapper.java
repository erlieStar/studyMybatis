package com.javashitang.part1.mapper;

import com.javashitang.part1.pojo.Role;
import com.javashitang.part1.pojo.RoleParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {

    Role getRole(long id);

    Role getRole2(RoleParam roleParam);

    List<Role> getRole3(String roleName);

    int deleteRole(long id);

    int insertRole(Role role);

    List<Role> findRoles(@Param("roleName") String roleName);

    List<Role> findRoles2(Role role);

    List<Role> findRoles3(List<Integer> idList);

    List<Role> findRoles4(@Param("type") String str);

    List<Role> findAllRoles();

    int updateRole(Role role);
}
