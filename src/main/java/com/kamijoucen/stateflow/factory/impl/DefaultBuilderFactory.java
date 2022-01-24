package com.kamijoucen.stateflow.factory.impl;

import com.kamijoucen.stateflow.builder.FlowBuilder;
import com.kamijoucen.stateflow.builder.StateBuilder;
import com.kamijoucen.stateflow.builder.impl.FlowBuilderImpl;
import com.kamijoucen.stateflow.builder.impl.StateBuilderImpl;
import com.kamijoucen.stateflow.factory.BuilderFactory;

public class DefaultBuilderFactory implements BuilderFactory {

    @Override
    public FlowBuilder flowBuilder() {
        return new FlowBuilderImpl();
    }

    @Override
    public StateBuilder stateBuilder() {
        return new StateBuilderImpl();
    }
}