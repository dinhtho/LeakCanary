package com.example.dinhtho.test;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

public class MyApplication extends Application {

private SingletonExample singletonExample;
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
