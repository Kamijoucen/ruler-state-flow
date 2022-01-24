package com.kamijoucen.stateflow.node;

public class RulerFlow {

    private String source;
    private String target;
    private RulerCondition condition;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public RulerCondition getCondition() {
        return condition;
    }

    public void setCondition(RulerCondition condition) {
        this.condition = condition;
    }
}
