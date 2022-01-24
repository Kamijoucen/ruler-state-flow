package com.kamijoucen.stateflow.builder.impl;

import java.util.ArrayList;
import java.util.List;

import com.kamijoucen.stateflow.builder.FlowBuilder;
import com.kamijoucen.stateflow.node.RulerCondition;
import com.kamijoucen.stateflow.node.RulerFlow;

public class FlowBuilderImpl implements FlowBuilder {

    private RulerFlow currentFlow = null;
    private List<RulerFlow> flows = new ArrayList<RulerFlow>();

    @Override
    public FlowBuilder and() {
        if (currentFlow == null) {
            return this;
        }
        this.flows.add(currentFlow);
        this.currentFlow = null;
        return this;
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
