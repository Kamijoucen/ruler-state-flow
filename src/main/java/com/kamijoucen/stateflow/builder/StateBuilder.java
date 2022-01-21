package com.kamijoucen.stateflow.builder;

public interface StateBuilder {

    StateBuilder state(String state);

    StateBuilder state(String state, Object busk);

}
