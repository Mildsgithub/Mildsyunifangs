package com.mild.pc.mildsyunifang.application;


import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Process;

import com.mild.pc.mildsyunifang.utils.ImageLoaderUtils;

import org.xutils.x;

/**
 * -- Chinese name: 张文博
 * -- English name: mild
 * -- date:2016/11/28
 * -- time:14:09分钟
 * -- DATADIR:com.mild.pc.mildsyunifang.application
 */
public class Myapplication extends Application {

    private static Context context;
    private static Handler handler;
    private static int mainThreadId;

    @Override
    public void onCreate() {
        super.onCreate();
        //上下文
        context = getApplicationContext();
        handler = new Handler();
        mainThreadId = Process.myTid();
        ImageLoaderUtils.initConfiguration(this);
        x.Ext.init(this);
        x.Ext.setDebug(true);
    }
    public static  int getMainThreadId(){
        return mainThreadId;
    }
    public static Handler getHandler() {
        return handler;
    }
    public static Thread getMainThread(){
        return Thread.currentThread();
    }
    public static Context getContext() {
        return context;
    }
}
