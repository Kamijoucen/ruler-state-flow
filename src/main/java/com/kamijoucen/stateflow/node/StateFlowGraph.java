package com.kamijoucen.stateflow.node;

import java.util.List;
import java.util.Map;

public class StateFlowGraph {
    // state and mapping
    private List<RulerState> states;
    private Map<String, RulerState> keyStateMapping;
    private RulerState[] indexStateMapping;

    // flow and mapping
    private List<RulerFlow> flows;
    private Map<String, RulerFlow> sourceFlowMapping;
    private Map<String, RulerFlow> targetFlowMapping;



}