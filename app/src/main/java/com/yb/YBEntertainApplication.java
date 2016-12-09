package com.yb;

import android.app.Application;
import android.content.Context;

/**
 * Created by Windows 10 on 2016/12/9.
 */

public class YBEntertainApplication extends Application {
    public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }
}
