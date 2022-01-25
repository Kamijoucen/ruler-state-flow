package com.kamijoucen.stateflow.builder;

import com.kamijoucen.stateflow.RulerStateFlowBuilder;

public interface FlowBuilder {

    RulerStateFlowBuilder and();

    FlowBuilder source(String state);

    FlowBuilder target(String state);

    FlowBuilder condition(String text);

    FlowBuilder condition(String text, boolean isScript);

}
