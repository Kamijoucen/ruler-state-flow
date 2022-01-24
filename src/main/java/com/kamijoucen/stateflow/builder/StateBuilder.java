package com.kamijoucen.stateflow.builder;

import com.kamijoucen.stateflow.listener.ActionListener;

import java.util.Map;

public interface StateBuilder {

    StateBuilder state(String state);

    StateBuilder state(String state, Map<String, String> busk);

    StateBuilder state(String state, Map<String, String> busObj, ActionListener listener);

}