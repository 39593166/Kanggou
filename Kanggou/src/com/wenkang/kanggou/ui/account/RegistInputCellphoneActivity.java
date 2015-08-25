package com.wenkang.kanggou.ui.account;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.wenkang.kanggou.R;
import com.wenkang.kanggou.ui.BaseActivity;


public class RegistInputCellphoneActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist_input_cellphone);
        findViews();
    }

    private EditText resetPwUser;
    private EditText resetPwIdentifycode;
    private Button resetPwGetIdentifycode;
    private Button resetPwCheckIdentifycode;

    private void findViews() {
        resetPwUser = (EditText) findViewById(R.id.reset_pw_user);
        resetPwIdentifycode = (EditText) findViewById(R.id.reset_pw_identifycode);
        resetPwGetIdentifycode = (Button) findViewById(R.id.reset_pw_get_identifycode);
        resetPwCheckIdentifycode = (Button) findViewById(R.id.reset_pw_check_identifycode);

        resetPwGetIdentifycode.setOnClickListener(this);
        resetPwCheckIdentifycode.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == resetPwGetIdentifycode) {

        } else if (v == resetPwCheckIdentifycode) {

        }
    }

}
