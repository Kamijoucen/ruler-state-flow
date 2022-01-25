package com.kamijoucen.stateflow.test;

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

        builder.withFlow()
                .source("A").target("B").condition("$a > 15").and()
                .withFlow()
                .source("B").target("C");

//        builder.withState().

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
