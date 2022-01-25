package com.kamijoucen.stateflow.builder.impl;

import com.kamijoucen.stateflow.builder.FlowBuilder;
import com.kamijoucen.stateflow.node.RulerCondition;
import com.kamijoucen.stateflow.node.RulerFlow;

public class FlowBuilderImpl implements FlowBuilder {

    private final RulerStateFlowBuilder parentBuilder;
    private RulerFlow currentFlow = null;

    public FlowBuilderImpl(RulerStateFlowBuilder parentBuilder) {
        this.parentBuilder = parentBuilder;
    }

    @Override
    public RulerStateFlowBuilder and() {
        return parentBuilder;
    }

    @Override
    public FlowBuilder source(String state) {
        initCurrentFlow();
        this.currentFlow.setSource(state);
        return this;
    }

    @Override
    public FlowBuilder target(String state) {
        initCurrentFlow();
        this.currentFlow.setTarget(state);
        return this;
    }

    @Override
    public FlowBuilder condition(String text) {
        initCurrentFlow();
        this.currentFlow.setCondition(new RulerCondition(null, text));
        return this;
    }

    @Override
    public FlowBuilder condition(String text, boolean isScript) {
        initCurrentFlow();
        if (isScript) {
            this.currentFlow.setCondition(new RulerCondition(text, null));
        } else {
            this.currentFlow.setCondition(new RulerCondition(null, text));
        }
        return this;
    }

    private void initCurrentFlow() {
        if (this.currentFlow == null) {
            this.currentFlow = new RulerFlow();
        }
    }

}
