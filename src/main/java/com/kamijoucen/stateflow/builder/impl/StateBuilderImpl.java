package com.kamijoucen.stateflow.builder.impl;

import com.kamijoucen.stateflow.builder.StateBuilder;
import com.kamijoucen.stateflow.listener.ActionListener;
import com.kamijoucen.stateflow.node.RulerState;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StateBuilderImpl implements StateBuilder {

    private RulerStateFlowBuilder parentBuilder;
    private List<RulerState> states = new ArrayList<RulerState>();

    public StateBuilderImpl(RulerStateFlowBuilder parentBuilder) {
        this.parentBuilder = parentBuilder;
    }

    @Override
    public RulerStateFlowBuilder and() {
        return parentBuilder;
    }

    @Override
    public StateBuilder key(String state) {
        return null;
    }

    @Override
    public StateBuilder customValue(Map<String, String> busk) {
        return null;
    }

    @Override
    public StateBuilder listener(ActionListener listener) {
        return null;
    }
}
