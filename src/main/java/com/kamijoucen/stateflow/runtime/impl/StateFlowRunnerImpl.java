package com.kamijoucen.stateflow.runtime.impl;

import com.kamijoucen.ruler.util.IOUtil;
import com.kamijoucen.stateflow.config.RulerStateFlowConfiguration;
import com.kamijoucen.stateflow.node.RulerState;
import com.kamijoucen.stateflow.node.StateFlowGraph;
import com.kamijoucen.stateflow.runtime.StateContext;
import com.kamijoucen.stateflow.runtime.StateContextImpl;
import com.kamijoucen.stateflow.runtime.StateFlowRunner;
import com.kamijoucen.stateflow.util.NodeUtil;

public class StateFlowRunnerImpl implements StateFlowRunner {


    public StateFlowRunnerImpl() {
    }

    @Override
    public StateContext start(String startKey, StateFlowGraph graph) {
        StateContext context = new StateContextImpl();
        if (IOUtil.isNotBlank(startKey)) {
            context.setCurrentIndex(0);
        } else {
            RulerState state = NodeUtil.getState(startKey, graph);
            context.setCurrentIndex(state.getIndex());
        }
        return context;
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
