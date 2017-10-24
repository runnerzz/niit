package com.niit.user.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.niit.user.domain.User;
import com.niit.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;


@Controller
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 初始化数据
     * @param request
     * @return
     */
    @GetMapping("/index")
    public String index(HttpServletRequest request){
        List<User> allUserInfo = userService.getAllUserInfo();
        request.getSession().setAttribute("allUserInfo",allUserInfo);
        return "index";
    }

    /**
     * 登录
     * @param name
     * @param pwd
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestParam(value = "username") String name,@RequestParam(value = "password")
                      String pwd,HttpServletRequest request){
        User loginUser = userService.getUserByNameAndPwd(name,pwd);
        if(loginUser!=null){
            request.getSession().setAttribute("loginUser",loginUser);
            return "OK";
        }
        return "NO";
    }

    /**
     * 注销登录
     * @param request
     * @return
     */
    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        request.getSession().removeAttribute("loginUser");
        return "index";
    }
    /**
     * 检查名称是否重复
     * @param name
     * @return
     */
    @PostMapping("/checkName")
    @ResponseBody
    public String checkName(String name){
        boolean reslut = userService.getUserByName(name);
        //reslut=true不存在，false是存在
        return reslut==true?"OK":"NO";
    }
    /**
     * 添加信息
     * @param user
     * @return
     */
    @PostMapping("/saveAddInfo")
    @ResponseBody
    public String saveAddInfo(User user){
        System.out.println(user);
        boolean result = userService.saveAddInfo(user);
        return result?"OK":"NO";
    }

    /**
     * 编辑信息
     * @param id
     * @return
     */
    @PostMapping("/editInfo")
    @ResponseBody
    public User editInfo(@RequestParam(value = "id") Integer id,HttpServletRequest request){
        User user = userService.getUserById(id);
        user.setMobile(user.getMobilePhone());
        return user;
    }
    /**
     * 添加信息
     * @param user
     * @return
     */
    @PostMapping("/updateEditInfoByID")
    @ResponseBody
    public String updateEditInfoByID(User user){
        boolean result = userService.updateEditInfoByID(user);
        return result?"OK":"NO";
    }
    /**
     * 删除信息
     * @param id
     * @return
     */
    @PostMapping("/deleteInfoById")
    @ResponseBody
    public String deleteInfoById(@RequestParam(value = "id") Integer id){
        boolean result = userService.deleteInfoById(id);
        return result?"OK":"NO";
    }

    /**
     * 上传图片
     * @param file
     * @param request
     * @return
     */
    @PostMapping("/setImg")
    @ResponseBody
    public String setImg(@RequestParam(value="file",required=false)MultipartFile file,
                         HttpServletRequest request){
        String fileName = userService.setImg(file);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("fileName", fileName);
        ObjectMapper mapper = new ObjectMapper();
        try {
            fileName = mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return fileName;
    }

}
