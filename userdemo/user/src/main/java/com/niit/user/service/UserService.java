package com.niit.user.service;


import com.niit.user.domain.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {

    List<User> getAllUserInfo();

    User getUserByNameAndPwd(String name, String pwd);

    boolean getUserByName(String name);

    boolean saveAddInfo(User user);

    User getUserById(Integer id);

    boolean updateEditInfoByID(User user);

    boolean deleteInfoById(Integer id);

    String setImg(MultipartFile file);
}
