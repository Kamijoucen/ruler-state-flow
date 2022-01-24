package com.kamijoucen.stateflow.config.impl;

import com.kamijoucen.stateflow.config.RulerStateFlowConfiguration;
import com.kamijoucen.stateflow.factory.BuilderFactory;
import com.kamijoucen.stateflow.factory.impl.DefaultBuilderFactory;

public class DefaultRulerStateFlowConfiguration implements RulerStateFlowConfiguration {

    private BuilderFactory builderFactory;

    public DefaultRulerStateFlowConfiguration() {
        init();
    }

    private void init() {
        this.builderFactory = new DefaultBuilderFactory();
    }

    @Override
    public BuilderFactory getBuilderFactory() {
        return builderFactory;
    }
}
