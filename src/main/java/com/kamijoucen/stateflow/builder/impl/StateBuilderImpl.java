package com.kamijoucen.stateflow.builder.impl;

import com.kamijoucen.stateflow.builder.StateBuilder;
import com.kamijoucen.stateflow.listener.ActionListener;
import com.kamijoucen.stateflow.node.RulerState;

import java.util.ArrayList;
import java.util.List;

public class StateBuilderImpl implements StateBuilder {

    private List<RulerState> states = new ArrayList<RulerState>();

    @Override
    public StateBuilder state(String state) {
        this.states.add(new RulerState(state, null));
        return this;
    }

    @Override
    public StateBuilder state(String state, Object busObj) {
        this.states.add(new RulerState(state, busObj));
        return this;
    }

    @Override
    public StateBuilder state(String state, Object busObj, ActionListener listener) {
        return null;
    }
}
