package com.wenkang.kanggou.ui_base;

import android.app.Application;
import android.os.Environment;
import android.util.Log;

import com.wenkang.kanggou.entity.User;

import java.io.File;

public class MyApplication extends Application {
    public String catchDirPath;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        catchDirPath = Environment.getExternalStorageDirectory()
                .getAbsolutePath() + "/kanggouonline";
        Log.e("缓存", catchDirPath);
        File file = new File(catchDirPath);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

}
