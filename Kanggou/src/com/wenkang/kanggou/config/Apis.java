package com.wenkang.kanggou.config;

import com.wenkang.kanggou.tool.net.Request;

/**
 * Created by Lenovo on 2015/8/25.
 */
public class Apis {
    static final int LOGIN = 1001;
    static final int APPLY_IDENTIFYCODE_REGIST = 1002;
    static final int CHECK_REGIST_IDENTIFYCODE = 1003;

    /**
     * 1001
     * 用户登陆
     *
     * @param userName
     * @param password
     * @return
     */
    public static Request login(String userName, String password) {
        KanggouRequest request = new KanggouRequest(LOGIN);
        request.putBussinessParams("userName", userName);
        request.putBussinessParams("password", password);
        return request;
    }

    /**
     * 用户注册申请验证码
     *
     * @param cellphoneNum
     * @return
     */
    public static Request applyIdentifyCodeRegist(String cellphoneNum) {
        KanggouRequest request = new KanggouRequest(APPLY_IDENTIFYCODE_REGIST);
        request.putBussinessParams("cellphoneNum", cellphoneNum);
        return request;
    }

    /**
     * 注册：验证用户输入验证码s是否匹配
     *
     * @param cellphoneNum
     * @param identifyCode
     * @return
     */
    public static Request checkRegistIdentifyCode(String cellphoneNum, String identifyCode) {
        KanggouRequest request = new KanggouRequest(CHECK_REGIST_IDENTIFYCODE);
        request.putBussinessParams("cellphoneNum", cellphoneNum);
        request.putBussinessParams("identifyCode", identifyCode);
        return request;
    }
}
