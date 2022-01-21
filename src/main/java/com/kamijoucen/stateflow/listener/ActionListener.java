package com.kamijoucen.stateflow.listener;

public interface ActionListener {

    void beforeAction();

    void completeAction();

    void afterAction();

}