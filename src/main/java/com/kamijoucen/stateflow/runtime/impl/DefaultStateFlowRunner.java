package com.kamijoucen.stateflow.runtime.impl;

import com.kamijoucen.ruler.util.AssertUtil;
import com.kamijoucen.ruler.util.CollectionUtil;
import com.kamijoucen.ruler.util.IOUtil;
import com.kamijoucen.stateflow.node.RulerState;
import com.kamijoucen.stateflow.node.StateFlowGraph;
import com.kamijoucen.stateflow.runtime.StateContext;
import com.kamijoucen.stateflow.runtime.StateFlowRunner;
import com.kamijoucen.stateflow.util.NodeUtil;

import java.util.List;

public class DefaultStateFlowRunner implements StateFlowRunner {

    @Override
    public StateContext start(String startKey, StateFlowGraph graph) {
        StateContext context = new DefaultStateContext();
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
        RulerState currentState = NodeUtil.getState(context.getCurrentIndex(), graph);
        AssertUtil.notNull(currentState);

        List<RulerState> nextState = NodeUtil.getNextState(context.getCurrentIndex(), graph);
        if (CollectionUtil.isEmpty(nextState)) {
            return false;
        }
        for (RulerState state : nextState) {

        }
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
