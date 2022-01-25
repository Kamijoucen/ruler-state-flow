package com.kamijoucen.stateflow.runtime;

import java.util.Map;

public interface StateContext {

    int getCurrentIndex();

    void setCurrentIndex(int index);

    Map<String, String> getVariables();

    void setVariables();

}
