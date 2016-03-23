package com.wellgood.API;


import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wellgood.API.callback.LoginCallback;
import com.wellgood.model.WGResponse;
import com.zhy.http.okhttp.OkHttpUtils;

/**
 * wellgood所有接口api
 * @author Administrator
 *
 */
public class WellGood{
	public static String TAG="wellgood-api";

	/**
	 * 根据返回值解析出里面的 data
	 * @param response
	 * @return
	 */
	public static String getContentFromResponse(String response){
		WGResponse wgResponse=JSON.parseObject(response,WGResponse.class);
		String content=wgResponse.getData();
		
		return content;
	}
	/**
	 * 登录
	 * @param username
	 * @param password
	 */
	public static void login(String serverAddress,String username,String password,LoginCallback callback){
		
		JSONObject user=new JSONObject();
		user.put("usr_name", username);
		user.put("usr_pwd", password);
		String urlString=serverAddress+"/user/login?user="+user;
		Log.d(TAG, "login-url:"+urlString);
		OkHttpUtils
                 .get()//
                 .url(urlString)//
                 .build()//
                 .execute(callback);
	}
}
