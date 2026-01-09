package com.mediatek.boostfwk;

import com.mediatek.boostfwk.scenario.BasicScenario;

public class BoostFwkManager {

    public static class ViewEvent {}
    public static class RefreshRate {}
    public static class IME {}
    public static class Message {}
    public static class Launch {}
    public static class Draw {}
    public static class Scroll {}

    public static final int BOOST_BEGIN = 0;
    public static final int BOOST_END = 1;
    public static final int UX_FRAME = 2;
    public static final int UX_IME = 5;
    public static final int UX_LAUNCH = 3;
    public static final int UX_MSG = 4;
    public static final int UX_REFRESHRATE = 6;
    public static final int UX_SCROLL = 1;
    public static final int UX_VIEWEVENT = 7;

    // .method public constructor blacklist <init>()V
    public BoostFwkManager() {
    }

    // .method public blacklist perfHint(Lcom/mediatek/boostfwk/scenario/BasicScenario;)V
    public void perfHint(BasicScenario scenario) {
    }

    // .method public varargs blacklist perfHint([Lcom/mediatek/boostfwk/scenario/BasicScenario;)V
    public void perfHint(BasicScenario... scenarios) {
    }
}