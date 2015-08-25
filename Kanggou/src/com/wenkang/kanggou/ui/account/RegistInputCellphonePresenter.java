package com.wenkang.kanggou.ui.account;

import com.android.volley.VolleyError;
import com.wenkang.kanggou.tool.net.ApplyCallback;
import com.wenkang.kanggou.tool.net.NetServer;
import com.wenkang.kanggou.tool.net.Request;
import com.wenkang.kanggou.ui.BasePresenter;

/**
 * Created by Lenovo on 2015/8/24.
 */
public class RegistInputCellphonePresenter extends BasePresenter {
    RegistInputCellphoneView view;

    public RegistInputCellphonePresenter(RegistInputCellphoneView view) {
        this.view = view;
    }

    public void applyIdentifyCode() {
        view.showProgressDialog("正在获取验证码，请稍后...");

        NetServer.apply(new Request(), new
                ApplyCallback() {
                    @Override
                    public void NetFailed(VolleyError error) {
                        view.closeProgressDialog();
                    }

                    @Override
                    public void onReturned(String response) {

                        view.closeProgressDialog();
                    }
                });
    }

    public void checkIdentifyCode() {
        NetServer.apply(new Request(), new
                ApplyCallback() {
                    @Override
                    public void NetFailed(VolleyError error) {
                        view.closeProgressDialog();
                    }

                    @Override
                    public void onReturned(String response) {

                        view.closeProgressDialog();
                    }
                });
    }
}
