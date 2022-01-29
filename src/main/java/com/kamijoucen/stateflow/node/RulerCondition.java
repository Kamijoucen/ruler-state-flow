package com.kamijoucen.stateflow.node;

import com.kamijoucen.ruler.RuleRunner;
import com.kamijoucen.ruler.util.IOUtil;

public class RulerCondition {

    private RuleRunner runner;
    private String script;
    private String expression;

    public RulerCondition(String script, String expression) {
        this.script = script;
        this.expression = expression;
    }

    public boolean isExpression() {
        return IOUtil.isNotBlank(expression);
    }

    public boolean hasRunner() {
        return runner != null;
    }

    public String getScript() {
        return script;
    }
    public void setScript(String script) {
        this.script = script;
    }
    public String getExpression() {
        return expression;
    }
    public void setExpression(String expression) {
        this.expression = expression;
    }
    public RuleRunner getRunner() {
        return runner;
    }
    public void setRunner(RuleRunner runner) {
        this.runner = runner;
    }
}
