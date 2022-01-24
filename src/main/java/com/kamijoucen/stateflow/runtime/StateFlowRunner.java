package com.kamijoucen.stateflow.runtime;

import com.kamijoucen.stateflow.node.StateFlowGraph;

public interface StateFlowRunner {

    StateContext start(StateFlowGraph graph);

    boolean next(StateContext context, StateFlowGraph graph);

    boolean back(StateContext context, StateFlowGraph graph);

    boolean backTo(String targetState, StateContext context, StateFlowGraph graph);

}
