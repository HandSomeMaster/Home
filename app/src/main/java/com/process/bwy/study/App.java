package com.process.bwy.study;

import android.app.Application;
import android.os.Bundle;

import com.tencent.bugly.crashreport.CrashReport;

public class App extends Application {
    private static  App context;
    
    @Override
    public void onCreate() {
        super.onCreate();
        //Bugly
        CrashReport.initCrashReport(getApplicationContext(), "052cb8f24e", false);
    }

    public static App getContext() {
        return context;
    }
}
