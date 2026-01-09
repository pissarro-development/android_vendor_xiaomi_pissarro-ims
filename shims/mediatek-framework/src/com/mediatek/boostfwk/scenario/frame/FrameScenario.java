package com.mediatek.boostfwk.scenario.frame;

import android.view.Choreographer;
import android.view.ThreadedRenderer;
import com.mediatek.boostfwk.scenario.BasicScenario;

public class FrameScenario extends BasicScenario {

    private int mBoostStatus;
    private Choreographer mChoreographer;
    private Choreographer.FrameData mFrameData;
    private long mFrameId;
    private int mFrameStep;
    private long mFrameTimeResult;
    private boolean mIsFling;
    private boolean mIsListenFrameHint;
    private boolean mIsPreAnim;
    private boolean mIsPreAnimEnable;
    private boolean mIsSFPEnable;
    private long mOrigFrameTimeNano;
    private int mRenderThreadTid;
    protected int mScenarioAction;
    private ThreadedRenderer mThreadedRenderer;

    public FrameScenario() {
        super();
        mRenderThreadTid = Integer.MIN_VALUE; // -0x80000000
        mIsListenFrameHint = true;
        mThreadedRenderer = null;
        mIsFling = false;
        mIsPreAnim = false;
        mScenario = 2;
    }

    public FrameScenario(int scenario, int action, int boostStatus, int frameStep) {
        super();
        mRenderThreadTid = Integer.MIN_VALUE;
        mIsListenFrameHint = true;
        mThreadedRenderer = null;
        mIsFling = false;
        mIsPreAnim = false;
        mScenario = scenario;
        mScenarioAction = action;
        mBoostStatus = boostStatus;
        mFrameStep = frameStep;
    }

    public FrameScenario(int scenario, int action, int boostStatus, long frameId) {
        super();
        mRenderThreadTid = Integer.MIN_VALUE;
        mIsListenFrameHint = true;
        mThreadedRenderer = null;
        mIsFling = false;
        mIsPreAnim = false;
        mScenario = scenario;
        mScenarioAction = action;
        mBoostStatus = boostStatus;
        mFrameStep = -1;
        mFrameId = frameId;
    }

    public boolean canInitRenderThreadId() {
        return mRenderThreadTid != Integer.MIN_VALUE;
    }

    public int getBoostStatus() {
        return mBoostStatus;
    }

    public Choreographer getChoreographer() {
        Choreographer tmpChoreographer = mChoreographer;
        mChoreographer = null;
        return tmpChoreographer;
    }

    public Choreographer.FrameData getFrameData() {
        return mFrameData;
    }

    public long getFrameId() {
        return mFrameId;
    }

    public int getFrameStep() {
        return mFrameStep;
    }

    public long getFrameTimeResult() {
        return mFrameTimeResult;
    }

    public long getOrigFrameTime() {
        return mOrigFrameTimeNano;
    }

    public int getRenderThreadTid() {
        return mRenderThreadTid;
    }

    public int getScenarioAction() {
        return mScenarioAction;
    }

    public ThreadedRenderer getThreadedRendererAndClear() {
        ThreadedRenderer render = mThreadedRenderer;
        mThreadedRenderer = null;
        return render;
    }

    public boolean isFling() {
        return mIsFling;
    }

    public boolean isListenFrameHint() {
        return mIsListenFrameHint;
    }

    public boolean isPreAnim() {
        return mIsPreAnim;
    }

    public boolean isPreAnimEnable() {
        return mIsPreAnimEnable;
    }

    public boolean isSFPEnable() {
        return mIsSFPEnable;
    }

    public FrameScenario setAction(int action) {
        mScenarioAction = action;
        return this;
    }

    public FrameScenario setBoostStatus(int boostStatus) {
        mBoostStatus = boostStatus;
        return this;
    }

    public FrameScenario setChoreographer(Choreographer choreographer) {
        mChoreographer = choreographer;
        return this;
    }

    public FrameScenario setFling(boolean isFling) {
        mIsFling = isFling;
        return this;
    }

    public FrameScenario setFrameData(Choreographer.FrameData frameData) {
        mFrameData = frameData;
        return this;
    }

    public FrameScenario setFrameId(long frameId) {
        mFrameId = frameId;
        return this;
    }

    public FrameScenario setFrameStep(int frameStep) {
        mFrameStep = frameStep;
        return this;
    }

    public FrameScenario setFrameTimeResult(long frameTimeResult) {
        mFrameTimeResult = frameTimeResult;
        return this;
    }

    public void setIsListenFrameHint(boolean listen) {
        if (listen != mIsListenFrameHint) {
            mIsListenFrameHint = listen;
        }
    }

    public FrameScenario setOrigFrameTimeNano(long origFrameTimeNano) {
        mOrigFrameTimeNano = origFrameTimeNano;
        return this;
    }

    public FrameScenario setPreAnim(boolean isPreAnim) {
        mIsPreAnim = isPreAnim;
        return this;
    }

    public FrameScenario setPreAnimEnable(boolean enabled) {
        mIsPreAnimEnable = enabled;
        return this;
    }

    public FrameScenario setRenderThreadId(int renderThreadTid) {
        mRenderThreadTid = renderThreadTid;
        return this;
    }

    public FrameScenario setSFPEnable(boolean enabled) {
        mIsSFPEnable = enabled;
        return this;
    }

    public FrameScenario setThreadedRenderer(ThreadedRenderer render) {
        mThreadedRenderer = render;
        return this;
    }
}