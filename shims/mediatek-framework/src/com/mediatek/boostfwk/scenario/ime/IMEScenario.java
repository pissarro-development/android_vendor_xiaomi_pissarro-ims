package com.mediatek.boostfwk.scenario.ime;

import android.view.Window;
import com.mediatek.boostfwk.scenario.BasicScenario;

public class IMEScenario extends BasicScenario {

    protected int mScenarioAction;
    private Window mWindow;

    public IMEScenario() {
        super();
        mScenario = 5;
    }

    public int getScenarioAction() {
        return mScenarioAction;
    }

    public Window getWindowAndClear() {
        Window window = mWindow;
        mWindow = null;
        return window;
    }

    public IMEScenario setAction(int action) {
        mScenarioAction = action;
        return this;
    }

    public IMEScenario setWindow(Window window) {
        mWindow = window;
        return this;
    }
}