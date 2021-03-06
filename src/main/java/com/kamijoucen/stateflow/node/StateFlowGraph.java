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
    private Map<String, List<RulerFlow>> sourceFlowMapping;
    private Map<String, List<RulerFlow>> targetFlowMapping;

    public List<RulerState> getStates() {
        return states;
    }

    public void setStates(List<RulerState> states) {
        this.states = states;
    }

    public Map<String, RulerState> getKeyStateMapping() {
        return keyStateMapping;
    }

    public void setKeyStateMapping(Map<String, RulerState> keyStateMapping) {
        this.keyStateMapping = keyStateMapping;
    }

    public RulerState[] getIndexStateMapping() {
        return indexStateMapping;
    }

    public void setIndexStateMapping(RulerState[] indexStateMapping) {
        this.indexStateMapping = indexStateMapping;
    }

    public List<RulerFlow> getFlows() {
        return flows;
    }

    public void setFlows(List<RulerFlow> flows) {
        this.flows = flows;
    }

    public Map<String, List<RulerFlow>> getSourceFlowMapping() {
        return sourceFlowMapping;
    }

    public void setSourceFlowMapping(Map<String, List<RulerFlow>> sourceFlowMapping) {
        this.sourceFlowMapping = sourceFlowMapping;
    }

    public Map<String, List<RulerFlow>> getTargetFlowMapping() {
        return targetFlowMapping;
    }

    public void setTargetFlowMapping(Map<String, List<RulerFlow>> targetFlowMapping) {
        this.targetFlowMapping = targetFlowMapping;
    }
}