package com.kamijoucen.stateflow.test;

import com.kamijoucen.stateflow.builder.FlowBuilder;
import com.kamijoucen.stateflow.builder.impl.FlowBuilderImpl;

import com.kamijoucen.stateflow.builder.impl.RulerStateFlowBuilder;
import com.kamijoucen.stateflow.config.RulerStateFlowConfiguration;
import com.kamijoucen.stateflow.config.impl.DefaultRulerStateFlowConfiguration;
import com.kamijoucen.stateflow.node.StateFlowGraph;
import com.kamijoucen.stateflow.runtime.StateFlowRunner;
import org.junit.jupiter.api.Test;

public class DemoTest {

    public RulerStateFlowConfiguration config() {
        return new DefaultRulerStateFlowConfiguration();
    }

    @Test
    public void test1() {
        System.out.println("test");
    }

    @Test
    public void build_state_test() {
        RulerStateFlowBuilder builder = RulerStateFlowBuilder.builder(config());
        builder.getStateBuilder().state("A").state("B").state("C");
        builder.getFlowBuilder()
                .and().source("A").target("B").condition("$a >= 10")
                .and().source("B").target("C")
                .end();
        StateFlowGraph graph = builder.build();
        System.out.println(graph);
    }

    @Test
    public void run_test() {
        RulerStateFlowConfiguration config = config();

        StateFlowRunner runner = config.getRunnerFactory().getRunner();

//        runner.start()

    }

}
