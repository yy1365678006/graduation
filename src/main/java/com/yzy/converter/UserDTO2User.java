package com.yzy.converter;

import com.yzy.DTO.UserDTO;
import com.yzy.dao.User;

public class UserDTO2User {

    public static User converter(UserDTO userDTO){
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        return user;
    }

}
