package com.kamijoucen.stateflow.runtime;

import com.kamijoucen.stateflow.node.StateFlowGraph;

public interface StateFlowRunner {

    StateContext start(StateFlowGraph graph);



}
