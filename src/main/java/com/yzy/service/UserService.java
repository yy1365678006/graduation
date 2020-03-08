package com.yzy.service;

import com.yzy.dao.User;

public interface UserService {

    void regist(User user,Integer security);
    Boolean login(String email,String password);

}
