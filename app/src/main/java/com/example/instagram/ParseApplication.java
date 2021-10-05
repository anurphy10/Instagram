package com.example.instagram;


import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("0snWCgweuL1z3X4ABPnpDxin1So1bvF0l8IrbL19")
                .clientKey("Hg7t9FcJozXWgSsQcBjMRCwXAzTSJ24aL8oQNymo")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
