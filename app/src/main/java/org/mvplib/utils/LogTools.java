package org.mvplib.utils;

import android.util.Log;

import org.mvplib.app.AppConfig;


/**
 * Author: ws.
 * Date: 2017/12/7.
 * Notes:log管理类
 */

public class LogTools {
    public static void i(String tag, String msg){
        if(AppConfig.isDebug){
            Log.i(tag,msg);
        }
    }
    public static void d(String tag, String msg){
        if(AppConfig.isDebug){
            Log.d(tag,msg);
        }
    }
    public static void e(String tag, String msg){
        if(AppConfig.isDebug){
            Log.e(tag,msg);
        }
    }
    public static void w(String tag, String msg){
        if(AppConfig.isDebug){
            Log.w(tag,msg);
        }
    }
}
