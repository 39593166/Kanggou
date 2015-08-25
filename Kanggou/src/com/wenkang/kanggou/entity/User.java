package com.wenkang.kanggou.entity;

import java.io.Serializable;

/**
 * Created by Lenovo on 2015/8/24.
 */
public class User implements Serializable {
    private String userName;
    private String nickName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
