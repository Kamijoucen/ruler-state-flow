package com.kamijoucen.stateflow.util;

import com.kamijoucen.ruler.util.AssertUtil;
import com.kamijoucen.ruler.util.CollectionUtil;
import com.kamijoucen.stateflow.node.RulerFlow;
import com.kamijoucen.stateflow.node.RulerState;
import com.kamijoucen.stateflow.node.StateFlowGraph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NodeUtil {

    public static List<RulerFlow> getNextFlow(int index, StateFlowGraph graph) {
        RulerState sourceState = NodeUtil.getState(index, graph);
        AssertUtil.notNull(sourceState);
        List<RulerFlow> targetFlows = graph.getSourceFlowMapping().get(sourceState.getKey());
        if (CollectionUtil.isEmpty(targetFlows)) {
            return Collections.emptyList();
        }
        return targetFlows;
    }


    public static List<RulerState> getNextState(String key, StateFlowGraph graph) {
        return null;
    }

    public static List<RulerState> getNextState(int index, StateFlowGraph graph) {
        List<RulerFlow> nextFlows = NodeUtil.getNextFlow(index, graph);
        if (CollectionUtil.isEmpty(nextFlows)) {
            return Collections.emptyList();
        }
        List<RulerState> states = new ArrayList<RulerState>(nextFlows.size());
        for (RulerFlow flow : nextFlows) {
            RulerState targetState = NodeUtil.getState(flow.getTarget(), graph);
            AssertUtil.notNull(targetState);
            states.add(targetState);
        }
        return states;
    }

    public static RulerState getState(String key, StateFlowGraph graph) {
        return graph.getKeyStateMapping().get(key);
    }

    public static RulerState getState(int index, StateFlowGraph graph) {
        return graph.getIndexStateMapping()[index];
    }

}
