package com.kamijoucen.stateflow;

import com.kamijoucen.stateflow.builder.FlowBuilder;
import com.kamijoucen.stateflow.builder.StateBuilder;
import com.kamijoucen.stateflow.builder.impl.FlowBuilderImpl;
import com.kamijoucen.stateflow.builder.impl.StateBuilderImpl;
import com.kamijoucen.stateflow.node.StateFlowGraph;

import java.util.List;

public class RulerStateFlowBuilder {

    private List<FlowBuilder> flowBuilders;
    private List<StateBuilder> stateBuilders;

    private RulerStateFlowBuilder() {
    }

    public static RulerStateFlowBuilder builder() {
        return new RulerStateFlowBuilder();
    }

    public FlowBuilder withFlow() {
        FlowBuilder flowBuilder = new FlowBuilderImpl(this);
        flowBuilders.add(flowBuilder);
        return flowBuilder;
    }

    public StateBuilder withState() {
        StateBuilder stateBuilder = new StateBuilderImpl(this);
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