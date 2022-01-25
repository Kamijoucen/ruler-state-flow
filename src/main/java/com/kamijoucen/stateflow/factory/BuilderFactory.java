package com.kamijoucen.stateflow.factory;

import com.kamijoucen.stateflow.builder.FlowBuilder;
import com.kamijoucen.stateflow.builder.StateBuilder;
import com.kamijoucen.stateflow.builder.impl.RulerStateFlowBuilder;
import com.kamijoucen.stateflow.config.RulerStateFlowConfiguration;

public interface BuilderFactory {

    FlowBuilder getFlowBuilder(RulerStateFlowBuilder builder);

    StateBuilder getStateBuilder(RulerStateFlowBuilder builder);
}
