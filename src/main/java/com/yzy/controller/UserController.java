package com.yzy.controller;

import com.yzy.DTO.ResultDTO;
import com.yzy.DTO.UserDTO;
import com.yzy.converter.UserDTO2User;
import com.yzy.dao.User;
import com.yzy.service.UserService;
import com.yzy.utils.ResultDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.xml.transform.Result;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/buyerRegist")
    public ResultDTO buyerRegist(@Valid UserDTO userDTO){
        User user = UserDTO2User.converter(userDTO);
        regist(user,1);
        return ResultDTOUtil.SUCCESS();
    }

    @PostMapping("/sellerRegist")
    public ResultDTO sellerRegist(@Valid UserDTO userDTO){
        User user = UserDTO2User.converter(userDTO);
        regist(user,0);
        return ResultDTOUtil.SUCCESS();
    }

    private void regist(User user,Integer security){
        userService.regist(user,security);
    }


}
