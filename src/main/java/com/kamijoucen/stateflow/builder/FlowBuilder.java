package com.kamijoucen.stateflow.builder;

public interface FlowBuilder {

    void build();

    FlowBuilder source(String state);

    FlowBuilder target(String state);

}
