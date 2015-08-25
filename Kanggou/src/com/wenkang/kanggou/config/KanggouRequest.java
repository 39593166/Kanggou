package com.wenkang.kanggou.config;

import com.wenkang.kanggou.tool.net.Request;

import org.json.JSONObject;

/**
 * Created by Lenovo on 2015/8/25.
 */
public class KanggouRequest implements Request {
    @Override
    public int getMethod() {
        return Request.METHOD_POST;
    }

    @Override
    public String getUrl() {
        return ClientConfigs.APIHOST_USER;
    }

    @Override
    public JSONObject getParams() {
        return null;
    }
}
