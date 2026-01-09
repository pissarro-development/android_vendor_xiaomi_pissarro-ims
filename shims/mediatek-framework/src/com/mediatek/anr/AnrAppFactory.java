package com.mediatek.anr;

import dalvik.system.PathClassLoader;
import java.lang.reflect.Constructor;

public class AnrAppFactory {

    // .field private static blacklist lock:Ljava/lang/Object;
    private static Object lock = new Object();

    // .field private static blacklist sInstance:Lcom/mediatek/anr/AnrAppFactory;
    private static AnrAppFactory sInstance;

    // .method public constructor blacklist <init>()V
    public AnrAppFactory() {
    }

    // .method public static blacklist getInstance()Lcom/mediatek/anr/AnrAppFactory;
    public static AnrAppFactory getInstance() {
        if (sInstance == null) {
            synchronized (lock) {
                if (sInstance == null) {
                    String className = "com.mediatek.anr.AnrAppFactoryImpl";
                    String classPackage = "/system/framework/mediatek-framework.jar";

                    try {
                        PathClassLoader classLoader = new PathClassLoader(
                                classPackage,
                                AnrAppFactory.class.getClassLoader()
                        );

                        Class<?> clazz = Class.forName(className, false, classLoader);
                        Constructor<?> constructor = clazz.getConstructor();
                        sInstance = (AnrAppFactory) constructor.newInstance();
                    } catch (Exception e) {
                        sInstance = new AnrAppFactory();
                    }
                }
            }
        }
        return sInstance;
    }

    // .method public blacklist makeAnrAppManager()Lcom/mediatek/anr/AnrAppManager;
    public AnrAppManager makeAnrAppManager() {
        return new AnrAppManager();
    }
}