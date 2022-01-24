package com.kamijoucen.stateflow.builder;

import com.kamijoucen.stateflow.listener.ActionListener;

public interface StateBuilder {

    StateBuilder state(String state);

    StateBuilder state(String state, Object busk);

    StateBuilder state(String state, Object busObj, ActionListener listener);

}