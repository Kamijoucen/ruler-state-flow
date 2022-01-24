package com.kamijoucen.stateflow.builder.impl;

import com.kamijoucen.stateflow.builder.StateBuilder;
import com.kamijoucen.stateflow.listener.ActionListener;
import com.kamijoucen.stateflow.node.RulerState;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StateBuilderImpl implements StateBuilder {

    private int index = 0;
    private List<RulerState> states = new ArrayList<RulerState>();

    @Override
    public StateBuilder state(String state) {
        RulerState rulerState = new RulerState(state, null);
        rulerState.setIndex(index++);
        this.states.add(rulerState);
        return this;
    }

    @Override
    public StateBuilder state(String state, Map<String, String> busObj) {
        RulerState rulerState = new RulerState(state, busObj);
        rulerState.setIndex(index++);
        this.states.add(rulerState);
        return this;
    }

    @Override
    public StateBuilder state(String state, Map<String, String> busObj, ActionListener listener) {
        return null;
    }
}
