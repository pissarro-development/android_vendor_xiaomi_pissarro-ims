package com.mediatek.boostfwk.scenario.launch;

import android.content.Context;
import android.view.WindowManager;
import com.mediatek.boostfwk.scenario.BasicScenario;
import java.lang.ref.WeakReference;

public class LaunchScenario extends BasicScenario {

    private WeakReference<Context> activity;
    private String mActivityName;
    private WindowManager.LayoutParams mAttrs;
    private int mBoostStatus;
    private String mHostingType;
    private boolean mIsComeFromIdle;
    private String mPkgName;
    private int mScenarioAction;

    public LaunchScenario(int scenario, int action, int boostStatus, String pkgName, WindowManager.LayoutParams attrs, boolean isComeFromIdle) {
        super();
        activity = null;
        mScenario = scenario;
        mScenarioAction = action;
        mBoostStatus = boostStatus;
        mPkgName = pkgName;
        mAttrs = attrs;
        mIsComeFromIdle = isComeFromIdle;
    }

    public LaunchScenario(int scenario, int action, int boostStatus, String pkgName, String activityName, boolean isComeFromIdle) {
        super();
        activity = null;
        mScenario = scenario;
        mScenarioAction = action;
        mBoostStatus = boostStatus;
        mPkgName = pkgName;
        mActivityName = activityName;
        mIsComeFromIdle = isComeFromIdle;
    }

    public LaunchScenario(int scenario, int action, Context context) {
        super();
        activity = null;
        mScenario = scenario;
        mScenarioAction = action;
        activity = new WeakReference<>(context);
    }

    public LaunchScenario(int scenario, int action, String hostingType, int boostStatus, String pkgName) {
        super();
        activity = null;
        mScenario = scenario;
        mScenarioAction = action;
        mHostingType = hostingType;
        mBoostStatus = boostStatus;
        mPkgName = pkgName;
    }

    public WeakReference<Context> getActivity() {
        return activity;
    }

    public String getActivityName() {
        return mActivityName;
    }

    public WindowManager.LayoutParams getAttrs() {
        return mAttrs;
    }

    public int getBoostStatus() {
        return mBoostStatus;
    }

    public String getHostingType() {
        return mHostingType;
    }

    public boolean getIsComeFromIdle() {
        return mIsComeFromIdle;
    }

    public String getPackageName() {
        return mPkgName;
    }

    public int getScenarioAction() {
        return mScenarioAction;
    }
}