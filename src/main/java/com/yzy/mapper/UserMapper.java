package com.yzy.mapper;

import com.yzy.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface UserMapper {

    Boolean addUser(User user);
    User findByEmail(String email);

}
