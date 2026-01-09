package com.mediatek.aee;

import android.util.Slog;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Constructor;

public class ExceptionLog {

    // .field public static blacklist sClassLoader:Ldalvik/system/PathClassLoader;
    public static PathClassLoader sClassLoader;

    // .field private static blacklist sInstance:Lcom/mediatek/aee/ExceptionLog;
    private static ExceptionLog sInstance;

    // .method public constructor blacklist <init>()V
    public ExceptionLog() {
    }

    // .method public static blacklist getInstance()Lcom/mediatek/aee/ExceptionLog;
    public static ExceptionLog getInstance() {
        if (sInstance == null) {
            String className = "com.mediatek.aee.ExceptionLogImpl";
            String classPackage = "/system/framework/mediatek-framework.jar";

            try {
                // new-instance v3, Ldalvik/system/PathClassLoader;
                PathClassLoader loader = new PathClassLoader(
                        classPackage,
                        ExceptionLog.class.getClassLoader()
                );
                sClassLoader = loader;

                // Class.forName(className, false, loader)
                Class<?> clazz = Class.forName(className, false, loader);
                
                // getConstructor([Ljava/lang/Class;)
                Constructor<?> constructor = clazz.getConstructor();
                
                // newInstance([Ljava/lang/Object;)
                sInstance = (ExceptionLog) constructor.newInstance();
            } catch (Exception e) {
                // Slog.e("ExceptionLog", "getInstance: " + e.toString())
                Slog.e("ExceptionLog", "getInstance: " + e.toString());
                
                // new-instance v4, Lcom/mediatek/aee/ExceptionLog;
                sInstance = new ExceptionLog();
            }
        }
        return sInstance;
    }

    // .method public blacklist SFMatterJava(JJ)J
    public long SFMatterJava(long setorget, long lParam) {
        return -1L;
    }

    // .method public blacklist WDTMatterJava(J)V
    public void WDTMatterJava(long lParam) {
    }

    // .method public blacklist getNativeExceptionPidList([I)Z
    public boolean getNativeExceptionPidList(int[] pidList) {
        return false;
    }

    // .method public blacklist handle(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    public void handle(String type, String info, String pid) {
    }

    // .method public blacklist switchFtrace(I)V
    public void switchFtrace(int config) {
    }

    // .method public blacklist systemreport(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    public void systemreport(byte Type, String Module, String Msg, String Path) {
    }
}