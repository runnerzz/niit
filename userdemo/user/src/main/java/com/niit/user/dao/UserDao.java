package com.niit.user.dao;

import com.niit.user.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> getAllUserInfo();

    /**
     * 根据用户名和密码查询用户
     * @param name
     * @param pwd
     * @return
     */
    User getUserByNameAndPwd(@Param("name") String name,@Param("pwd") String pwd);

    /**
     * 通过用户名查询用户
     * @param name
     * @return
     */
    User getUserByName(String name);

    /**
     * 插入数据
     * @param user
     * @return
     */
    Integer saveAddInfo(User user);

    /**
     * 通过ID查询数据
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 通过ID更新数据
     * @param user
     * @return
     */
    Integer updateEditInfoByID(User user);

    /**
     * 通过ID删除数据
     * @param id
     * @return
     */
    Integer deleteInfoById(Integer id);
}
