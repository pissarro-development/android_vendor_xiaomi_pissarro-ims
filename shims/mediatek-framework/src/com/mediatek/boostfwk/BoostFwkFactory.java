package com.mediatek.boostfwk;

import java.lang.reflect.Constructor;

public class BoostFwkFactory {

    // .field private static blacklist lock:Ljava/lang/Object;
    private static Object lock = new Object();

    // .field protected static blacklist sBoostFwkManager:Lcom/mediatek/boostfwk/BoostFwkManager;
    protected static BoostFwkManager sBoostFwkManager = null;

    // .field private static blacklist sInstance:Lcom/mediatek/boostfwk/BoostFwkFactory;
    private static BoostFwkFactory sInstance;

    // .method public constructor blacklist <init>()V
    public BoostFwkFactory() {
    }

    // .method public static blacklist getInstance()Lcom/mediatek/boostfwk/BoostFwkFactory;
    public static BoostFwkFactory getInstance() {
        if (sInstance == null) {
            synchronized (lock) {
                if (sInstance == null) {
                    String className = "com.mediatek.boostfwk.BoostFwkFactoryImpl";
                    try {
                        // Class.forName(String name, boolean initialize, ClassLoader loader)
                        Class<?> clazz = Class.forName(className, false, null);
                        
                        Constructor<?> constructor = clazz.getConstructor();
                        sInstance = (BoostFwkFactory) constructor.newInstance();
                    } catch (Exception e) {
                        sInstance = new BoostFwkFactory();
                    }
                }
            }
        }
        return sInstance;
    }

    // .method public blacklist makeBoostFwkManager()Lcom/mediatek/boostfwk/BoostFwkManager;
    public BoostFwkManager makeBoostFwkManager() {
        if (sBoostFwkManager == null) {
            sBoostFwkManager = new BoostFwkManager();
        }
        return sBoostFwkManager;
    }
}