package com.kamijoucen.stateflow.factory.impl;

import com.kamijoucen.stateflow.builder.FlowBuilder;
import com.kamijoucen.stateflow.builder.StateBuilder;
import com.kamijoucen.stateflow.builder.impl.FlowBuilderImpl;
import com.kamijoucen.stateflow.builder.impl.RulerStateFlowBuilder;
import com.kamijoucen.stateflow.builder.impl.StateBuilderImpl;
import com.kamijoucen.stateflow.factory.BuilderFactory;

public class DefaultBuilderFactoryImpl implements BuilderFactory {

    @Override
    public FlowBuilder getFlowBuilder(RulerStateFlowBuilder builder) {
        return new FlowBuilderImpl(builder);
    }

    @Override
    public StateBuilder getStateBuilder(RulerStateFlowBuilder builder) {
        return new StateBuilderImpl(builder);
    }
}