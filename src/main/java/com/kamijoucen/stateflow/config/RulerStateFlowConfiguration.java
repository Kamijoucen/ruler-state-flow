package com.kamijoucen.stateflow.config;

import com.kamijoucen.stateflow.factory.BuilderFactory;
import com.kamijoucen.stateflow.factory.RunnerFactory;

public interface RulerStateFlowConfiguration {

    BuilderFactory getBuilderFactory();

    RunnerFactory getRunnerFactory();

}
