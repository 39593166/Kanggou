package com.wenkang.kanggou.ui.account;

import com.wenkang.kanggou.ui.BaseView;

/**
 * Created by Lenovo on 2015/8/24.
 */
public interface RegistInputCellphoneView extends BaseView {
    /**
     * 获取用户输入手机号码
     *
     * @return
     */
    public String getInputCellphoneNum();

    /**
     * 获取用户输入验证码
     *
     * @return
     */
    public String getInputIdentifyCode();

    /**
     * 设置获取验证码按钮文字（恢复到初始化文字）
     */
    public void setButtonText();

    /**
     * 设置重新获取验证码剩余时间
     */
    public void setButtonLastTime(int lastTime);

    /**
     * 提示用户手机号码有误
     *
     * @param message
     */
    public void TipsWrongCellphoneNum(String message);

    /**
     * 提示用户已发送验证码
     */
    public void TipsAreadySendMessage();

    /**
     * 提示用户验证码校验失败
     *
     * @param message
     */
    public void TipsWrongIdentifyCode(String message);

    /**
     * 验证码校验成功
     */
    public void Sucess(String cellphoneNum, String identifyCode);
}
