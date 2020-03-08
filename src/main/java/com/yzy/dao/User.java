package com.yzy.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;  //用户id
    private String name; //用户昵称
    private String password;  //密码
    private String email; //邮箱
    private Date registTime;  //注册时间
    private Integer security; //用户权限
}
