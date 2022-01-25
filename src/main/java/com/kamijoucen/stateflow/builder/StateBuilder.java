package com.kamijoucen.stateflow.builder;

import com.kamijoucen.stateflow.RulerStateFlowBuilder;
import com.kamijoucen.stateflow.listener.ActionListener;

import java.util.Map;

public interface StateBuilder {

    RulerStateFlowBuilder and();

    StateBuilder key(String state);

    StateBuilder customValue(Map<String, String> busk);

    StateBuilder listener(ActionListener listener);

}