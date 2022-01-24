package com.kamijoucen.stateflow.builder.impl;

import com.kamijoucen.stateflow.builder.FlowBuilder;
import com.kamijoucen.stateflow.builder.StateBuilder;
import com.kamijoucen.stateflow.config.RulerStateFlowConfiguration;
import com.kamijoucen.stateflow.node.StateFlowGraph;

public class RulerStateFlowBuilder {

    private FlowBuilder flowBuilder;
    private StateBuilder stateBuilder;

    private RulerStateFlowBuilder() {
    }

    public static RulerStateFlowBuilder builder(RulerStateFlowConfiguration config) {
        RulerStateFlowBuilder builder = new RulerStateFlowBuilder();
        builder.flowBuilder = config.getBuilderFactory().flowBuilder();
        builder.stateBuilder = config.getBuilderFactory().stateBuilder();
        return builder;
    }

    public FlowBuilder getFlowBuilder() {
        return flowBuilder;
    }

    public StateBuilder getStateBuilder() {
        return stateBuilder;
    }

    public StateFlowGraph build() {
        return null;
    }
}