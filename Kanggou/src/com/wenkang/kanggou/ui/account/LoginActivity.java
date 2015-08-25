package com.wenkang.kanggou.ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wenkang.kanggou.R;
import com.wenkang.kanggou.ui.BaseActivity;


public class LoginActivity extends BaseActivity implements View.OnClickListener, LoginView {
    LoginPresenter presenter;

    private EditText loginUserName;
    private EditText loginPassword;
    private Button loginSubmit;
    private Button resetPassword;
    private Button goRegist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        presenter = new LoginPresenter(this);
        presenter.setLoginInfo(this);
        findViews();
    }



    private void findViews() {
        loginUserName = (EditText) findViewById(R.id.login_userName);
        loginPassword = (EditText) findViewById(R.id.login_password);
        loginSubmit = (Button) findViewById(R.id.login_submit);
        resetPassword = (Button) findViewById(R.id.reset_password);
        goRegist = (Button) findViewById(R.id.go_regist);

        loginSubmit.setOnClickListener(this);
        resetPassword.setOnClickListener(this);
        goRegist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == loginSubmit) {
            presenter.login();
        } else if (v == resetPassword) {
            Intent intent = new Intent();
            intent.setClass(this, ResetPasswordInputUserActivity.class);
            this.startActivity(intent);
        } else if (v == goRegist) {
            Intent intent = new Intent();
            intent.setClass(this, RegistInputCellphoneActivity.class);
            this.startActivity(intent);
        }
    }

    @Override
    public String getUserName() {
        return loginUserName.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return loginPassword.getText().toString().trim();
    }

    @Override
    public void loginSuc() {
        presenter.saveUserInfo(this);
        this.finish();
    }

    @Override
    public void loginFail(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setUserNameAndPassword(String userName, String password) {
        loginUserName.setText(userName);
        loginPassword.setText(password);
    }
}
