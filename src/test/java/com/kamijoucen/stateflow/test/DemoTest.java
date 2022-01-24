package com.kamijoucen.stateflow.test;

import com.kamijoucen.stateflow.builder.FlowBuilder;
import com.kamijoucen.stateflow.builder.StateBuilder;
import com.kamijoucen.stateflow.builder.impl.FlowBuilderImpl;
import com.kamijoucen.stateflow.builder.impl.StateBuilderImpl;

import org.junit.jupiter.api.Test;

public class DemoTest {

    @Test
    public void test1() {
        System.out.println("test");
    }

    @Test
    public void build_state_test() {
        StateBuilder build = new StateBuilderImpl();
    }

    @Test
    public void build_flow_test() {

        FlowBuilder builder = new FlowBuilderImpl();

    }

}
