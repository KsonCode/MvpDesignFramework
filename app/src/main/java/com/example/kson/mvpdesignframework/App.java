package com.example.kson.mvpdesignframework;

import android.app.Application;
import android.content.Context;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/03/15
 * Description:
 */
public class App extends Application {

    public static Context mContext;

    public static Context getAppContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        //通过intentservice初始化
        initMob();
        initGaode();
        initFresco();
        //...
    }

    /**
     * 初始化fresco
     */
    private void initFresco() {

    }

    /**
     * 初始化高德地图
     */
    private void initGaode() {

    }

    /**
     * 初始化mob平台sdk
     */
    private void initMob() {

    }
}
