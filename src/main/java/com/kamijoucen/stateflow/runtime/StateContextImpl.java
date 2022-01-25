package com.kamijoucen.stateflow.runtime;

import java.util.Map;

public class StateContextImpl implements StateContext {

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
