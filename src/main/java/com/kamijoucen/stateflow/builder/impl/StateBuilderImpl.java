package com.kamijoucen.stateflow.builder.impl;

import com.kamijoucen.stateflow.builder.StateBuilder;
import com.kamijoucen.stateflow.listener.ActionListener;
import com.kamijoucen.stateflow.node.State;

import java.util.ArrayList;
import java.util.List;

public class StateBuilderImpl implements StateBuilder {

    private List<State> states = new ArrayList<State>();

    @Override
    public StateBuilder state(String state) {
        return this;
    }

    @Override
    public StateBuilder state(String state, Object busObj) {
        return this;
    }

    @Override
    public StateBuilder state(String state, Object busObj, ActionListener listener) {
        return null;
    }
}
