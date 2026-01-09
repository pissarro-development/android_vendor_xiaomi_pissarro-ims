package com.mediatek.boostfwk.scenario.refreshrate;

import android.content.Context;
import com.mediatek.boostfwk.scenario.BasicScenario;
import java.lang.Math;

public class RefreshRateScenario extends BasicScenario {

    private String mActivityName;
    private Context mContext;
    private double mCurrentDistance;
    private float mCurrentDistanceLower;
    private int mCurrentFlingState;
    private int mCurrentRefreshRate;
    private long mCurrentTime;
    private float mCurrentVelocity;
    private float mDistanceCoef;
    private float mFlingFriction;
    private int mFlingRefreshRateChangeIndex;
    private boolean mHasVideo;
    private boolean mIsListScrollStateListening;
    private boolean mIsRefreshRateChangeEnabledWhenFling;
    private boolean mIsSmoothFlingEnabled;
    private boolean mIsTouchScrollEnable;
    private boolean mIsVariableRefreshRateEnabled;
    private long mLastFlingFinishTime;
    private long mLastTouchDownTime;
    private Object mObject;
    private float[] mOriginalSplinePosition;
    private float[] mOriginalSplineTime;
    private float mPhysicalCoeff;
    private String mPkgName;
    private float[] mRealSplinePosition;
    private float[] mRealSplineTime;
    private int mScenarioAction;
    private int mScenarioId;
    private int mSplineDistance;
    private int mSplineDuration;
    private double mSplineFlingDistance;

    public RefreshRateScenario(int scenario, int action, Context context) {
        super();
        mIsSmoothFlingEnabled = false;
        mIsVariableRefreshRateEnabled = false;
        mIsTouchScrollEnable = true;
        mHasVideo = false;
        mIsRefreshRateChangeEnabledWhenFling = false;
        mIsListScrollStateListening = false;
        mLastFlingFinishTime = 0L;
        mLastTouchDownTime = 0L;
        mScenario = scenario;
        mScenarioAction = action;
        mContext = context;
    }

    public RefreshRateScenario(int scenario, int action, String packageName, Context context) {
        super();
        mIsSmoothFlingEnabled = false;
        mIsVariableRefreshRateEnabled = false;
        mIsTouchScrollEnable = true;
        mHasVideo = false;
        mIsRefreshRateChangeEnabledWhenFling = false;
        mIsListScrollStateListening = false;
        mLastFlingFinishTime = 0L;
        mLastTouchDownTime = 0L;
        mScenario = scenario;
        mScenarioAction = action;
        mContext = context;
        mPkgName = packageName;
    }

    public RefreshRateScenario(Context context) {
        super();
        mIsSmoothFlingEnabled = false;
        mIsVariableRefreshRateEnabled = false;
        mIsTouchScrollEnable = true;
        mHasVideo = false;
        mIsRefreshRateChangeEnabledWhenFling = false;
        mIsListScrollStateListening = false;
        mLastFlingFinishTime = 0L;
        mLastTouchDownTime = 0L;
        mContext = context;
        mScenario = 6;
    }

    public double getCurrentDistance() {
        return mCurrentDistance;
    }

    public float getCurrentDistanceLower() {
        return mCurrentDistanceLower;
    }

    public int getCurrentFlingState() {
        return mCurrentFlingState;
    }

    public int getCurrentRefreshrate() {
        return mCurrentRefreshRate;
    }

    public long getCurrentTime() {
        return mCurrentTime;
    }

    public float getCurrentVelocity() {
        return mCurrentVelocity;
    }

    public float getDistanceCoef() {
        return mDistanceCoef;
    }

    public float getFlingFriction() {
        return mFlingFriction;
    }

    public int getFlingRefreshRateChangeIndex() {
        return mFlingRefreshRateChangeIndex;
    }

    public long getLastFlingFinishTime() {
        return mLastFlingFinishTime;
    }

    public long getLastTouchDownTime() {
        return mLastTouchDownTime;
    }

    public boolean getListScrollStateListening() {
        return mIsListScrollStateListening;
    }

    public float[] getOriginalSplinePosition() {
        return mOriginalSplinePosition;
    }

    public float[] getOriginalSplineTime() {
        return mOriginalSplineTime;
    }

    public float getPhysicalCoeff() {
        return mPhysicalCoeff;
    }

    public float[] getRealSplinePosition() {
        return mRealSplinePosition;
    }

    public float[] getRealSplineTime() {
        return mRealSplineTime;
    }

    public boolean getRefreshRateChangeEnabledWhenFling() {
        return mIsRefreshRateChangeEnabledWhenFling;
    }

    public int getScenarioAction() {
        return mScenarioAction;
    }

    public Context getScenarioContext() {
        return mContext;
    }

    public int getScenarioID() {
        return mScenarioId;
    }

    public Object getScenarioObj() {
        return mObject;
    }

    public boolean getSmoothFlingEnabled() {
        return mIsSmoothFlingEnabled;
    }

