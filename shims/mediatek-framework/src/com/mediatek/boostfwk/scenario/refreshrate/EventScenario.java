package com.mediatek.boostfwk.scenario.refreshrate;

import com.mediatek.boostfwk.scenario.BasicScenario;

public class EventScenario extends BasicScenario {

    private boolean mIsMarked;
    private boolean mIsVariableRefreshRateEnabled;
    private int mScenarioAction;

    public EventScenario() {
        super();
        mIsMarked = false;
        mIsVariableRefreshRateEnabled = false;
        mScenario = 7;
    }

    public boolean getIsMarked() {
        return mIsMarked;
    }

    public int getScenarioAction() {
        return mScenarioAction;
    }

    public boolean getVariableRefreshRateEnabled() {
        return mIsVariableRefreshRateEnabled;
    }

    public EventScenario setIsMarked(boolean isMarked) {
        mIsMarked = isMarked;
        return this;
    }

    public EventScenario setScenarioAction(int scenarioAction) {
        mScenarioAction = scenarioAction;
        return this;
    }

    public EventScenario setVariableRefreshRateEnabled(boolean isVariableRefreshRateEnabled) {
        mIsVariableRefreshRateEnabled = isVariableRefreshRateEnabled;
        return this;
    }
}