package com.feifei.virtualapkdemo;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.didi.virtualapk.PluginManager;

/**
 * Created by feifei on 2020/7/13
 */
public class MyAppApplication  extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        long start = System.currentTimeMillis();
        PluginManager.getInstance(base).init();
        Log.d("fyz", "use time:" + (System.currentTimeMillis() - start));
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("fyz","onCreate xxxxxx");
    }
}
