package com.zmkm.testumeng;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;

/**
 * Created by nelson on 2021/4/15
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        UMConfigure.setLogEnabled(true);
        UMConfigure.init(this, "5f55f4717823567fd864c5cc", "Umeng", UMConfigure.DEVICE_TYPE_PHONE, "");

    }
}
