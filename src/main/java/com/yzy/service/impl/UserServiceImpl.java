package com.yzy.service.impl;

import com.yzy.dao.User;
import com.yzy.enums.UserEnum;
import com.yzy.exception.MyException;
import com.yzy.mapper.UserMapper;
import com.yzy.service.UserService;
import com.yzy.utils.UserIdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void regist(User user,Integer security) {

        if (userMapper.findByEmail(user.getEmail()) == null) {
            user.setId(UserIdUtil.getUserId());
            user.setSecurity(security);
            user.setRegistTime(new Date());
            userMapper.addUser(user);
        }else {
            throw new MyException(UserEnum.EMAIL_ALREADY_EXIST);
        }
    }


    @Override
    public Boolean login(String email, String password) {
        return null;
    }
}
