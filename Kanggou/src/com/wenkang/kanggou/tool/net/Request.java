package com.wenkang.kanggou.tool.net;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map.Entry;

public class Request {
	private String url;
	private int Method = 1;// 默认get
	private RequestParams requestParam;

	public static final int METHOD_GET = 1;
	public static final int METHOD_POST = 2;

	public Request() {
		requestParam = new RequestParams();
	}

	public RequestParams getRequestParam() {
		return requestParam;
	}

	public void setRequestParam(RequestParams requestParam) {
		this.requestParam = requestParam;
	}

	public void putParam(String key, Object value) {
		requestParam.put(key, value);
	}

	/**
	 * 获取post的json
	 * 
	 * @return
	 */
	public JSONObject getPostParams() {
		return null;
	}

	/**
	 * 获取get请求连接
	 * 
	 * @return
	 */
	public String getGetParams() {
		HashMap<String, Object> reParam = requestParam.getParam();
		StringBuilder sb = new StringBuilder();
		sb.append(url);
		for (Entry<String, Object> item : reParam.entrySet()) {
			sb.append("&");
			sb.append(item.getKey());
			sb.append("=");
			sb.append(item.getValue());
		}

		return sb.toString();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getMethod() {
		return Method;
	}

	public void setMethod(int method) {
		Method = method;
	}


}
