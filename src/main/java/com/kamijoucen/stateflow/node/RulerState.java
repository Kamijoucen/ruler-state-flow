package com.kamijoucen.stateflow.node;

import java.util.Map;

public class RulerState {

    private int index;
    private String key;
    private int priority;
    private String skipExpression;
    private Map<String, String> customValue;

    public RulerState(String key, Map<String, String> customValue) {
        this.key = key;
        this.customValue = customValue;
    }

    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public String getSkipExpression() {
        return skipExpression;
    }
    public void setSkipExpression(String skipExpression) {
        this.skipExpression = skipExpression;
    }
    public Map<String, String> getCustomValue() {
        return customValue;
    }
    public void setCustomValue(Map<String, String> customValue) {
        this.customValue = customValue;
    }
}
