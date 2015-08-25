package com.wenkang.kanggou.ui.welcome;

/**
 * Created by Lenovo on 2015/8/24.
 */
public class WelcomePresenter {
    WelcomeView view;

    public void userClick() {
        view.showProgressDialog("测试显示");
    }
}
