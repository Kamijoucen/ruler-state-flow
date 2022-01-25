package com.kamijoucen.stateflow.builder.impl;

import com.kamijoucen.stateflow.builder.FlowBuilder;
import com.kamijoucen.stateflow.builder.StateBuilder;
import com.kamijoucen.stateflow.config.RulerStateFlowConfiguration;
import com.kamijoucen.stateflow.node.StateFlowGraph;

import java.util.List;

public class RulerStateFlowBuilder {

    private RulerStateFlowConfiguration config;
    private List<FlowBuilder> flowBuilders;
    private List<StateBuilder> stateBuilders;

    private RulerStateFlowBuilder() {
    }

    public static RulerStateFlowBuilder builder(RulerStateFlowConfiguration config) {
        RulerStateFlowBuilder builder = new RulerStateFlowBuilder();
        builder.config = config;
        return builder;
    }

    public FlowBuilder withFlow() {
        FlowBuilder flowBuilder = config.getBuilderFactory().getFlowBuilder(this);
        flowBuilders.add(flowBuilder);
        return flowBuilder;
    }

    public StateBuilder withState() {
        StateBuilder stateBuilder = config.getBuilderFactory().getStateBuilder(this);
        stateBuilders.add(stateBuilder);
        return stateBuilder;
    }

    public List<FlowBuilder> getFlowBuilders() {
        return flowBuilders;
    }

    public List<StateBuilder> getStateBuilders() {
        return stateBuilders;
    }

    public StateFlowGraph build() {

        return null;
    }

}