    public int getSplineDistance() {
        return mSplineDistance;
    }

    public int getSplineDuration() {
        return mSplineDuration;
    }

    public double getSplineFlingDistance() {
        return mSplineFlingDistance;
    }

    public boolean getTouchScrollEnabled() {
        return mIsTouchScrollEnable;
    }

    public boolean getVariableRefreshRateEnabled() {
        return mIsVariableRefreshRateEnabled;
    }

    public boolean hasVideo() {
        return mHasVideo;
    }

    public RefreshRateScenario increaseFlingRefreshRateChangeIndex() {
        mFlingRefreshRateChangeIndex++;
        return this;
    }

    public RefreshRateScenario setCurrentDistance(double currentDistance) {
        mCurrentDistance = currentDistance;
        return this;
    }

    public RefreshRateScenario setCurrentDistanceLower(float distanceResult) {
        mCurrentDistanceLower = Math.abs(distanceResult);
        return this;
    }

    public RefreshRateScenario setCurrentFlingState(int currentFlingState) {
        mCurrentFlingState = currentFlingState;
        return this;
    }

    public RefreshRateScenario setCurrentRefreshrate(int currentRefreshRate) {
        mCurrentRefreshRate = Math.abs(currentRefreshRate);
        return this;
    }

    public RefreshRateScenario setCurrentTime(long currentTime) {
        mCurrentTime = currentTime;
        return this;
    }

    public RefreshRateScenario setCurrentVelocity(float currentVelocity) {
        mCurrentVelocity = currentVelocity;
        return this;
    }

    public RefreshRateScenario setDistanceCoef(float distanceCoef) {
        mDistanceCoef = distanceCoef;
        return this;
    }

    public RefreshRateScenario setFlingFriction(float flingFriction) {
        mFlingFriction = flingFriction;
        return this;
    }

    public RefreshRateScenario setFlingRefreshRateChangeIndex(int flingRefreshRateChangeIndex) {
        mFlingRefreshRateChangeIndex = flingRefreshRateChangeIndex;
        return this;
    }

    public RefreshRateScenario setHasVideo(boolean hasVideo) {
        mHasVideo = hasVideo;
        return this;
    }

    public RefreshRateScenario setLastFlingFinishTime(long lastFlingFinishTime) {
        mLastFlingFinishTime = lastFlingFinishTime;
        return this;
    }

    public RefreshRateScenario setLastTouchDownTime(long lastTouchDownTime) {
        mLastTouchDownTime = lastTouchDownTime;
        return this;
    }

    public RefreshRateScenario setListScrollStateListening(boolean isListScrollStateListening) {
        mIsListScrollStateListening = isListScrollStateListening;
        return this;
    }

    public RefreshRateScenario setOriginalSplinePosition(float[] splinePosition) {
        mOriginalSplinePosition = splinePosition;
        return this;
    }

    public RefreshRateScenario setOriginalSplineTime(float[] splineTime) {
        mOriginalSplineTime = splineTime;
        return this;
    }

    public RefreshRateScenario setPhysicalCoeff(float flingFriction) {
        mPhysicalCoeff = flingFriction;
        return this;
    }

    public RefreshRateScenario setRealSplinePosition(float[] realSplinePosition) {
        mRealSplinePosition = realSplinePosition;
        return this;
    }

    public RefreshRateScenario setRealSplineTime(float[] realSplineTime) {
        mRealSplineTime = realSplineTime;
        return this;
    }

    public RefreshRateScenario setRefreshRateChangeEnabledWhenFling(boolean isRefreshRateChangeEnabledWhenFling) {
        mIsRefreshRateChangeEnabledWhenFling = isRefreshRateChangeEnabledWhenFling;
        return this;
    }

    public RefreshRateScenario setScenarioAction(int scenarioAction) {
        mScenarioAction = scenarioAction;
        return this;
    }

    public RefreshRateScenario setScenarioID(int id) {
        mScenarioId = id;
        return this;
    }

    public RefreshRateScenario setSmoothFlingEnabled(boolean isSmoothFlingEnabled) {
        mIsSmoothFlingEnabled = isSmoothFlingEnabled;
        return this;
    }

    public RefreshRateScenario setSplineDistance(int splineDistance) {
        mSplineDistance = splineDistance;
        return this;
    }

    public RefreshRateScenario setSplineDuration(int splineDuration) {
        mSplineDuration = splineDuration;
        return this;
    }

    public RefreshRateScenario setSplineFlingDistance(double splineFlingDistance) {
        mSplineFlingDistance = splineFlingDistance;
        return this;
    }

    public RefreshRateScenario setTouchScrollEnabled(boolean isTouchScrollEnabled) {
        mIsTouchScrollEnable = isTouchScrollEnabled;
        return this;
    }

    public RefreshRateScenario setVariableRefreshRateEnabled(boolean isVariableRefreshRateEnabled) {
        mIsVariableRefreshRateEnabled = isVariableRefreshRateEnabled;
        return this;
    }
}