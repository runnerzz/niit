package com.niit.user.service.impl;

import com.niit.user.dao.UserDao;
import com.niit.user.domain.User;
import com.niit.user.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getAllUserInfo() {
        return userDao.getAllUserInfo();
    }

    @Override
    public User getUserByNameAndPwd(String name, String pwd) {
        User user=userDao.getUserByNameAndPwd(name,pwd);
        return user;
    }

    @Override
    public boolean getUserByName(String name) {
        User user = userDao.getUserByName(name);
        if (user == null)
            return true;
        return false;
    }

    @Override
    public boolean saveAddInfo(User user) {
        Integer result = userDao.saveAddInfo(user);
        if(result!=null)
            if(result>0) return true;
        return false;
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public boolean updateEditInfoByID(User user) {
        Integer result = userDao.updateEditInfoByID(user);
        if(result!=null)
            if(result>0) return true;
        return false;
    }

    @Override
    public boolean deleteInfoById(Integer id) {
        Integer result = userDao.deleteInfoById(id);
        if (result!=null)
            if(result>0) return true;
        return false;
    }

    @Override
    public String setImg(MultipartFile file) {
        //获取图片的文件名
        String oFileName = file.getOriginalFilename();
        // 获取图片的扩展名
        String extensionName = StringUtils.substringAfter(oFileName, ".");
        //设置新的图片名称
        String fileName= UUID.randomUUID().toString().replaceAll("-","")+"."+extensionName;
        if(file.isEmpty()){
            return "NO";
        }
        File targetFile=new File("D:/niit/userdemo/user/target/images/",fileName);
        try {
            file.transferTo(targetFile);
        } catch (IOException e) {
            return "NO";
        }
        return fileName;
    }
}
