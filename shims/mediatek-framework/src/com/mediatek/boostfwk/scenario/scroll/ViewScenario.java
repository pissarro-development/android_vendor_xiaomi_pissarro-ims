package com.mediatek.boostfwk.scenario.scroll;

import com.mediatek.boostfwk.scenario.BasicScenario;

public class ViewScenario extends BasicScenario {

    // .field protected blacklist mPkgName:Ljava/lang/String;
    protected String mPkgName;

    // .field protected blacklist mScenarioAction:I
    protected int mScenarioAction;

    // .method public constructor blacklist <init>()V
    public ViewScenario() {
        super();
    }

    // .method public constructor blacklist <init>(IILjava/lang/String;)V
    public ViewScenario(int scenario, int action, String pkgName) {
        super();
        this.mScenario = scenario;
        this.mScenarioAction = action;
        this.mPkgName = pkgName;
    }

    // .method public blacklist getPackageName()Ljava/lang/String;
    public String getPackageName() {
        return mPkgName;
    }

    // .method public blacklist getScenarioAction()I
    public int getScenarioAction() {
        return mScenarioAction;
    }
}