package com.wenkang.kanggou.config;

import com.google.gson.Gson;
import com.wenkang.kanggou.tool.net.Request;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by Lenovo on 2015/8/25.
 */
public class KanggouRequest implements Request, Serializable {
    private static final long serialVersionUID = -5622180157099625593L;

    private ApiInfo apiInfo;
    private HashMap<String, Object> params;

    public KanggouRequest(int actionCode) {
        this.apiInfo = new ApiInfo(actionCode);
    }

    public void putBussinessParams(String key, Object value) {
        if (params == null) {
            params = new HashMap<String, Object>();
        }
        params.put(key, value);
    }

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
        Gson gson = new Gson();
        String param = gson.toJson(this);
        try {
            JSONObject jsonObject = new JSONObject(param);
            return jsonObject;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
