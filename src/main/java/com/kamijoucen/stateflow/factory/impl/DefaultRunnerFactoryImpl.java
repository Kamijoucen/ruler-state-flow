package com.kamijoucen.stateflow.factory.impl;

import com.kamijoucen.stateflow.factory.RunnerFactory;
import com.kamijoucen.stateflow.runtime.StateFlowRunner;
import com.kamijoucen.stateflow.runtime.impl.StateFlowRunnerImpl;

public class DefaultRunnerFactoryImpl implements RunnerFactory {
    @Override
    public StateFlowRunner getRunner() {
        return new StateFlowRunnerImpl();
    }
}
