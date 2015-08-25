package com.wenkang.kanggou.ui.account;

import android.app.Activity;
import android.content.Context;

import com.android.volley.VolleyError;
import com.wenkang.kanggou.MyApplication;
import com.wenkang.kanggou.MySharePerference;
import com.wenkang.kanggou.entity.User;
import com.wenkang.kanggou.tool.net.ApplyCallback;
import com.wenkang.kanggou.tool.net.NetServer;
import com.wenkang.kanggou.tool.net.Request;
import com.wenkang.kanggou.ui.BasePresenter;

/**
 * Created by Lenovo on 2015/8/24.
 */
public class LoginPresenter extends BasePresenter {
    LoginView view;
    private User user;

    /**
     * 登陆
     */
    public void login() {
        view.showProgressDialog("正在登陆，请稍后...");
        NetServer.apply(new Request(), new
                ApplyCallback() {
                    @Override
                    public void NetFailed(VolleyError error) {
                        view.loginFail("连接异常");
                        view.closeProgressDialog();
                    }

                    @Override
                    public void onReturned(String response) {
                        view.closeProgressDialog();
                    }
                });
    }

    /**
     * 保存用户登陆状态
     *
     * @param context
     */
    public void saveUserInfo(Activity context) {
        MyApplication app = (MyApplication) context.getApplication();
        app.setUser(user);
    }

    /**
     * 保存用户名和密码
     *
     * @param context
     */
    public void saveUserLoginInfo(Context context) {
        MySharePerference mySharePerference = new MySharePerference(context);
        mySharePerference.saveUserNameAndPassword(view.getUserName(), view.getPassword());
    }

    public void setLoginInfo(Context context) {
        MySharePerference mySharePerference = new MySharePerference(context);
        String userName = mySharePerference.getUserName();
        String password = mySharePerference.getPassword();
        long lastLoginTime = mySharePerference.getLastLoginTime();
        long nowTime = System.currentTimeMillis();
        long max = 1000 * 60 * 60 * 24 * 30;
        if (nowTime - lastLoginTime < max) {
            view.setUserNameAndPassword(userName, password);
        } else {
            if (!userName.equals("")) {
                view.setUserNameAndPassword(userName, "");
            }
        }
    }
}
