package com.kamijoucen.stateflow.config.impl;

import com.kamijoucen.stateflow.config.RulerStateFlowConfiguration;
import com.kamijoucen.stateflow.factory.BuilderFactory;
import com.kamijoucen.stateflow.factory.RunnerFactory;
import com.kamijoucen.stateflow.factory.impl.DefaultBuilderFactoryImpl;
import com.kamijoucen.stateflow.factory.impl.DefaultRunnerFactoryImpl;

public class DefaultRulerStateFlowConfiguration implements RulerStateFlowConfiguration {

    private BuilderFactory builderFactory;
    private RunnerFactory runnerFactory;

    public DefaultRulerStateFlowConfiguration() {
        initFactory();
    }

    private void initFactory() {
        this.builderFactory = new DefaultBuilderFactoryImpl();
        this.runnerFactory = new DefaultRunnerFactoryImpl();
    }

    @Override
    public BuilderFactory getBuilderFactory() {
        return builderFactory;
    }

    @Override
    public RunnerFactory getRunnerFactory() {
        return runnerFactory;
    }

    public void setBuilderFactory(BuilderFactory builderFactory) {
        this.builderFactory = builderFactory;
    }

    public void setRunnerFactory(RunnerFactory runnerFactory) {
        this.runnerFactory = runnerFactory;
    }
}
