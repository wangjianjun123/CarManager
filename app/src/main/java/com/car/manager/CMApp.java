package com.car.manager;

import android.app.Application;

/**
 * author kele
 * date on 2017/7/15 下午2:57
 * description TODO
 */
public class CMApp extends Application {

    public static CMApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static CMApp getInstance() {
        return mInstance;
    }
}
