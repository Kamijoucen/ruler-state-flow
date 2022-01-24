package com.kamijoucen.stateflow.node;

public class RulerState {

    private int index;
    private String key;
    private Object customValue;

    public RulerState() {
    }

    public RulerState(String key, Object customValue) {
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

    public Object getCustomValue() {
        return customValue;
    }

    public void setCustomValue(Object customValue) {
        this.customValue = customValue;
    }
}
