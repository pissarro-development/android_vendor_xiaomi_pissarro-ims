package com.mediatek.boostfwk.scenario.scroll;

import android.content.Context;
import android.view.MotionEvent;

public class ScrollScenario extends ViewScenario {

    private int mBoostStatus;
    private Context mContext;
    private MotionEvent mEvent;
    private boolean mIsSFPEnable;
    private Object mObject;

    public ScrollScenario() {
        super();
        mIsSFPEnable = false;
        mScenario = 1;
    }

    public ScrollScenario(int scenario, int action, int boostStatus, Context context) {
        super();
        mIsSFPEnable = false;
        mScenario = scenario;
        mScenarioAction = action;
        mBoostStatus = boostStatus;
        mContext = context;
    }

    public ScrollScenario(int scenario, int action, int boostStatus, Context context, Object object) {
        super();
        mIsSFPEnable = false;
        mScenario = scenario;
        mScenarioAction = action;
        mBoostStatus = boostStatus;
        mContext = context;
        mObject = object;
    }

    public ScrollScenario(int scenario, int action, Context context, Object object) {
        super();
        mIsSFPEnable = false;
        mScenario = scenario;
        mScenarioAction = action;
        mContext = context;
        mObject = object;
    }

    public ScrollScenario(int scenario, int action, MotionEvent event, Context context) {
        super();
        mIsSFPEnable = false;
        mScenario = scenario;
        mScenarioAction = action;
        mEvent = event;
        mContext = context;
    }

    public int getBoostStatus() {
        return mBoostStatus;
    }

    public Context getScenarioContext() {
        return mContext;
    }

    public MotionEvent getScenarioInputEvent() {
        return mEvent;
    }

    public Object getScenarioObj() {
        return mObject;
    }

    public boolean isSFPEnable() {
        return mIsSFPEnable;
    }

    public ScrollScenario setAction(int action) {
        mScenarioAction = action;
        return this;
    }

    public ScrollScenario setBoostStatus(int boostStatus) {
        mBoostStatus = boostStatus;
        return this;
    }

    public ScrollScenario setContext(Context context) {
        mContext = context;
        return this;
    }

    public ScrollScenario setMotionEvent(MotionEvent event) {
        mEvent = event;
        return this;
    }

    public ScrollScenario setObject(Object object) {
        mObject = object;
        return this;
    }

    public ScrollScenario setSFPEnable(boolean enable) {
        mIsSFPEnable = enable;
        return this;
    }
}