package com.wenkang.kanggou.ui_version_1.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wenkang.kanggou.R;
import com.wenkang.kanggou.ui_base.base_act.BaseActivity;
import com.wenkang.kanggou.ui_version_1.account.view.RegistInputCellphoneView;


public class RegistInputCellphoneActivity extends BaseActivity implements View.OnClickListener, RegistInputCellphoneView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist_input_cellphone);
        findViews();
    }

    private EditText registUser;
    private EditText registIdentifycode;
    private Button registGetIdentifycode;
    private Button registCheckIdentifycode;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2015-08-25 14:21:40 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        registUser = (EditText) findViewById(R.id.regist_user);
        registIdentifycode = (EditText) findViewById(R.id.regist_identifycode);
        registGetIdentifycode = (Button) findViewById(R.id.regist_get_identifycode);
        registCheckIdentifycode = (Button) findViewById(R.id.regist_check_identifycode);

        registGetIdentifycode.setOnClickListener(this);
        registCheckIdentifycode.setOnClickListener(this);
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2015-08-25 14:21:40 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if (v == registGetIdentifycode) {
            // Handle clicks for registGetIdentifycode
        } else if (v == registCheckIdentifycode) {
            // Handle clicks for registCheckIdentifycode
        }
    }


    @Override
    public String getInputCellphoneNum() {
        return registUser.getText().toString().trim();
    }

    @Override
    public String getInputIdentifyCode() {
        return registIdentifycode.getText().toString().trim();
    }

    @Override
    public void setButtonText() {
        registGetIdentifycode.setText("获取验证码");
    }

    @Override
    public void setButtonLastTime(int lastTime) {
        registGetIdentifycode.setText(lastTime + "秒后获取");
    }

    @Override
    public void TipsWrongCellphoneNum(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void TipsAreadySendMessage() {
        Toast.makeText(this, "验证码已发送到您的手机，请注意查收", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void TipsWrongIdentifyCode(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void Sucess(String cellphoneNum, String identifyCode) {
        Intent intent = new Intent(this, RegistInputPasswordActivity.class);
        intent.putExtra("cellphoneNum", cellphoneNum);
        intent.putExtra("identifyCode", identifyCode);
        startActivity(intent);
    }
}
