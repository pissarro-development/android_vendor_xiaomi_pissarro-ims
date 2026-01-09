package com.mediatek.boostfwk.scenario.message;

import com.mediatek.boostfwk.scenario.BasicScenario;

public class MessageScenario extends BasicScenario {

    public static final String[] mAudioMsgViewList;

    protected int mScenarioAction;
    private String mViewName;
    private int mVisibilityMask;

    static {
        mAudioMsgViewList = new String[]{
            "com.tencent.mobileqq.activity.aio.audiopanel.AudioPanel",
            "com.tencent.mm.plugin.transvoice.ui"
        };
    }

    public MessageScenario() {
        super();
    }

    public int getScenarioAction() {
        return mScenarioAction;
    }

    public String getViewName() {
        return mViewName;
    }

    public int getVisibilityMask() {
        return mVisibilityMask;
    }

    public boolean isAudioMsgView(String viewMsgName) {
        boolean isAudioMsgView = false;
        for (String audioMsgViewName : mAudioMsgViewList) {
            if (viewMsgName != null && viewMsgName.trim().contains(audioMsgViewName)) {
                isAudioMsgView = true;
                break;
            }
        }
        return isAudioMsgView;
    }

    public void setScenarioInfo(int scenario, int action, String viewName, int visibilityMask) {
        mScenario = scenario;
        mScenarioAction = action;
        mViewName = viewName;
        mVisibilityMask = visibilityMask;
    }
}