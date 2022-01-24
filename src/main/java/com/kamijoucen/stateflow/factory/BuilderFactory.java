package com.kamijoucen.stateflow.factory;

import com.kamijoucen.stateflow.builder.FlowBuilder;
import com.kamijoucen.stateflow.builder.StateBuilder;

public interface BuilderFactory {

    FlowBuilder flowBuilder();

    StateBuilder stateBuilder();

}
