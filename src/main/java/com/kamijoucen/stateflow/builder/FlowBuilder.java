package com.kamijoucen.stateflow.builder;

public interface FlowBuilder {

    FlowBuilder and();

    FlowBuilder source(String state);

    FlowBuilder target(String state);

    FlowBuilder condition(String text);

    FlowBuilder condition(String text, boolean isScript);

}
