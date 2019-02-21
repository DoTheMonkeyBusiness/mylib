package com.example.mylib;

import android.util.Log;

public class MyClass {
    private static final String TAG = "mylib";
    public static void myFunc(){
        Log.e(TAG, "func from submodule");
    }
}
