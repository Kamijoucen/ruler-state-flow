package com.kamijoucen.stateflow.runtime.impl;

import com.kamijoucen.stateflow.runtime.StateContext;

import java.util.Map;

public class DefaultStateContext implements StateContext {

    private int index;

    @Override
    public int getCurrentIndex() {
        return 0;
    }

    @Override
    public void setCurrentIndex(int index) {
    }

    @Override
    public Map<String, String> getVariables() {
        return null;
    }

    @Override
    public void setVariables() {
    }
}
