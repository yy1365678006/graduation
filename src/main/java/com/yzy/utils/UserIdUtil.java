package com.yzy.utils;

import java.util.UUID;

public class UserIdUtil {
    public static String getUserId(){
        String id = UUID.randomUUID().toString() + System.currentTimeMillis();
        return id;
    }

}
