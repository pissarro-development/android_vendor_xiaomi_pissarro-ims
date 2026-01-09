package com.mediatek.boostfwk.scenario;

public class BasicScenario {

    // .field protected blacklist mScenario:I
    protected int mScenario;

    // .method public constructor blacklist <init>()V
    public BasicScenario() {
    }

    // .method public constructor blacklist <init>(I)V
    public BasicScenario(int scenario) {
        this.mScenario = scenario;
    }

    // .method public blacklist getScenario()I
    public int getScenario() {
        return mScenario;
    }
}