package com.kamijoucen.stateflow.runtime.impl;

import com.kamijoucen.stateflow.node.StateFlowGraph;
import com.kamijoucen.stateflow.runtime.StateContext;
import com.kamijoucen.stateflow.runtime.StateFlowRunner;

public class StateFlowRunnerImpl implements StateFlowRunner {

    @Override
    public StateContext start(StateFlowGraph graph) {
        return null;
    }

    @Override
    public boolean next(StateContext context, StateFlowGraph graph) {
        return false;
    }

    @Override
    public boolean back(StateContext context, StateFlowGraph graph) {
        return false;
    }

    @Override
    public boolean backTo(String targetState, StateContext context, StateFlowGraph graph) {
        return false;
    }

}
