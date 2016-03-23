package com.wellgood.config;

import android.content.Context;
import android.content.SharedPreferences;

import com.wellgood.application.APP;

/**
 * 海康api的配置文件
 * @author Administrator
 *
 */
public final class Config {
    private static Config       ins              = new Config();
    private SharedPreferences   sp;
    /**
     * 配置文件文件�??
     */
    private static final String CONFIG_FILE_NAME = "demo_conf";
    /**
     * 服务器地�??
     */
    private static final String SERVER_ADDR      = "server_addr";
    /**
     * 自动登录
     */
    private static final String AUTO_LOGIN       = "auto_login";

    /**
     * 默认登录地址，这个地�??是我们公司测试地�??，开发�?�可以根据实际情况进行修�??
     */
    private static final String DEF_SERVER       = "http://112.12.17.3";

    private Config() {
        sp = APP.getIns().getSharedPreferences(CONFIG_FILE_NAME, Context.MODE_PRIVATE);
    }

    public static Config getIns() {
        return ins;
    }

    /**
      * 设置服务器地�??
      * @param serverAdrr
      * @since V1.0
      */
    public void setServerAddr(String serverAdrr) {
        sp.edit().putString(SERVER_ADDR, serverAdrr).commit();
    }

    /**
      * 获取服务器地�??
      * @return
      * @since V1.0
      */
    public String getServerAddr() {
        return sp.getString(SERVER_ADDR, DEF_SERVER);
    }

    /**
      * 设置自动登录
      * @param autologin
      * @since V1.0
      */
    public void setAutoLogin(boolean autologin) {
        sp.edit().putBoolean(AUTO_LOGIN, autologin).commit();
    }

    /**
      * 是否自动登录
      * @return
      * @since V1.0
      */
    public boolean isAutoLogin() {
        return sp.getBoolean(AUTO_LOGIN, false);
    }
}
