package com.example.dinhtho.test;

import android.content.Context;

public class SingletonExample {
    private Context context;
    private static SingletonExample singletonExample;

    private SingletonExample(Context context) {
        this.context = context;
    }

    public static SingletonExample getInstance(Context context) {
        if (singletonExample == null) {
            singletonExample = new SingletonExample(context);
        }
        return singletonExample;
    }
}
